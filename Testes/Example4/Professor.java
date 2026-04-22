package Example4;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfessor{" +
                "Especialidade='" + especialidade + '\'' +
                ",Salario=" + salario +
                '}';
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Professor(String nome, int idade, float altura, String especialidade, double salario) {
        super(nome, idade, altura);
        this.especialidade = especialidade;
        this.salario = salario;
    }
}
