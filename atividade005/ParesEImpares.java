package atividade005;

import java.util.Scanner;

public class ParesEImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0;
        int impares = 0;

        System.out.println("--- Contador de Pares e Ímpares ---");
        System.out.print("Quantos números você deseja verificar? ");
        int quantidade = scanner.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nResultado:");
        System.out.println("Números Pares: " + pares);
        System.out.println("Números Ímpares: " + impares);

        scanner.close();
    }
}