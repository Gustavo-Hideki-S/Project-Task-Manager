/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raydekigtd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class TarefaManager {
    private List<Tarefa> tarefas;
    
    public TarefaManager() {
        tarefas = new ArrayList<>();
    }
    
    public void adicionar(Tarefa tarefa) {
        tarefas.add(tarefa);
    }
    
    public void remover (Tarefa tarefa) {
        tarefas.remove(tarefa);
    }
    
    public List<Tarefa> getTarefas() {
        return tarefas;
    }
}
