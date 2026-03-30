public class Carro {
    private String marca;
    private String modelo;
    private int ano; // O erro do "ano" acontecia porque essa linha estava faltando ou escrita diferente!

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar() {
        // Usando a marca e o ano aqui para o aviso (triângulo amarelo) sumir
        System.out.println("O " + marca + " " + modelo + " do ano " + ano + " está acelerando: Vrummm!");
    }

    public void frear() {
        System.out.println("O " + modelo + " está freando.");
    }
}