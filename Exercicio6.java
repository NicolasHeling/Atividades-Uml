import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Map<String, String> credenciais = new HashMap<>();
        credenciais.put("admin", "123456");
        credenciais.put("nicolas", "senhaSegura");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (credenciais.containsKey(usuario) && credenciais.get(usuario).equals(senha)) {
            System.out.println("Login efetuado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
        
        scanner.close();
    }
}