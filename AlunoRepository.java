import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
    private List<Aluno> bancoDeDados = new ArrayList<>();

    public void salvar(Aluno aluno) {
        bancoDeDados.add(aluno);
    }

    public List<Aluno> buscarTodos() {
        return bancoDeDados;
    }
}