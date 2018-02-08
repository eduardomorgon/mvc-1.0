/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudo.mvc.service;

import br.com.estudo.mvc.model.Agenda;
import java.util.List;

/**
 *
 * @author eduardo
 */
public interface AgendaService {
    
    public void editar(Agenda agenda);
    public void salvar(Agenda agenda);
    public void excluir(Agenda agenda);
    public List<Agenda> todos();
    Agenda buscar(Integer id);
    
}
