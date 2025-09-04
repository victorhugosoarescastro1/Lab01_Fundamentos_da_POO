package org.model;

public class Aluno {

    public String matricula;
    protected String nome;
    String curso;
    private int idade;


    public Aluno() {
        this.nome = "";
        this.idade = 0;
        this.matricula = "";
        this.curso = "";
    }
    public Aluno(String nome, int idade, String matricula, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = "";
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
    }
}

