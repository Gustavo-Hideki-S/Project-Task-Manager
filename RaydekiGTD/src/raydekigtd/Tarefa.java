/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raydekigtd;

import java.time.LocalDate;

/**
 *
 * @author gusta
 */
public class Tarefa {

    public enum Status {
        TODO,
        DOING,
        DONE
    }

    private String nome;
    private String descricao;
    private LocalDate data;
    private Status status;

    public Tarefa(String nome, String descricao, LocalDate data, Status status) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return nome;
    }
}