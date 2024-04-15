/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciabanco2;
import com.mycompany.gerenciabanco2.ContaBancoUtils;

/**
 *
 * @author valmi
 */
/*class ContaBanco {

    void depositar(double rendimentoTotal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}*/

/*public class ContaBanco {

   
    // outros membros e métodos...

    public void depositar(double valor) {
        saldo += valor; // Atualiza o saldo da conta com o valor depositado
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }
}*/

public class ContaBanco {
    private double saldo; // Campo para armazenar o saldo da conta

    // outros membros e métodos...

    public ContaBanco() {
        this.saldo = 0.0; // Inicializa o saldo com zero quando a conta é criada
    }

    // Getter e Setter para o saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor; // Atualiza o saldo da conta com o valor depositado
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }
}

