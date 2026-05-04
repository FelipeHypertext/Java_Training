package Exercise5;

public class Consulta {
    private final String dataConsulta;
    private final Medico medico;
    private final Paciente paciente;

    public Consulta(String dataConsulta, Medico medico, Paciente paciente) {
        this.dataConsulta = dataConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    @Override
    public String toString() {
        return "Consulta em:" + getDataConsulta() + "\n" +
                "Dr(a)." + medico.getNome() + " - " + "Idade: " + medico.getIdade() + " - " + medico.getEspecialidade() + " (CRM: " + medico.getCrm() + ")" + "\n" +
                "Paciente: " + paciente.getNome() + " - " + "Idade: " + paciente.getIdade() + " - " + "Enfermidade: " + paciente.getEnfermidade();
    }
}
