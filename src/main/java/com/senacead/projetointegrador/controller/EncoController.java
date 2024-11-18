
package com.senacead.projetointegrador.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.List;
import java.util.ArrayList;
import com.senacead.projetointegrador.model.listagemEncomenda;
import java.util.stream.Collectors;




@Controller
public class EncoController {
    private List<listagemEncomenda> encomendas = new ArrayList<>();
   
    
    @GetMapping("/encomendas")
    public String listaEncomenda(Model model) {
        if (encomendas.isEmpty()) {
            encomendas.add(new listagemEncomenda(1,"27/08/2024","Joana","403 b"));
                
            encomendas.add(new listagemEncomenda(2,"15/10/2024","Pedro","505 a")); 
                
        }
        model.addAttribute("encomendas", encomendas);
        return "encomendas";
    }
    
    @GetMapping("/cadastroe")
    public String cadastrandoEncomenda(Model model) {  
        model.addAttribute("encomenda", new listagemEncomenda()); 
        return "cadastroe"; 
    } 
    
    @PostMapping("/cadastroe")
    public String processarFormulario(@ModelAttribute listagemEncomenda encomenda, Model model) {
        int id_encomenda = encomendas.size() + 1;

        encomendas.add(encomenda);

        return "redirect:/encomendas";
    }}
    
    
