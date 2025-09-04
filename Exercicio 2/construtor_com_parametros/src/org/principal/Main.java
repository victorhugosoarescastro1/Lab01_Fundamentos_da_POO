package org.principal;

import org.model.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro esportivo = new Carro("Mclaren", "Gran Turismo", 2022, 3000000.0  );
        esportivo.exibirDetalhes();
    }

}
