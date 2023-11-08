public class Aluno {
    private int matricula;
    private String nome;
    private int anoNascimento;

    public Aluno(int umaMatr, String umNom, int umAnoNasc) {
        if (umaMatr <= 0) {
            throw new IllegalArgumentException("O número de matrícula deve ser positivo");
        }
        
        if (umAnoNasc > 2023) {
            throw new IllegalArgumentException("O ano de nascimento deve ser menor que 2023.");
        }

        nome = umNom;
        matricula = umaMatr;
        anoNascimento = umAnoNasc;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    @Override
    public String toString() {
        return matricula + ", " + nome + ", " + anoNascimento;
    }
}
