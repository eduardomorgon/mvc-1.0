/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudo.mvc.controller;

import br.com.estudo.mvc.model.Agenda;
import br.com.estudo.mvc.service.AgendaService;
import java.util.List;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author eduardo
 */
@Controller
@Path("agendas")
public class AgendaController {
    
    @Inject
    private AgendaService service;
    
    @Inject
    private Models models;
    
    @GET
//    @View("teste.jsp")
    public String todos() {
        
        List<Agenda> todos = service.todos();
        models.put("agendas", todos);
        return "agenda/lista.html";
    }
    
    @GET
    @Path("form")
    public String form() {

        return "agenda/form.html";
    }
    
    @POST
    public String post(@BeanParam Agenda agenda) {
        
        service.salvar(agenda);
        return "redirect:agendas";
    }
    
//    @GET
//    @Path("carga")
//    public String carga() {
//        Agenda agenda = new Agenda("teste", "11-12345432");
//        service.salvar(agenda);
//        return "agenda/carga.html";
//    }
    
}
