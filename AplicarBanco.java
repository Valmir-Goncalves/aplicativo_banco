/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco2;
import com.mycompany.gerenciabanco2.ContaBancoUtils;

/**
 *
 * @author Valmir
 */

import java.util.Scanner;

public class AplicarBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();

        System.out.println("Bem-vindo ao Módulo de Investimentos!");

        int opcao;
        do {
            exibirMenuInvestimentos();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> investirCDB(conta);
                case 2 -> investirLCI(conta);
                case 3 -> System.out.println("Obrigado por utilizar nosso serviço de investimentos!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    public static void exibirMenuInvestimentos() {
        System.out.println("\nSelecione uma opção de investimento:");
        System.out.println("1 - Investir em CDB (10% ao ano)");
        System.out.println("2 - Investir em LCI (8% ao ano)");
        System.out.println("3 - Encerrar");
        System.out.print("Opção: ");
    }

    public static void investirCDB(ContaBanco conta) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser investido em CDB: ");
        double valorInvestido = scanner.nextDouble();
        System.out.print("Digite a quantidade de meses de investimento: ");
        int meses = scanner.nextInt();
        double rendimentoMensal = (10.0 / 12) / 100;
        double rendimentoTotal = valorInvestido * Math.pow((1 + rendimentoMensal), meses);
        System.out.println("Rendimento total em " + meses + " meses: R$" + rendimentoTotal);
        conta.depositar(rendimentoTotal);
    }

    
    // outros membros e métodos...

    public static void investirLCI(ContaBanco conta) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser investido em LCI: ");
        double valorInvestido = scanner.nextDouble();
        System.out.print("Digite a quantidade de meses de investimento: ");
        int meses = scanner.nextInt();
        double rendimentoMensal = (8.0 / 12) / 100;
        double rendimentoTotal = valorInvestido * Math.pow((1 + rendimentoMensal), meses);
        System.out.println("Rendimento total em " + meses + " meses: R$" + rendimentoTotal);
        conta.depositar(rendimentoTotal); // Chama o método depositar da classe ContaBanco
    }
}

