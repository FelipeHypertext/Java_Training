import java.util.*;

public class Calculadora {
    public static float soma(float num1, float num2) {
        return num1 + num2;
    }

    public static float subtracao(float num1, float num2) {
        return num1 - num2;
    }

    public static float multiplicacao(float num1, float num2) {
        return num1 * num2;
    }

    public static float divisao(float num1, float num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        float resultado = 0, num1 = 0, num2 = 0;

        do{
            System.out.println("===== CALCULADORA =====");
            System.out.println(
                    "[1] Soma\n" +
                    "[2] Subtração\n" +
                    "[3] Multiplicação\n" +
                    "[4] Divisão\n" +
                    "[5] Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do primeiro número: ");
                    num1 = scanner.nextFloat();
                    System.out.println("Digite o valor do segundo número: ");
                    num2 = scanner.nextFloat();
                    resultado = soma(num1, num2);
                    System.out.printf("O valor da soma de %.2f com %.2f é %.2f\n", num1, num2, resultado);
                    break;
                case 2:
                    System.out.println("Digite o valor do primeiro número: ");
                    num1 = scanner.nextFloat();
                    System.out.println("Digite o valor do segundo número: ");
                    num2 = scanner.nextFloat();
                    resultado = subtracao(num1, num2);
                    System.out.printf("O valor da subtração de %.2f com %.2f é %.2f\n", num1, num2, resultado);
                    break;
                case 3:
                    System.out.println("Digite o valor do primeiro número: ");
                    num1 = scanner.nextFloat();
                    System.out.println("Digite o valor do segundo número: ");
                    num2 = scanner.nextFloat();
                    resultado = multiplicacao(num1, num2);
                    System.out.printf("O valor da multiplicacao de %.2f com %.2f é %.2f\n", num1, num2, resultado);
                    break;
                case 4:
                    System.out.println("Digite o valor do primeiro número: ");
                    num1 = scanner.nextFloat();
                    System.out.println("Digite o valor do segundo número: ");
                    num2 = scanner.nextFloat();
                    if (num2 ==0) {
                        System.out.print("O denominador não pode ser 0.\n");
                        break;
                    }
                    resultado = divisao(num1, num2);
                    System.out.printf("O valor da divisão de %.2f com %.2f é %.2f\n", num1, num2, resultado);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Símbolo ou número fora do escopo de opções.\n");
                    break;
            }
        } while (opcao != 5);
        scanner.close();
    }
}
