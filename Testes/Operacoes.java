import java.util.*;

/*1 - Escreva um programa que dado o saldo inicial e uma série de operações de crédito/débito
 (identificadas com valores positivos ou negativos e finalizada com zero),
 informe o total de créditos, o total de débitos, a C.P.M.F. paga (0,40% do total de débitos)
 e o saldo final da conta, baseado no seguinte exemplo:

Saldo inicial: 1000.00
Operação: 200
Operação: -50
Operação: -10
Operação: 170
Operação: -500
Operação: 0
------------------------
Créditos.....: R$ 370.00
Débitos......: R$ 560.00
C.P.M.F......: R$ 2.24
Saldo........: R$ 807.76
------------------------*/
public class Operacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> operacoes = new ArrayList<>();
        float creditosTotais = 0, debitosTotais = 0, cpmf = 0.004f, saldo = 0,saldoInicial, aux;

        /*Adiciona o saldo inicial*/
        System.out.println("Digite o saldo inicial: ");
        saldoInicial = scanner.nextInt();
        /*Coleta de dados*/
        do {
            aux = 0;
            System.out.println("Digite a operação desejada: (Aperte 0 para encerrar)");
            aux = scanner.nextFloat();
            if (aux != 0) {
                operacoes.add(aux);
            } else {
                System.out.println("Fim de operação");
            }
        } while (aux != 0);

        /*Separa em Crédito e Débito*/
        for (float operacao : operacoes) {
            if(operacao > 0){
                creditosTotais += operacao;
            } else {
                debitosTotais += operacao;
            }
        }

        cpmf *= (debitosTotais * -1);
        saldo = saldoInicial + debitosTotais + creditosTotais - cpmf;

        System.out.println("------------------------");
        System.out.printf("Operações....:  " + operacoes + "\n");
        System.out.printf("Creditos.....: R$ %.2f\n", creditosTotais);
        System.out.printf("Debitos......: R$ %.2f\n", debitosTotais * -1);
        System.out.printf("C.P.M.F......: R$ %.2f\n", cpmf);
        System.out.printf("Saldo........: R$ %.2f\n", saldo);
        System.out.println("------------------------");
        scanner.close();
    }
}