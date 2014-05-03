
 

import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mesas
 */
public class Menu {

    private static IndiceAutores autores;
   private static Estatisticas stats;
   private static CatalogoAutores catalogo;
    private static int parserfile(String filename) {
        int lines = 0;
        try {
  // Open the file that is the first 
            // command line parameter
            FileInputStream fstream = new FileInputStream(filename);
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String linha;
            //Read File Line By Line
            while ((linha = br.readLine()) != null) {
                // Print the content on the console
                lines++;
                if(linha.equals("")==false){
                
                
                tratar_public(linha);}
            }
            //Close the input stream
            stats.setTotalpublics(lines);
            in.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

        return 1;
    }

    private static int menu() {
        int op = 1, r = 0;
        String filename;
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem Vindo ao GESTAUTS");
        System.out.println("1 - Ler ficheiro");
        System.out.println("15 - Sair");
        System.out.print("Opção: ");
        op = ler.nextInt();
        ler.nextLine();
        switch (op) {
            case 1: {
                System.out.print("Nome do ficheiro que quer ler: ");
        autores=null;
        stats=null;        
                stats=new Estatisticas();
        autores=new IndiceAutores();
        catalogo=new CatalogoAutores();
                filename = ler.nextLine().trim();

                stats.setUltimoficheirolido(filename);
                
                r = parserfile(filename);
                System.out.printf("%s",stats.toString());
                
                break;
            }
            case 15: {
                r = 0;
                break;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        
        int n = 1;
        while (n != 0) {
            n = menu();
        }

    }

    private static void tratar_public(String linha) {
        ArrayList<String> lista,coautores;
        String copia, autor;
        int ano;
        lista = new ArrayList<String>(Arrays.asList(linha.split(",")));
        coautores=new ArrayList<>();
        int i, n;
        n = lista.size();
        copia = linha;
            for (i = 0; i < n; i++) {
                autor = lista.get(i);
                autor=autor.trim();
                
                if(autores.VerificarAutor(autor)==false){
                autores.InserirAutor(autor);   
             stats.UpdateNomesLidos();
                }
                
              else{
               ano=Integer.parseInt(autor);
               stats.CalcularIntervalo(ano);
                 stats.UpdatePublicacoes(ano);
               
                }
            }
            for(i=1;i<n-1;i++){
                coautores.add(lista.get(i));
            }
            autor=lista.get(0);
            ano=Integer.parseInt(lista.get(i));
         InserirCatalogo(autor,coautores,ano);
        
            
 stats.setNtotalnomesdiferentes(autores.getNomesDiferentes());
    }

    private static void InserirCatalogo(String autor,ArrayList<String> coautores, int ano) {
    
    }
}
