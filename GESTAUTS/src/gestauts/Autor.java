
/**
 * Write a description of class Autor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.TreeSet;
public class Autor
{
  private String nome;
  private int[] npublics;
  private TreeSet<Coautor> coautores;  
  
  public Autor(){
 nome="";
npublics=new int[100];
coautores=new TreeSet<Coautor>();
coautores=null;
}
public String getNome(){
return this.nome;
}
public int[] getNpublics(){
int[] copia;
int i;
copia=new int[100];
for(i=0;i<100;i++){
copia[i]=npublics[i];
}
return copia;

}
public TreeSet<Coautor> getCoautores(){
TreeSet<Coautor> aux=new TreeSet<Coautor>();
aux=null;
for(Coautor c:coautores){
aux.add(c);
}
return aux;
}
public Autor(Autor a){
this.nome=a.getNome();
this.npublics=a.getNpublics();
this.coautores=a.getCoautores();

}
public Autor clone(){
return new Autor(this);

}
}
