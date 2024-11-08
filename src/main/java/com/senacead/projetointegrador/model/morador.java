/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senacead.projetointegrador.model;

/**
 *
 * @author mpfma
 */
public class morador implements cadastrar {
    String nome,apto,cpf;
    int id;
    
    
   public morador(){
     this.apto=apto;
     this.cpf=cpf;
     this.id=id;
     this.nome=nome;   
   } 
    
   @Override
   public void cadastrar(){
       
       
       
   }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApto() {
        return apto;
    }

    public void setApto(String apto) {
        this.apto = apto;
    }

    public int getId_morador() {
        return id;
    }

    public void setId_morador(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
