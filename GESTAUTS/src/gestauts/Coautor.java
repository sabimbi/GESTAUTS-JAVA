
/**
 * Write a description of class Coautor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coautor
{
    String coautor;
    int npublics;
    public Coautor(){
    coautor="";
    npublics=0;
    
    }
    public Coautor(String coautor,int npublics){
    this.coautor=coautor;
    this.npublics=npublics;
    }
    public Coautor(Coautor c){
    this.coautor=c.getNome();
    this.npublics=c.getNpublics();
    
    }
    public Coautor clone(){
    return new Coautor(this);
    }
    public String getNome(){
    return this.coautor;
    }
    public int getNpublics(){
    return this.npublics;
    
    }
}
