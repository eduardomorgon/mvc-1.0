/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudo.mvc;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author eduardo
 */
@Controller
@Path("ola")
public class TesteController {
    
    @Inject
    private Models models;
    
    @GET
//    @View("teste.jsp")
    public String teste() {
        
        System.out.println("passei aqui2!");
        models.put("mensagem", "ola estou aqui com thymeleaf 123");
        return "ola";
    }
    
    
}
