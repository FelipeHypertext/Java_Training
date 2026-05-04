package Exercise5;

public class Medico extends Pessoa{
    private String especialidade;
    private String crm;

    public Medico(String nome, int idade, String especialidade, String crm) {
        super(nome, idade);
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getCrm() {
        return crm;
    }
}
