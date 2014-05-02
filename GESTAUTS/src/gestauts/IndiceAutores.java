/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestauts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Freezer41
 */
public class IndiceAutores {
    private HashMap<Integer,TreeSet<String>> indice;

public IndiceAutores(){
    indice=new HashMap<Integer,TreeSet<String>>(200);
}

public IndiceAutores(HashMap<Integer,TreeSet<String>> index){
    this.indice.clear();
    
    
    for(int n:index.keySet()){
        indice.put(n,index.get(n));
        
        
    }}
public IndiceAutores(IndiceAutores index){
    
    indice.clear();
    indice=new HashMap<Integer,TreeSet<String>>();
    for(int n:index.indice.keySet()){
        indice.put(n, index.indice.get(n));
    }
}

public IndiceAutores clone(){
    return new IndiceAutores(this);
}
public boolean equals(Object o){
    boolean op=false;
    if(this==o){
        op=true;
    }
    if(o==null || this.getClass()!=o.getClass()){
        op=false;
    }
    IndiceAutores aux= (IndiceAutores)o;
    if(SaoIguais(this.indice,aux.indice)==true){
        op=true;
    }
    return op;
}

    private boolean SaoIguais(HashMap<Integer, TreeSet<String>> indice, HashMap<Integer, TreeSet<String>> index) {
        ArrayList<TreeSet<String>> aux1,aux2;
         aux1=new ArrayList<TreeSet<String>>();
         aux2=new ArrayList<TreeSet<String>>();
         for(int n:indice.keySet()){
             aux1.add(indice.get(n));
         }
         for(int n:index.keySet()){
             aux2.add(indice.get(n));
         }
         return(aux1.containsAll(aux2));
    }

    public void InserirAutor(String autor) {
    String aux;
    int index=0;
    TreeSet<String> autores=new TreeSet<String>();
    aux=autor;
    aux=aux.toLowerCase();
    index=aux.charAt(0)-97;
    
    if(indice.get(index)==null){
        autores.add(autor);
        indice.put(index, autores);
    }else{
    autores=indice.get(index);
    autores.add(autor);
    indice.put(index, autores);
    }   
    
    }

   public boolean ExisteAutor(String author) {
       String aux=new String();
    int index=0;
    TreeSet<String> autores=new TreeSet<String>();
    aux=author;
    aux=aux.toLowerCase();
    
    index=aux.charAt(0)-97;
    autores=indice.get(index);
    
    return (autores.contains(author));
    }
public int getNomesDiferentes(){
    int soma=0;
    TreeSet<String> aux =new TreeSet<String>();
    for(int n:indice.keySet()){
        aux=indice.get(n);
        soma+=aux.size();
    }
return soma;
}

    public boolean VerificarAutor(String autor) {
        
        for(char c:autor.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

}    


