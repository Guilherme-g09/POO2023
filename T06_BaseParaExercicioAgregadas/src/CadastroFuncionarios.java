import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CadastroFuncionarios {
    public static final int TAM = 5;
    private List<Funcionario> lstf;

    public CadastroFuncionarios() {
        lstf = new LinkedList<>();

        Random r = new Random();

        for (int i = 0; i < TAM; i++) {
            int matricula = r.nextInt(300) + 100;
            String nome = "Fulano" + i;
            boolean insalubridade = r.nextBoolean();
            int nroDep = r.nextInt(3);
            double salBase = (r.nextDouble() * 15000) + 500;
            Funcionario f = new Funcionario(matricula, nome, salBase, nroDep, insalubridade);
            lstf.add(f);
        }

        lstf.add(new Funcionario(180,"Zezinho Especial",4000,3,false));
        lstf.add(new Funcionario(500,"Zezinho 1",2000,2,false));
    }

    public List<Funcionario> getFuncionarios() {
        // Retorna um clone da lista
        return new LinkedList<Funcionario>(lstf);
    }

    // 1a
    public List<Funcionario> getInsalubridadeDependentes(){
        List<Funcionario> list = this.lstf.stream()
            .filter(f -> f.getInsalubridade())
            .filter(f -> f.getNroDependentes() > 0)
            .toList();

        return list;
    }

    // 1b
    public long quantidadeFuncionariosComDependentes(){
        Long quantFunc = this.lstf.stream()
            .filter(f -> f.getNroDependentes() > 0)
            .count();

        return quantFunc;
    }

    //1c
    public double somatorioSalarioBruto(){
        double sum = this.lstf.stream()
			.filter(f -> f.getSalarioBruto() > 5000)
            .mapToDouble(f -> f.getSalarioBruto())
            .sum();

        return sum;
    }

    //1d
    public void aumentaSalarioInsalubres(){
        this.lstf.stream()
            .filter(f -> f.getInsalubridade())
            .forEach(f -> f.aumentaSalBase(1.2));
    }

    //1e
    public List<String> getNomeMatriculaSalarioBrutoMaiorQueBase(){
		List<String> list = this.lstf.stream()
			.filter(f -> f.getSalarioBruto() > f.getSalarioBase() * 1.1)
			.map(f -> f.getNome() + " - " + f.getMatricula())
			.toList();

        return list;
    }

    //1f
    public double mediaSalarialDosQueNaoTemInsalubridade(){
		double media = this.lstf.stream()
			.filter(f -> !f.getInsalubridade())
			.mapToDouble(f -> f.getSalarioLiquido())
			.average()
			.orElse(0.0);

        return media;
    }

    //1g
    public List<String> nomesDosQueTemMatriculaMenorQue500(){
		List<String> list = this.lstf.stream()
			.filter(f -> f.getMatricula() < 500)
			.map(f -> f.getNome())
			.toList();

        return list;
    }

    //1h
    public double getSalarioLiquido(int matricula){
		double salarioLiquido = this.lstf.stream()
			.filter(f -> f.getMatricula() == matricula)
			.mapToDouble(f -> f.getSalarioLiquido())
			.findFirst()
			.orElse(-1.0);
			
        return salarioLiquido;
    }
   
    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        lstf.forEach(f->str.append(f.toString()+"\n"));
        return str.toString();
    }
}

