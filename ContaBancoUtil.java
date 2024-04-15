/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco2;

/**
 *
 * @author valmi
 */

public class ContaBancoUtil {

    public static void depositar(ContaBanco conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public static void consultarSaldo(ContaBanco conta) {
        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
