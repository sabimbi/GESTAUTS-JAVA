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

    public Estatisticas(String ultimoficheirolido, int ntotalnomeslidos, int totalpublics, int ntotalnomesdiferentes) {
        this.ultimoficheirolido = ultimoficheirolido;
        this.ntotalnomeslidos = ntotalnomeslidos;
        this.totalpublics = totalpublics;
        this.ntotalnomesdiferentes = ntotalnomesdiferentes;
    }

    public Estatisticas() {
        this.ultimoficheirolido="";
        this.ntotalnomesdiferentes=this.totalpublics=this.ntotalnomeslidos=0;
    }
    public Estatisticas(Estatisticas stats){
       this.ultimoficheirolido=stats.getUltimoficheirolido(); 
       this.ntotalnomesdiferentes=stats.getNtotalnomesdiferentes();
       this.ntotalnomeslidos=stats.getNtotalnomeslidos();
       this.totalpublics=stats.getTotalpublics();
       
       
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
    
}
