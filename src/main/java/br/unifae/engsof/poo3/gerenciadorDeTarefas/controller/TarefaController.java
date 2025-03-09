package br.unifae.engsof.poo3.gerenciadorDeTarefas.controller;

import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.GerenciaTarefas;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.Tarefa;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaComPrazo;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaSimples;
import java.time.LocalDate;
import java.util.List;

public class TarefaController {

    private GerenciaTarefas gerenciaTarefas;

    public TarefaController() {
        this.gerenciaTarefas = new GerenciaTarefas();
    }

    public boolean addTarefaSimples(String descricao, int prioridade, LocalDate dataCriacao) {
        TarefaSimples tarefa = new TarefaSimples(descricao, prioridade, dataCriacao);
        return gerenciaTarefas.cadastrar(tarefa);
    }

    public boolean addTarefaComPrazo(String descricao, int prioridade, LocalDate dataCriacao, LocalDate prazo) {
        TarefaComPrazo tarefa = new TarefaComPrazo(descricao, prioridade, dataCriacao, prazo);
        return gerenciaTarefas.cadastrar(tarefa);
    }

    public boolean removeTarefa(Tarefa tarefa) {
        return gerenciaTarefas.removeTarefas(tarefa);
    }

    public List<Tarefa> getTarefas() {
        return gerenciaTarefas.getTarefas();
    }
}