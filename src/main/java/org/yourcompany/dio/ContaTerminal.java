/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.dio;

import java.util.Scanner;


/**
 *
 * @author dummy
 */
public class ContaTerminal {

    public static void main(String[] args) {

        String nomeCliente = "Joao da Silva";
        Double saldo = 123.45;


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor digite o numero da agencia: ");
            String agencia = scanner.nextLine();
            
            System.out.print("Digite o numero da conta: ");
            String numero = scanner.nextLine();
            
            System.out.println("Ola " + nomeCliente);
            System.out.println("agencia " + agencia + " numero " + numero);
            System.out.println("Seu saldo é: " + saldo);
        }
    
    }
}
