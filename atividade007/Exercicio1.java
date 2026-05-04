import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a idade: ");
        try {
            int idade = Integer.parseInt(scanner.nextLine());
            System.out.println("Nome: " + nome + " | Idade: " + idade);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Você digitou um texto. A idade deve ser um número inteiro.");
        }
        
        scanner.close();
    }
}