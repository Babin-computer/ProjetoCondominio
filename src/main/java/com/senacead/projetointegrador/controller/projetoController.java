/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senacead.projetointegrador.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;
            @Controller 
public class projetoController {
    @GetMapping("/saudacao") 
public String mostraSaudacao(){ 
 return "saudacao"; } 
}
