import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private String endereco;
    private int capacidade;
    private List<ItemBiblioteca> acervo;

    public Biblioteca(String nome, String endereco, int capacidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.capacidade = capacidade;
        this.acervo = new ArrayList<>();
    }

    public void adicionarItem(ItemBiblioteca item) {
        this.acervo.add(item);
    }

    public ItemBiblioteca buscarItem(String titulo) {
        for (ItemBiblioteca item : acervo) {
            if (item.titulo.equalsIgnoreCase(titulo)) {
                return item;
            }
        }
        return null;
    }

    public List<ItemBiblioteca> gerarRelatorio() {
        return this.acervo;
    }
}