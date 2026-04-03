public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected String email;

    public Pessoa(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public abstract void realizarEmprestimo();
    public abstract float calcularMulta();
}