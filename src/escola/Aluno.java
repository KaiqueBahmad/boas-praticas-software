package escola;

/**
 * Representa um aluno e as notas obtidas por ele ao longo do semestre.
 */
public class Aluno {

    private final String nome;
    private final double[] notas;

    public Aluno(String nome, double... notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas.clone();
    }
}
