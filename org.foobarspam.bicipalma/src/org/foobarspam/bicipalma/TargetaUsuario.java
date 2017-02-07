/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.bicipalma;

/**
 *
 * @author Josep Mesquida
 */
public class TargetaUsuario {
    
    private int id;
    private boolean activada;
    
    private void setId(int id){
        this.id = id;
        
    }
    
    private void setActivada(boolean activada){
        this.activada = activada;
        
    }
    
    public int getId(){
        return this.id;
    }
    
    public boolean getActivada(){
        return this.activada;
    }
    
}
