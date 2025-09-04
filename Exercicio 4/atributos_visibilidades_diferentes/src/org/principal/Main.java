package org.principal;

import org.model.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno1 = new Aluno("Roberto Carlos", 999 , "500000000.0", "Musical");
        Aluno aluno2 = new Aluno();

        System.out.println("||================================================================================||");
        aluno1.exibirInformacoes();
        System.out.println("||================================================================================||");
        aluno2.exibirInformacoes();
    }
}
