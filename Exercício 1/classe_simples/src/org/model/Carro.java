package org.model;

public class Carro {
    public String marca;
    protected String modelo;
    int ano;
    private Double preco;

    public Carro() {
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.preco = 0.0;

        }

    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Preço: " + this.preco);

    }
}


