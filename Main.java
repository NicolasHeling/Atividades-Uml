public class Main {
    public static void main(String[] args) {
        // Inicializando as camadas (Injeção de dependência)
        AlunoRepository repository = new AlunoRepository();
        AlunoService service = new AlunoService(repository);

        System.out.println("--- Teste Manual (Ex 10) ---");

        // Testando o cenário de sucesso
        System.out.println("\n1. Testando cadastros válidos:");
        service.cadastrarAluno("Marcos Oliveira", 8.5);
        service.cadastrarAluno("Maria Eduarda", 9.0);

        // Testando a regra de negócio do Ex 8 (Falha esperada)
        System.out.println("\n2. Testando regra de negócio (Nota menor que 0):");
        try {
            service.cadastrarAluno("João", -2.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Comportamento correto. Exceção gerada: " + e.getMessage());
        }

        System.out.println("\n3. Testando regra de negócio (Nota maior que 10):");
        try {
            service.cadastrarAluno("Ana", 11.5);
        } catch (IllegalArgumentException e) {
            System.out.println("Comportamento correto. Exceção gerada: " + e.getMessage());
        }

        // Testando a busca parcial do Ex 9
        System.out.println("\n4. Testando busca parcial pelo termo 'edu':");
        var resultadosBusca = service.buscarPorNomeParcial("edu");
        for (Aluno a : resultadosBusca) {
            System.out.println("Resultado encontrado: " + a);
        }
    }
}