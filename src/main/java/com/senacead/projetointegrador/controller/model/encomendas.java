/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senacead.projetointegrador.controller.model;

import java.util.Date;

/**
 *
 * @author mpfma
 */
public class encomendas {
    String nome; 
    Date dataEntrega; 
    String apartamento; 
    public String getNome() { return nome; } 
    public void setNome(String nome) { this.nome = nome; } 
    public String getApartamento() { return apartamento; } 
    public void setApartamento(String apartamento){ this.apartamento = apartamento; } 
    public Date getDataEntrega() { return dataEntrega; } 
    public void setDataEntrega(Date dataEntrega) { this.dataEntrega = dataEntrega; } 
}
