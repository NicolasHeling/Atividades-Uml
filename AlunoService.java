import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    private AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    // Ex 8: Regra que impede nota menor que 0 ou maior que 10
    public void cadastrarAluno(String nome, double nota) {
        if (nota < 0.0 || nota > 10.0) {
            throw new IllegalArgumentException("Erro: A nota informada (" + nota + ") é inválida. Deve ser entre 0 e 10.");
        }
        Aluno novoAluno = new Aluno(nome, nota);
        repository.salvar(novoAluno);
        System.out.println("Aluno " + nome + " cadastrado com sucesso.");
    }

    // Ex 9: Busca parcial usando contains
    public List<Aluno> buscarPorNomeParcial(String termo) {
        List<Aluno> resultados = new ArrayList<>();
        for (Aluno aluno : repository.buscarTodos()) {
            if (aluno.getNome().toLowerCase().contains(termo.toLowerCase())) {
                resultados.add(aluno);
            }
        }
        return resultados;
    }
}