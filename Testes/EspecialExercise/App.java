package EspecialExercise;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class App {
    public static void main(String[] args) {
        boolean conf = false;
        float aumento = 0, pagamentoFinal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data prevista para o pagamento (dd/mm/aaaa): ");
        String previsao = scanner.next();
        System.out.println("Digite a data para o pagamento (dd/mm/aaaa): ");
        String data = scanner.next();
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite o valor do pagamento: ");
        float pagamentoValor = scanner.nextFloat();

        LocalDate previsaoData = LocalDate.parse(previsao, formatacao);
        LocalDate dataPagamento = LocalDate.parse(data, formatacao);
        long diferencaDias = ChronoUnit.DAYS.between(previsaoData, dataPagamento);

        if (diferencaDias > 0) {
            aumento += pagamentoValor * 0.02f;
            pagamentoFinal += aumento + pagamentoValor;
            conf = true;
        }

        if (conf) {
            System.out.printf(
                   """
                   Data prevista: %s
                   Data pagamento: %s
                   Valor: R$ %.2f
                            
                   Pagamento em atraso.
                   Dias de atraso: %d%n
                   Juros: R$ %.2f
                   Valor final: R$ %.2f
                   """,
                    previsaoData.format(formatacao),
                    dataPagamento.format(formatacao),
                    pagamentoValor,
                    diferencaDias,
                    aumento,
                    pagamentoFinal
            );
        } else {
            pagamentoFinal = pagamentoValor;
            System.out.printf(
                    """
                    Data prevista: %s
                    Data pagamento: %s
                    Valor: R$ %.2f
                            
                    Pagamento realizado no prazo.
                    Valor final: R$ %.2f
                    """,
                    previsaoData.format(formatacao),
                    dataPagamento.format(formatacao),
                    pagamentoValor,
                    pagamentoFinal
            );
        }
    }
}
