
/**
 * Write a description of class CatalogoAutores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class CatalogoAutores
{
 private HashMap<String,Autor> catalogo;
 
 public CatalogoAutores(){
    
    catalogo=new HashMap<String,Autor>();
    
    }
  public CatalogoAutores(HashMap<String,Autor> catalog){
    catalogo.clear();
    Autor aux=new Autor();
    for(String s:catalogo.keySet()){
    aux=catalogo.get(s).clone();
    catalogo.put(s,aux);
    }
    }  
    public void InserirCatalogo(ArrayList<String> autores){
    String autor;
    Autor aux=new Autor();
    autor=autores.get(0);
    }
}
