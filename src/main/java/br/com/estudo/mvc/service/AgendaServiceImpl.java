/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudo.mvc.service;

import br.com.estudo.mvc.model.Agenda;
import br.com.estudo.mvc.repository.AgendaRepository;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author eduardo
 */
@RequestScoped
public class AgendaServiceImpl implements AgendaService {
    
    @Inject
    private AgendaRepository repository;

    @Override
    public void editar(Agenda agenda) {
        repository.editar(agenda);
    }

    @Override
    public void salvar(Agenda agenda) {
        repository.salvar(agenda);
    }

    @Override
    public void excluir(Agenda agenda) {
        repository.excluir(agenda);
    }

    @Override
    public List<Agenda> todos() {
        return repository.todos();
    }
    
    @Override
    public Agenda buscar(Integer id) {
        return repository.buscar(id);
    }
    
}
