package Exercise5;

public class App {
    static void main() {
        Medico m1 = new Medico("Carlos", 36, "Cardiologia", "152010");
        Paciente p1 = new Paciente("Ana", 24, "Hipertensão");
        Consulta consulta1 = new Consulta("17/04/2026", m1, p1);

        Medico m2 = new Medico("Roberto", 35, "Ortopedia", "598763");
        Paciente p2 = new Paciente("Fernanda", 26, "Fratura no tornozelo");
        Consulta consulta2 = new Consulta("22/04/2026", m2, p2);

        System.out.println(consulta1);
        System.out.println("---------");
        System.out.println(consulta2);
    }
}
