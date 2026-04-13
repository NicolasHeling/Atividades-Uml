package atividade005;

import java.util.Arrays;

public class OrdenacaoArray {
    public static void main(String[] args) {
        // Criando o array desordenado
        int[] numeros = {56, 12, 98, 34, 7, 23, 89};

        System.out.println("--- Ordenação de Array ---");
        System.out.println("Array original: " + Arrays.toString(numeros));

        // Ordenando o array
        Arrays.sort(numeros);

        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
