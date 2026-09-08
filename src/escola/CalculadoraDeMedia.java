package escola;

/**
 * Responsavel apenas pelo calculo da media das notas.
 */
public class CalculadoraDeMedia {

    public double calcularMedia(double[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException("E necessario informar ao menos uma nota.");
        }

        double somaDasNotas = 0;
        for (double nota : notas) {
            somaDasNotas += nota;
        }
        return somaDasNotas / notas.length;
    }
}
