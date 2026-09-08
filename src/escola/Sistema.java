package escola;

/**
 * Ponto de entrada do sistema: apenas orquestra as demais responsabilidades.
 */
public class Sistema {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos", 8, 7);

        CalculadoraDeMedia calculadoraDeMedia = new CalculadoraDeMedia();
        AvaliadorDeSituacao avaliadorDeSituacao = new AvaliadorDeSituacao();
        BoletimImpressor boletimImpressor = new BoletimImpressor();

        double media = calculadoraDeMedia.calcularMedia(aluno.getNotas());
        SituacaoAcademica situacao = avaliadorDeSituacao.avaliar(media);

        boletimImpressor.imprimir(aluno, media, situacao);
    }
}
