import java.util.Date;

public class Revista extends ItemBiblioteca {
    private Date dataPublicacao;
    private int volume;
    private String editora;

    public Revista(String titulo, Date dataPublicacao, int volume, String editora) {
        super(titulo);
        this.dataPublicacao = dataPublicacao;
        this.volume = volume;
        this.editora = editora;
    }

    @Override
    public String obterDescricao() {
        return "Revista: " + titulo + " | Volume: " + volume + " | Editora: " + editora;
    }

    @Override
    public int calcularPrazo() {
        return 7;
    }
}