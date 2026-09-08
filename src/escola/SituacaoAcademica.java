package escola;

/**
 * Situacao final do aluno apos o calculo da media.
 */
public enum SituacaoAcademica {

    APROVADO("Aprovado"),
    REPROVADO("Reprovado");

    private final String descricao;

    SituacaoAcademica(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
