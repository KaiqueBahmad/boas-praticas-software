package escola;

/**
 * Responsavel apenas pela apresentacao dos resultados ao usuario.
 */
public class BoletimImpressor {

    public void imprimir(Aluno aluno, double media, SituacaoAcademica situacao) {
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Media: " + media);
        System.out.println(situacao.getDescricao());
    }
}
