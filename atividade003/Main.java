package exercicio; 

public class Main {
    public static void main(String[] args) {
        
        
        Carro carro1 = new Carro("Toyota", "Corolla", 2022);
        Carro carro2 = new Carro("Volkswagen", "Fusca", 1970);

        
        carro1.acelerar();
        carro2.frear();
    }
}