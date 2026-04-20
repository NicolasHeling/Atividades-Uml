import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

// ==========================================
// CLASSES AUXILIARES (Devem ficar fora da classe Main ou ser static dentro dela)
// ==========================================

class Aluno {
    String nome;
    String matricula;
    double nota;

    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
}

class Conta {
    private String numero;
    private String titular;
    private double saldo;

    public Conta(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void consultarExtrato() {
        System.out.println("\n--- Extrato ---");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numero);
        System.out.println("Saldo Disponível: R$" + saldo);
        System.out.println("-----------------\n");
    }
}

class Pessoa {
    String nome;
    String email;
    int idade;

    public Pessoa(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}

// ==========================================
// CLASSE PRINCIPAL
// ==========================================

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoPrincipal;

        do {
            System.out.println("\n====== MENU DE ATIVIDADES ======");
            System.out.println("1. Atividade 1: Básico (Soma/Média, Pares/Ímpares, Array Aleatório)");
            System.out.println("2. Atividade 2: Intermediário (Calculadora, ArrayList Nomes, Alunos)");
            System.out.println("3. Atividade 3: Desafio (Matriz Adição, Sistema Bancário, Cadastro Pessoas)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcaoPrincipal = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcaoPrincipal) {
                case 1:
                    executarAtividadeBasica(scanner);
                    break;
                case 2:
                    executarAtividadeIntermediaria(scanner);
                    break;
                case 3:
                    executarAtividadeDesafio(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcaoPrincipal != 0);

        scanner.close();
    }

    // ==========================================
    // MÉTODOS DAS ATIVIDADES
    // ==========================================

    private static void executarAtividadeBasica(Scanner scanner) {
        System.out.println("\n--- 1. Leitura de 5 Números ---");
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            int num = scanner.nextInt();
            soma += num;
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }
        System.out.println("Soma: " + soma + " | Média: " + (soma / 5.0) + " | Maior: " + maior + " | Menor: " + menor);

        System.out.println("\n--- 2. Contador de Pares e Ímpares (0 para sair) ---");
        int pares = 0, impares = 0, entrada;
        do {
            System.out.print("Digite um número: ");
            entrada = scanner.nextInt();
            if (entrada != 0) {
                if (entrada % 2 == 0) pares++;
                else impares++;
            }
        } while (entrada != 0);
        System.out.println("Pares: " + pares + " | Ímpares: " + impares);

        System.out.println("\n--- 3. Array Aleatório Ordenado ---");
        int[] arrayAleatorio = new int[10];
        for (int i = 0; i < arrayAleatorio.length; i++) {
            arrayAleatorio[i] = (int) (Math.random() * 100) + 1;
        }
        Arrays.sort(arrayAleatorio);
        System.out.println("Array: " + Arrays.toString(arrayAleatorio));
    }

    private static void executarAtividadeIntermediaria(Scanner scanner) {
        System.out.println("\n--- 1. Calculadora ---");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        if (num2 != 0) System.out.println("Divisão: " + (num1 / num2));
        else System.out.println("Divisão: Erro (Divisão por zero)");
        scanner.nextLine(); // limpar buffer

        System.out.println("\n--- 2. Gerenciador de Nomes ---");
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Zeca", "Ana", "Carlos"));
        System.out.println("Lista inicial: " + nomes);
        nomes.add("Beatriz");
        System.out.println("Após adicionar Beatriz: " + nomes);
        Collections.sort(nomes);
        System.out.println("Lista ordenada: " + nomes);

        System.out.println("\n--- 3. Sistema de Alunos ---");
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Marcos", "101", 7.5));
        alunos.add(new Aluno("Julia", "102", 5.0));
        alunos.add(new Aluno("Fernanda", "103", 9.2));
        
        System.out.println("Alunos Aprovados (Nota >= 6.0):");
        for (Aluno aluno : alunos) {
            if (aluno.nota >= 6.0) {
                System.out.println("- " + aluno.nome + " (Nota: " + aluno.nota + ")");
            }
        }
    }

    private static void executarAtividadeDesafio(Scanner scanner) {
        System.out.println("\n--- 1. Matriz de Adição (3x3) ---");
        System.out.println("(Gerando matrizes com valores automáticos para demonstração rápida)");
        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        System.out.println("Resultado da soma (A + B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matrizA[i][j] + matrizB[i][j]) + "\t");
            }
            System.out.println();
        }

        System.out.println("\n--- 2. Sistema Bancário Simples ---");
        Conta contaDemo = new Conta("9876-5", "Usuário Teste", 1000.00);
        contaDemo.consultarExtrato();
        contaDemo.sacar(250.00);
        contaDemo.depositar(100.00);
        contaDemo.consultarExtrato();

        System.out.println("--- 3. Sistema de Cadastro ---");
        ArrayList<Pessoa> cadastros = new ArrayList<>();
        adicionarPessoa(cadastros, "Teste", "teste@email.com", 25);
        adicionarPessoa(cadastros, "Invalido", "invalido.com", 30); // Vai falhar
        adicionarPessoa(cadastros, "Teste", "outro@email.com", 40); // Vai falhar (duplicado)
        adicionarPessoa(cadastros, "Maria", "maria@email.com", 35);
        
        if (!cadastros.isEmpty()) {
            int somaIdades = 0;
            for (Pessoa p : cadastros) somaIdades += p.idade;
            System.out.println("Média de idades cadastradas: " + (somaIdades / (double) cadastros.size()));
        }
    }

    // Método auxiliar para a atividade 3.3
    private static void adicionarPessoa(ArrayList<Pessoa> cadastros, String nome, String email, int idade) {
        if (!email.contains("@")) {
            System.out.println("Erro: E-mail inválido para " + nome);
            return;
        }
        for (Pessoa p : cadastros) {
            if (p.nome.equalsIgnoreCase(nome)) {
                System.out.println("Erro: O nome '" + nome + "' já está cadastrado.");
                return;
            }
        }
        cadastros.add(new Pessoa(nome, email, idade));
        System.out.println("Cadastro de " + nome + " realizado com sucesso.");
    }
}