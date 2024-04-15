/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package com.mycompany.gerenciabanco2;



/**
 *
 * @author valmi
 */

import java.util.Scanner;

public class GerenciaBanco2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.println("Bem-vindo ao Gerenciamento Bancário!");

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.next().charAt(0); // Lê apenas o primeiro caractere da entrada do usuário
            switch (opcao) {
                case 'a' -> realizarTransacao(banco);
                case 'b' -> AplicarBanco.main(null); // Chama o método main da classe AplicarBanco para lidar com o investimento
                case 'x' -> System.out.println("Obrigado por utilizar nosso serviço!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 'x');
    }

    public static void exibirMenu() {
        System.out.println("\nSelecione o tipo de transação:");
        System.out.println("a) Transação comum");
        System.out.println("b) Investimento");
        System.out.println("x) Sair");
        System.out.print("Opção: ");
    }

    public static void realizarTransacao(Banco banco) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nTransação comum selecionada:");
        System.out.println("Escolha a operação:");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Realizar depósito");
        System.out.println("3 - Realizar saque");
        System.out.println("4 - Voltar ao menu principal");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1 -> banco.consultarSaldo();
            case 2 -> banco.realizarDeposito();
            case 3 -> banco.realizarSaque();
            case 4 -> {
            }
            default -> System.out.println("Opção inválida. Tente novamente.");
        }
        // Nada a fazer, pois o loop do menu principal continuará
            }
}
