public class Professor extends Pessoa {
    private String departamento;
    private int prazoMaximo;

    public Professor(int id, String nome, String email, String departamento) {
        super(id, nome, email);
        this.departamento = departamento;
        this.prazoMaximo = 30;
    }

    @Override
    public void realizarEmprestimo() {
        System.out.println("Professor " + nome + " (Depto: " + departamento + ") realizando empréstimo com prazo de " + prazoMaximo + " dias.");
    }

    @Override
    public float calcularMulta() {
        return 1.00f; 
    }
}