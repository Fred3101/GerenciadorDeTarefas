/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cimam
 */
public class GerenciaTarefas {
    
    private static List<Tarefa> tarefas =
            null;
    
    public GerenciaTarefas(){
        if(tarefas==null){
            tarefas =
            new ArrayList<Tarefa>();
    
        }
    }
    
    public static boolean cadastrar(Tarefa tarefa){
        if(tarefa!=null)
            if(!(tarefas.contains(tarefa)))
                return tarefas.add(tarefa);
        
       return false;
    } 
    public static  List<Tarefa> getTarefas(){
        return tarefas;
    }
    public static boolean removeTarefas(Tarefa tarefa){
        if(tarefa!=null)
            return tarefas.remove(tarefa);
        return false;
    }
}
