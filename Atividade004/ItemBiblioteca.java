public abstract class ItemBiblioteca {
    protected String titulo;
    protected boolean disponivel;

    public ItemBiblioteca(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    public abstract String obterDescricao();
    public abstract int calcularPrazo();
}