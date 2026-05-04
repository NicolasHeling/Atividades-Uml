import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercicio2 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("alunos.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            
            pw.println("Carlos Silva");
            pw.println("Ana Julia");
            System.out.println("Alunos salvos no arquivo alunos.txt com sucesso.");
            
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }
}