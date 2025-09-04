package org.model;

public class Cliente {
    protected String nome;
    String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;

    }

    public Cliente() {
        this.nome = "";
        this.cpf = "";

    }

    public void exibirDadosClientes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
}
