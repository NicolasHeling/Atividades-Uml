import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Biblioteca central = new Biblioteca("Biblioteca de Toledo", "Av. Parigot de Souza", 1000);

       
        Livro livroJava = new Livro("Java: Como Programar", "Deitel", 10);
        Revista revistaTech = new Revista("Mundo TI", new Date(), 150, "Abril");

        central.adicionarItem(livroJava);
        central.adicionarItem(revistaTech);

      
        Aluno aluno = new Aluno(1, "Nicolas", "nicolas@estudante.com", "2026001", "ADS");
        Professor prof = new Professor(2, "Mestre Java", "mestre@faculdade.com", "Tecnologia");

        System.out.println("--- Simulação Aluno ---");
        aluno.realizarEmprestimo();
        Emprestimo emp1 = new Emprestimo(101, aluno, livroJava);
        emp1.registrarDevolucao(4);

        System.out.println("\n--- Simulação Professor ---");
        
        prof.realizarEmprestimo();
        Emprestimo emp2 = new Emprestimo(102, prof, revistaTech);
        emp2.registrarDevolucao(4);
    }
}