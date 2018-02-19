/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudo.mvc.repository;

import br.com.estudo.mvc.model.Contact;
import java.util.List;

/**
 *
 * @author eduardo
 */
public interface ContactRepository {
    
    void save(Contact agenda);
    void edit(Contact agenda);
    void delete(Contact agenda);
    List<Contact> all();
    Contact findOne(Integer id);
    
}
