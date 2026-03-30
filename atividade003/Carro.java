public class Carro {
   
    private String marca;
    private String modelo;
  

   
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    public void acelerar() {
        System.out.println("O " + modelo + " está acelerando: Vrummm!");
    }

    public void frear() {
        System.out.println("O " + modelo + " está freando.");
    }
}