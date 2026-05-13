package Exercise6;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class App {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatoHorario = DateTimeFormatter.ofPattern("HH:mm");
        float precoTotal = 0, precoAdicional = 0;
        System.out.println("Digite a placa do carro: ");
        String placa = scanner.next();
        System.out.println("Digite o horário de entrada do veículo (hh:mm): ");
        String entrada = scanner.next();
        System.out.println("Digite o horário de saída do veículo (hh:mm): ");
        String saida = scanner.next();
        LocalTime horaEntrada = LocalTime.parse(entrada, formatoHorario);
        LocalTime horaSaida = LocalTime.parse(saida, formatoHorario);

        /*Aceita o tipo LocalTime*/
        Duration diferenca = Duration.between(horaEntrada, horaSaida);

        /*Como pode ser muito grande, utiliza long*/
        long minutosEstadia = diferenca.toMinutes();

        if (minutosEstadia <= 60) {
            precoTotal += 5.00f;
        } else {
            long aux = minutosEstadia;
            while (aux > 60) {
                precoAdicional += 2.00f;
                aux -= 15;
            }
            precoTotal += (precoAdicional + 5.00f);
        }

        System.out.printf(
                """
                -----------------------------
                Recibo
                -----------------------------
                Placa: %s
                Entrada: %s
                Saida: %s
                Tempo total (em minutos): %d
                Total a pagar: R$ %.2f
                -----------------------------
                """,

                placa,
                horaEntrada,
                horaSaida,
                minutosEstadia,
                precoTotal
        );
    }
}
