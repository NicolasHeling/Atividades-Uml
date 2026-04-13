package atividade005;

import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("--- Menu Interativo ---");
        System.out.println("1. Opção A");
        System.out.println("2. Opção B");
        System.out.println("3. Opção C");
        System.out.print("Escolha uma opção (1-3): ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a Opção A.");
                break;
            case 2:
                System.out.println("Você escolheu a Opção B.");
                break;
            case 3:
                System.out.println("Você escolheu a Opção C.");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}