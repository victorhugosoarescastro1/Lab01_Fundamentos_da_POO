package org.principal;

import org.model.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro();
        carro.exibirDetalhes();
    }

}
