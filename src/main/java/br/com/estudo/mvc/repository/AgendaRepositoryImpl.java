/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudo.mvc.repository;

import br.com.estudo.mvc.model.Agenda;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author eduardo
 */
@RequestScoped
public class AgendaRepositoryImpl implements AgendaRepository {
    
    @Inject
    private EntityManager em;

    @Override
    public void salvar(Agenda agenda) {
        em.getTransaction().begin();
        em.persist(agenda);
        em.getTransaction().commit();
    }

    @Override
    public void editar(Agenda agenda) {
        em.getTransaction().begin();
        em.merge(agenda);
        em.getTransaction().commit();
    }

    @Override
    public void excluir(Agenda agenda) {
        em.getTransaction().begin();
        em.remove(agenda);
        em.getTransaction().commit();
    }

    @Override
    public List<Agenda> todos() {
        return em.createQuery("SELECT a from Agenda a").getResultList();
    }
    
}
