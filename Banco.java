/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco;

/**
 *
 * @author valmi
 */



import java.util.Scanner;

public class Banco {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;

    private Scanner scanner = new Scanner(System.in); // Movido para ser um campo da classe

    public void cadastrarCliente() {
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.print("Digite seu CPF: ");
        cpf = scanner.nextLine();
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void realizarDeposito() {
        System.out.print("Digite o valor do depósito: ");
        double valor = scanner.nextDouble();
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void realizarSaque() {
        System.out.print("Digite o valor do saque: ");
        double valor = scanner.nextDouble();
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }
}
