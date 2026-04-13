import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       
        Scanner sc = new Scanner(System.in); 

        // =================================================================
        // EXERCÍCIO 1: CÁLCULO DE MÉDIA
        // =================================================================
        double soma = 0;

        System.out.println("--- 1. CÁLCULO DE MÉDIA ---");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = sc.nextDouble();
            soma += numero; 
        }

        double media = soma / 5;
        System.out.println("A média dos 5 números é: " + media);
        System.out.println("\n-------------------------------------------------\n");


        // =================================================================
        // EXERCÍCIO 2: CONTADOR DE PARES E ÍMPARES
        // =================================================================
        int pares = 0;
        int impares = 0;

        System.out.println("--- 2. CONTADOR DE PARES E ÍMPARES ---");
        System.out.println("Digite 5 números inteiros:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numero = sc.nextInt();
            
            if (numero % 2 == 0) {
                pares++; 
            } else {
                impares++; 
            }
        }

        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);
        System.out.println("\n-------------------------------------------------\n");


        // =================================================================
        // EXERCÍCIO 3: CALCULADORA BÁSICA
        // =================================================================
        int opcao;

        do {
            System.out.println("\n--- 3. CALCULADORA BÁSICA ---");
            System.out.println("1. Somar (+)");
            System.out.println("2. Subtrair (-)");
            System.out.println("3. Multiplicar (*)");
            System.out.println("4. Dividir (/)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

          
            if (opcao == 0) {
                System.out.println("Encerrando a calculadora...");
                break; 
            }
            
          
            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = sc.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                  
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: Não é possível dividir por zero!");
                    }
                    break;
            }

        } while (opcao != 0);

     
        sc.close(); 
    }
}