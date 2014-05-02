/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestauts;

import java.io.*;

import java.util.Scanner;

/**
 *
 * @author Mesas
 */
public class Menu {
    private static GESTAUTS gestao;
    public static int parserfile(String filename) {
       int lines=0;
        try{
  // Open the file that is the first 
  // command line parameter
  FileInputStream fstream = new FileInputStream(filename);
  // Get the object of DataInputStream
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String linha;
  //Read File Line By Line
  while ((linha = br.readLine()) != null)   {
  // Print the content on the console
  lines++;
  tratar_public(linha);
  }
  //Close the input stream
  gestao.setTotalpublics(lines);
  System.out.println("Nº de publicações: "+gestao.stats.getTotalpublics());
  in.close();
    }catch (Exception e){//Catch exception if any
  System.err.println("Error: " + e.getMessage());
  }
  
return 1;
    }
    
    private static int menu(){
    int op=1,r=0;
    String filename;
    Scanner ler=new Scanner(System.in);
    System.out.println("Bem Vindo ao GESTAUTS");
    System.out.println("1 - Ler ficheiro");
    System.out.println("15 - Sair");
    System.out.print("Opção: ");
    op=ler.nextInt();
    ler.nextLine();
    switch(op){
        case 1:{
            System.out.print("Nome do ficheiro que quer ler: ");
            
            filename=ler.nextLine().trim();
            
            System.out.printf("Ficheiro lido: %s\n",filename);
          r=parserfile(filename);
           break;
        }
        case 15:{
            r=0;
            break;
        }
    }
    return r;
    }
    public static void main(String[] args) {
       gestao=new GESTAUTS();
        int n=1;
       while(n!=0){
           n=menu();
       }
       
    }

    private static void tratar_public(String linha) {
        
    }
    
}


