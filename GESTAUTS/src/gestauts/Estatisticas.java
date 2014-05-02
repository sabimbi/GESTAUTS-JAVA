/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestauts;

/**
 *
 * @author Freezer41
 */
public class Estatisticas {
    private String ultimoficheirolido;
    private int ntotalnomeslidos;
    private int totalpublics;
    private int ntotalnomesdiferentes;
    private int maxano;
    private int minano;
    public Estatisticas(String ultimoficheirolido, int ntotalnomeslidos, int totalpublics, int ntotalnomesdiferentes,int maxano,int minano) {
        this.ultimoficheirolido = ultimoficheirolido;
        this.ntotalnomeslidos = ntotalnomeslidos;
        this.totalpublics = totalpublics;
        this.ntotalnomesdiferentes = ntotalnomesdiferentes;
        this.maxano=maxano;
        this.minano=minano;
    }

    public Estatisticas() {
        this.ultimoficheirolido="";
        this.ntotalnomesdiferentes=this.totalpublics=this.ntotalnomeslidos=this.maxano=0;
        this.minano=3000;
    }
    public Estatisticas(Estatisticas stats){
       this.ultimoficheirolido=stats.getUltimoficheirolido(); 
       this.ntotalnomesdiferentes=stats.getNtotalnomesdiferentes();
       this.ntotalnomeslidos=stats.getNtotalnomeslidos();
       this.totalpublics=stats.getTotalpublics();
       this.maxano=stats.getMaxAno();
       this.minano=stats.getMinAno();
       
    }
    public Estatisticas clone(){
        return new Estatisticas(this);
    }
    public boolean equals(Object o){
        boolean op=false;
        if(this==o){
            op=true;
        }
        if(o==null || this.getClass()!=o.getClass()){
            op=false;
        }
        Estatisticas stats=(Estatisticas)o;
    if(this.getNtotalnomesdiferentes()==stats.getNtotalnomesdiferentes() && this.getUltimoficheirolido()==stats.getUltimoficheirolido() && this.getNtotalnomeslidos()==stats.getNtotalnomeslidos() && this.getTotalpublics()==stats.getTotalpublics()){
    op=true;    
    }
    return op;
    }

    /**
     * @return the ultimoficheirolido
     */
    public String getUltimoficheirolido() {
        return ultimoficheirolido;
    }

    /**
     * @param ultimoficheirolido the ultimoficheirolido to set
     */
    public void setUltimoficheirolido(String ultimoficheirolido) {
        this.ultimoficheirolido = ultimoficheirolido;
    }

    /**
     * @return the ntotalnomeslidos
     */
    public int getNtotalnomeslidos() {
        return ntotalnomeslidos;
    }

    /**
     * @param ntotalnomeslidos the ntotalnomeslidos to set
     */
    public void setNtotalnomeslidos(int ntotalnomeslidos) {
        this.ntotalnomeslidos = ntotalnomeslidos;
    }

    /**
     * @return the totalpublics
     */
    public int getTotalpublics() {
        return totalpublics;
    }

    /**
     * @param totalpublics the totalpublics to set
     */
    public void setTotalpublics(int totalpublics) {
        this.totalpublics = totalpublics;
    }

    /**
     * @return the ntotalnomesdiferentes
     */
    public int getNtotalnomesdiferentes() {
        return ntotalnomesdiferentes;
    }

    /**
     * @param ntotalnomesdiferentes the ntotalnomesdiferentes to set
     */
    public void setNtotalnomesdiferentes(int ntotalnomesdiferentes) {
        this.ntotalnomesdiferentes = ntotalnomesdiferentes;
    }

    public void UpdateNomesDiferentes() {
        this.ntotalnomesdiferentes++;
    }

    public void UpdateNomesLidos() {
        this.ntotalnomeslidos++;
    }

    public String toString(){
        StringBuilder s=new StringBuilder();
        s.append("Ultimo ficheiro lido: "+this.getUltimoficheirolido()+"\n");
        s.append("Nº de Publicações: "+this.getTotalpublics()+"\n");
        s.append("Nº de Autores lidos: "+this.getNtotalnomeslidos()+"\n");
        s.append("Nº de Autores Distintos: "+this.getNtotalnomesdiferentes()+"\n");
        s.append("Anos: ["+this.getMinAno()+" a "+this.getMaxAno()+"]\n");
        return s.toString();
    }

    private int getMinAno() {
        return this.minano;
    }

    private int getMaxAno() {
        return this.maxano;
    }

   public void CalcularIntervalo(int ano) {
        if(ano>this.maxano){
            this.maxano=ano;
        }else{
            if(ano<this.maxano && ano<this.minano){
                this.minano=ano;
            }
        }
    }

    /**
     * @param maxano the maxano to set
     */
    public void setMaxano(int maxano) {
        this.maxano = maxano;
    }

    /**
     * @param minano the minano to set
     */
    public void setMinano(int minano) {
        this.minano = minano;
    }

    
   
}
