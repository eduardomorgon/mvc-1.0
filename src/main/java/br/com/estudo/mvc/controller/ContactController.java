/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudo.mvc.controller;

import br.com.estudo.mvc.model.Contact;
import java.util.List;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import br.com.estudo.mvc.service.ContactService;

/**
 *
 * @author eduardo
 */
@Controller
@Path("contacts")
public class ContactController {
    
    private final ContactService service;
    private final Models models;

    @Inject
    public ContactController(ContactService service, Models models) {
        this.service = service;
        this.models = models;
    }
    
    @GET
//    @View("")
    public String list() {
        
        List<Contact> all = service.all();
        models.put("contacts", all);
        return "contact/list.html";
    }
    
    @GET
    @Path("form")
    public String form() {

        models.put("contact", new Contact());
        return "contact/form.html";
    }
    
    @POST
    public String post(@BeanParam Contact contact) {
        
        service.save(contact);
        return "redirect:contacts";
    }
    
    @GET
    @Path("{id}/delete")
    public String delete(@PathParam("id") Integer id) {
        
        Contact contact = service.findOne(id);
        service.delete(contact);
        return "redirect:contacts";
    }
    
    @GET
    @Path("{id}")
    public String detail(@PathParam("id") Integer id) {
        
        Contact contact = service.findOne(id);
        models.put("contact", contact);
        return "contact/form.html";
    }
    
}
