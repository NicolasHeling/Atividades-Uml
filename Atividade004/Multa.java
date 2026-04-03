public class Multa {
    private int id;
    private float valor;
    private int diasAtraso;

    public Multa(int id, int diasAtraso, float taxaDiaria) {
        this.id = id;
        this.diasAtraso = diasAtraso;
        this.valor = calcularValor(taxaDiaria);
    }

    public float calcularValor(float taxaDiaria) {
        return this.diasAtraso * taxaDiaria;
    }

    public void registrarPagamento() {
        System.out.println("Pagamento da multa de R$ " + valor + " registrado.");
    }
}