package org.example.conta;

import java.util.Scanner;

public class Conta {

    private Scanner scanner = new Scanner(System.in);
    private String usuario;
    private TipoDeConta tipoDeConta;
    private double saldo;

    public Conta(String usuario, TipoDeConta tipoDeConta, double saldo) {
        this.usuario = usuario;
        this.tipoDeConta = tipoDeConta;
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public TipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void consultarValores() {
        System.out.println("O saldo atual é R$ "+getSaldo()+"\n");
    }

    public void receberValor(){
        System.out.println("Informe o valor a receber: ");
        double valor = scanner.nextDouble();

        saldo += valor;

        System.out.println("Saldo atualizado R$ "+getSaldo());
    }

    public void transferirValor() {
        System.out.println("Informe o valor que deseja tranferir: ");
        double valor = scanner.nextDouble();

        if (valor<=saldo){
            saldo -= valor;
            System.out.println("Saldo atualizado R$ "+getSaldo());
        }else{
            System.out.println("Saldo insuficiente para transferência.\nSaldo atual: R$ "+getSaldo()+"\n");
        }
    }
}
