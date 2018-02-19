/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudo.mvc.service;

import br.com.estudo.mvc.model.Contact;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import br.com.estudo.mvc.repository.ContactRepository;

/**
 *
 * @author eduardo
 */
@RequestScoped
public class ContactServiceImpl implements ContactService {
    
    @Inject
    private ContactRepository repository;

    @Override
    public void save(Contact contact) {
        
        if(contact.getId() == null) {
            repository.save(contact);
        }else{
            repository.edit(contact);
        }
    }

    @Override
    public void delete(Contact contact) {
        
        repository.delete(contact);
    }

    @Override
    public List<Contact> all() {
        
        return repository.all();
    }
    
    @Override
    public Contact findOne(Integer id) {
        
        return repository.findOne(id);
    }
    
}
