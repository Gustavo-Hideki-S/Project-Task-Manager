/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raydekigtd;

import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author gusta
 */
public class TarefaRenderer implements ListCellRenderer<Tarefa> {

    @Override
    public Component getListCellRendererComponent(
            JList<? extends Tarefa> list,
            Tarefa tarefa,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {

        exibicaoTarefa painel =
                new exibicaoTarefa();

        painel.configurar(tarefa);

        return painel;
    }
}
