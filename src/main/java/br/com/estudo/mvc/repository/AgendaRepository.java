/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudo.mvc.repository;

import br.com.estudo.mvc.model.Agenda;
import java.util.List;

/**
 *
 * @author eduardo
 */
public interface AgendaRepository {
    
    void salvar(Agenda agenda);
    void editar(Agenda agenda);
    void excluir(Agenda agenda);
    List<Agenda> todos();
    
}
