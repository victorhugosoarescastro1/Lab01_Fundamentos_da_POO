package org.model;

public class ContaBancaria {
    public String NumeroConta;
    private double Saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        NumeroConta = numeroConta;
        Saldo = saldo;
    }

    public ContaBancaria() {
        NumeroConta = "";
        Saldo = 0.0;
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + this.Saldo);
    }
}
