/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudo.mvc.repository;

import br.com.estudo.mvc.model.Contact;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author eduardo
 */
@RequestScoped
public class ContactRepositoryImpl implements ContactRepository {
    
    @Inject
    private EntityManager em;

    @Override
    public void save(Contact contact) {
        em.getTransaction().begin();
        em.persist(contact);
        em.getTransaction().commit();
    }

    @Override
    public void edit(Contact contact) {
        em.getTransaction().begin();
        em.merge(contact);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Contact contact) {
        em.getTransaction().begin();
        em.remove(contact);
        em.getTransaction().commit();
    }

    @Override
    public List<Contact> all() {
        return em.createQuery("SELECT c from Contact c").getResultList();
    }

    @Override
    public Contact findOne(Integer id) {
        return em.find(Contact.class, id);
    }
    
}
