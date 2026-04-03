import java.util.Date;

public class Emprestimo {
    private int id;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private String status;
    
    private Pessoa usuario;
    private ItemBiblioteca item;
    private Multa multa; 

    public Emprestimo(int id, Pessoa usuario, ItemBiblioteca item) {
        this.id = id;
        this.usuario = usuario;
        this.item = item;
        this.dataEmprestimo = new Date();
        this.status = "Ativo";
    }

    public void registrarDevolucao(int diasAtraso) {
        this.dataDevolucao = new Date();
        this.status = "Devolvido";
        
        if (verificarAtraso(diasAtraso)) {
       
            this.multa = new Multa(this.id, diasAtraso, usuario.calcularMulta());
            System.out.println("Multa gerada: R$ " + this.multa.calcularValor(usuario.calcularMulta()));
        } else {
            System.out.println("Item devolvido no prazo. Sem multas.");
        }
    }

    public boolean verificarAtraso(int diasAtraso) {
        return diasAtraso > 0;
    }
}