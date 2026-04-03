public class Livro extends ItemBiblioteca {
    private String autor;
    private int edicao;

    public Livro(String titulo, String autor, int edicao) {
        super(titulo);
        this.autor = autor;
        this.edicao = edicao;
    }

    @Override
    public String obterDescricao() {
        return "Livro: " + titulo + " | Autor: " + autor + " | Edição: " + edicao;
    }

    @Override
    public int calcularPrazo() {
        return 14;
    }
}