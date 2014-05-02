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
 * @author Freezer41
 */
public class GESTAUTS {
IndiceAutores autores;
Estatisticas stats;
public GESTAUTS(){
    autores=new IndiceAutores();
    stats=new Estatisticas();
}
public GESTAUTS(IndiceAutores index,Estatisticas estats){
    autores=index.clone();
    stats=estats.clone();
        
}
public GESTAUTS(GESTAUTS gest){
    autores=gest.autores.clone();
    stats=gest.stats.clone();
}

    void setTotalpublics(int lines) {
  stats.setTotalpublics(lines);
    }
    

    
    
}