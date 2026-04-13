package atividade005;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        System.out.println("--- Calculadora de Média ---");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            soma += scanner.nextDouble();
        }

        double media = soma / 5;
        System.out.println("A média dos 5 números é: " + media);

        scanner.close();
    }
}