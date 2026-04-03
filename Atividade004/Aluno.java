public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private int limiteEmprestimos;

    public Aluno(int id, String nome, String email, String matricula, String curso) {
        super(id, nome, email);
        this.matricula = matricula;
        this.curso = curso;
        this.limiteEmprestimos = 3;
    }

    @Override
    public void realizarEmprestimo() {
        System.out.println("Aluno " + nome + " realizando empréstimo dentro do limite de " + limiteEmprestimos + " itens.");
    }

    @Override
    public float calcularMulta() {
        return 2.50f; 
    }
}