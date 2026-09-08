package escola;

/**
 * Responsavel apenas por decidir a situacao do aluno a partir da media.
 */
public class AvaliadorDeSituacao {

    private static final double MEDIA_MINIMA_PARA_APROVACAO = 6.0;

    public SituacaoAcademica avaliar(double media) {
        if (media >= MEDIA_MINIMA_PARA_APROVACAO) {
            return SituacaoAcademica.APROVADO;
        }
        return SituacaoAcademica.REPROVADO;
    }
}
