/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudo.mvc.service;

import br.com.estudo.mvc.model.Contact;
import java.util.List;

/**
 *
 * @author eduardo
 */
public interface ContactService {
    
    public void save(Contact contact);
    public void delete(Contact contact);
    public List<Contact> all();
    Contact findOne(Integer id);
    
}
