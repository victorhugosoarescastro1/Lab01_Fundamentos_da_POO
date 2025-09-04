package org.model;

public class Carro {
    public String marca;
    protected String modelo;
    int ano;
    private Double preco;

    public Carro(String marca, String modelo, int ano, Double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Preço: " + this.preco);

    }
}


