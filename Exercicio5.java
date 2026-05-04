import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio5 {
    // Usando Record para simplificar a classe de dados do Produto
    record Produto(String nome, double preco) {}

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Teclado Mecânico", 350.00));
        produtos.add(new Produto("Mouse Wireless", 150.00));
        produtos.add(new Produto("Monitor", 1200.00));

        // Ordenar por Nome
        produtos.sort(Comparator.comparing(Produto::nome));
        System.out.println("Ordenado por Nome: " + produtos);

        // Ordenar por Preço
        produtos.sort(Comparator.comparing(Produto::preco));
        System.out.println("Ordenado por Preço: " + produtos);
    }
}