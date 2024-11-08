/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senacead.projetointegrador.model;

/**
 *
 * @author mpfma
 */
public class reserva {
    
    String lazer,data;
    String id_morador;
    
    
    
    public reserva(){
       this.data=data;
       this.lazer=lazer;
       this.id_morador=id_morador;
        
    }
    
   

    public String getLazer() {
        return lazer;
    }

    public void setLazer(String lazer) {
        this.lazer = lazer;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getId_morador() {
        return id_morador;
    }

    public void setId_morador(String id_morador) {
        this.id_morador = id_morador;
    }
}
