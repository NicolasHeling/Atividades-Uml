import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("--- Lista de Alunos Cadastrados ---");
        try (BufferedReader br = new BufferedReader(new FileReader("alunos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo (verifique se ele existe): " + e.getMessage());
        }
    }
}