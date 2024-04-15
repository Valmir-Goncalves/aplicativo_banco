/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;

/**
 *
 * @author valmi
 */
import java.util.Scanner;

public class GerenciaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.println("Bem-vindo ao Gerenciamento Bancário!");

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> banco.cadastrarCliente();
                case 2 -> banco.consultarSaldo();
                case 3 -> banco.realizarDeposito();
                case 4 -> banco.realizarSaque();
                case 5 -> System.out.println("Obrigado por utilizar nosso serviço!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    public static void exibirMenu() {
        System.out.println("\nSelecione uma opção:");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Consultar Saldo");
        System.out.println("3 - Realizar Depósito");
        System.out.println("4 - Realizar Saque");
        System.out.println("5 - Encerrar");
        System.out.print("Opção: ");
    }
}

