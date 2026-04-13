package atividade005;

import java.util.ArrayList;
import java.util.List;

public class ListaDeObjetos {
    public static void main(String[] args) {
        System.out.println("--- Exibição de Lista de Objetos ---");
        
        // Criando a lista de objetos do tipo Produto
        List<Produto> inventario = new ArrayList<>();

        // Adicionando objetos à lista
        inventario.add(new Produto("Teclado Mecânico", 250.00));
        inventario.add(new Produto("Mouse Gamer", 150.50));
        inventario.add(new Produto("Monitor IPS 24 polegadas", 850.00));
        inventario.add(new Produto("Headset Bluetooth", 300.00));

        // Exibindo os dados de cada objeto
        for (Produto item : inventario) {
            System.out.println(item.toString());
        }
    }
}