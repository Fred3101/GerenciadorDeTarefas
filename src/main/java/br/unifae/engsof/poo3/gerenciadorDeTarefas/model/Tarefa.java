package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

import java.time.LocalDate;

/**
 * Classe abstrata que representa uma tarefa.
 */
public abstract class Tarefa implements Prioritizavel {

    private String descricao;
    private boolean concluida;
    private int prioridade;
    private LocalDate dataCriacao;

    public Tarefa() {
    }

    public Tarefa(String descricao, int prioridade, LocalDate dataCriacao) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
        this.concluida = false;
    }

    @Override
    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Tarefa: " +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                ", prioridade=" + prioridade +
                ", dataCriacao=" + dataCriacao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Tarefa)) return false;

        Tarefa tarefa = (Tarefa) obj;

        if (concluida != tarefa.concluida) return false;
        if (prioridade != tarefa.prioridade) return false;
        if (!descricao.equals(tarefa.descricao)) return false;
        return dataCriacao.equals(tarefa.dataCriacao);
    }
}