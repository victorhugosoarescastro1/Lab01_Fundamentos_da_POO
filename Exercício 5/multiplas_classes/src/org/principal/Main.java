package org.principal;

import org.model.Cliente;
import org.model.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria("303033", 36786780);
        Cliente cliente1 = new Cliente("Seu José", "999.999.010-97");

        conta1.exibirSaldo();
        cliente1.exibirDadosClientes();
    }
}
