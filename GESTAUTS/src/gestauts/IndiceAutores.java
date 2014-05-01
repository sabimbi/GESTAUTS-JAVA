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
    indice=new HashMap<>();
}

public IndiceAutores(HashMap<Integer,TreeSet<String>> index){
    this.indice.clear();
    
    
    for(int n:index.keySet()){
        indice.put(n,index.get(n));
        
        
    }}
public IndiceAutores(IndiceAutores index){
    
    indice.clear();
    indice=new HashMap<>();
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
}    


