
package com.senacead.projetointegrador.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mpfma
 */
public class listagemEncomenda {
    
    int id;
    String dataEntrega,nome, apartamento;
    
   public listagemEncomenda(){}
    
    public listagemEncomenda(int id, String dataEncomenda, String nome, 
            String apartamento){
      this.dataEntrega=dataEntrega;
      this.nome=nome;
      this.id=id;
      this.apartamento=apartamento;
        
        
    }
   

    public int getId_encomenda() {
        return id;
    }

    public void setId_encomenda(int id) {
        this.id=id;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
      
    
    
}
