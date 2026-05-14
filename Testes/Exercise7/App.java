package Exercise7;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class App {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean extra = false;
        System.out.println("Digite o nome do colaborador: ");
        String nomeFuncionario = scanner.next();
        System.out.println("Digite o horário de entrada do colaborador(hh:mm): ");
        String entrada = scanner.next();
        System.out.println("Digite o horário de saída do colaborador (hh:mm): ");
        String saida = scanner.next();

        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horarioEntrada = LocalTime.parse(entrada, formatacao);
        LocalTime horarioSaida = LocalTime.parse(saida, formatacao);
        Duration diferenca = Duration.between(horarioEntrada, horarioSaida);
        long horas = diferenca.toHours();
        long minutos = diferenca.toMinutes() % 60;

        /*480 minutes == 8 hours*/
        if (diferenca.toMinutes() > 480) {
            extra = true;
        }

        /*Verification of overtime hours*/
        String possuiExtra = extra? "Sim" : "Não";
        String palavraHora = diferenca.toHours() == 1? "hora" : "horas";
        String palavraMinuto = diferenca.toMinutes() % 60 == 1 || diferenca.toMinutes() % 60 ==0 ? "minuto" : "minutos";
        System.out.printf(
            """
            Nome: %s
            Entrada: %s
            Saída: %s
            Horas trabalhadas: %d %s e %d %s
            Horas extras: %s
            """,
            nomeFuncionario,
            horarioEntrada.format(formatacao),
            horarioSaida.format(formatacao),
            horas,
            palavraHora,
            minutos,
            palavraMinuto,
            possuiExtra
        );
    }
}

