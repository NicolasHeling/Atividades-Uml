public class Exercicio4 {
    enum NivelAcesso {
        ADMIN, PROFESSOR, ALUNO
    }

    public static void main(String[] args) {
        NivelAcesso nivel = NivelAcesso.PROFESSOR;

        switch (nivel) {
            case ADMIN:
                System.out.println("Acesso total concedido. Bem-vindo, Administrador.");
                break;
            case PROFESSOR:
                System.out.println("Acesso liberado. Você pode editar notas.");
                break;
            case ALUNO:
                System.out.println("Acesso liberado. Você pode ver seu boletim.");
                break;
            default:
                System.out.println("Acesso negado.");
        }
    }
}
