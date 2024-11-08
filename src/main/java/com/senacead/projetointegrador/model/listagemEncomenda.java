
package com.senacead.projetointegrador.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mpfma
 */
public class listagemEncomenda {
    
int id_encomenda;
    String dataEntrega,nome;
    
    
    
    public listagemEncomenda(){
      this.dataEntrega=dataEntrega;
      this.nome=nome;
      this.id_encomenda=id_encomenda;
        
        
    }
     private static final List<listagemEncomenda> lista = new ArrayList<>();

      // Métodos para acessarmos a lista e adicionarmos novos itens
      public static List<listagemEncomenda> Listar() {
          return lista;
      }
      
      public static void Adicionar(listagemEncomenda enc) {
          lista.add(enc);
      }
      
      public static void atualizar(int id, listagemEncomenda pac){
        lista.set(id, pac);
        
    }

    public int getId_encomenda() {
        return id_encomenda;
    }

    public void setId_encomenda(int id_encomenda) {
        this.id_encomenda = id_encomenda;
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
