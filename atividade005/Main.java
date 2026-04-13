package atividade005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n========== PAINEL CENTRAL ==========");
            System.out.println("1. Executar Cálculo de Média");
            System.out.println("2. Executar Pares e Ímpares");
            System.out.println("3. Executar Menu Switch (Exemplo)");
            System.out.println("4. Executar Ordenação de Array");
            System.out.println("5. Executar Lista de Objetos");
            System.out.println("0. Sair");
            System.out.print("Escolha qual programa rodar: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                System.out.println(); // Pula uma linha para ficar mais organizado

                switch (opcao) {
                    case 1:
                        // Chama o método main do arquivo CalculoMedia.java
                        CalculoMedia.main(null); 
                        break;
                    case 2:
                        // Chama o método main do arquivo ParesEImpares.java
                        ParesEImpares.main(null);
                        break;
                    case 3:
                        // Chama o método main do arquivo MenuSwitch.java
                        MenuSwitch.main(null);
                        break;
                    case 4:
                        // Chama o método main do arquivo OrdenacaoArray.java
                        OrdenacaoArray.main(null);
                        break;
                    case 5:
                        // Chama o método main do arquivo ListaDeObjetos.java
                        ListaDeObjetos.main(null);
                        break;
                    case 0:
                        System.out.println("Encerrando o painel central...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } else {
                System.out.println("Por favor, digite um número válido.");
                scanner.next(); // Limpa o buffer do teclado caso o usuário digite letras
            }
        }
        
        scanner.close();
    }
}