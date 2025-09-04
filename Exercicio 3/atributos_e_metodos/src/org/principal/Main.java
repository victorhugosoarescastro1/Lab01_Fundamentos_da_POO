package org.principal;

import org.model.Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro = new Livro("O pequeno Principe", "Antoine", 30.0, 210);
        livro.detalhesDoLivro();
    }
}
