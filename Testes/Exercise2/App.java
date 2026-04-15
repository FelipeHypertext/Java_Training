package Exercise2;
/*Crie uma classe Produto com os atributos privados nome e preco. No programa principal, insira 5 produtos
em um ArrayList.
        1. Liste todos os produtos.
        2. Liste todos os produtos em ordem crescente de nome.
        3. Liste todos os produtos em ordem crescente de preço.
        4. Mostre apenas os produtos com preco maior que 100.
        5. Busque um produto na lista e apresente uma de 2 mensagens: "O produto foi encontrado!" ou "O
            produto não existe na lista".
        6. Busque e exclua um produto na lista e apresente uma de 2 mensagens: "O produto foi excluído!" ou
            "O produto não existe na lista".
*/
import java.util.*;
public class App {
    public static void main(String[] args){
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Visualizar produtos");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Sair\n");

            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            if (opcao != 4){
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        /*Cadastro dos produtos*/
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Digite o nome do produto: ");
                            String nome = scanner.nextLine();

                            System.out.println("Digite o preço do produto: ");
                            float preco = scanner.nextFloat();
                            /*Limpar o buffer*/
                            scanner.nextLine();

                            listaProdutos.add(new Produto(nome, preco));
                        }
                        break;
                    case 2:
                        /*Listagem listada por nome*/
                        listaProdutos.sort(Comparator.comparing(Produto::getNome));
                        for (int i = 0; i < listaProdutos.size(); i++) {
                            System.out.print("Nome: " + listaProdutos.get(i).getNome() + "\n");
                            System.out.print("Preço: " + listaProdutos.get(i).getPreco() + "\n");
                            System.out.println();
                        }

                        /*Listagem listada por Preço*/
                        listaProdutos.sort(Comparator.comparing(Produto::getPreco));
                        for (int i = 0; i < listaProdutos.size(); i++) {
                            System.out.print("Nome: " + listaProdutos.get(i).getNome() + "\n");
                            System.out.print("Preço: " + listaProdutos.get(i).getPreco() + "\n");
                            System.out.println();
                        }

                        /*listagem por preço maior que 100*/
                        for (int i = 0; i < listaProdutos.size(); i++) {
                            if (listaProdutos.get(i).getPreco() > 100) {
                                System.out.print("Nome: " + listaProdutos.get(i).getNome() + "\n");
                                System.out.print("Preço: " + listaProdutos.get(i).getPreco() + "\n");
                            }
                        }
                        break;
                    case 3:
                        /*Buscar Produto*/
                        System.out.println("Digite o nome do produto que deseja buscar");
                        String busca = scanner.nextLine();
                        boolean status = false;
                        for (int i = 0; i < listaProdutos.size(); i++) {
                            if (listaProdutos.get(i).getNome().equalsIgnoreCase(busca)) {
                                System.out.printf("O produto foi encontrado na posição %d da lista.", i);
                                status = true;
                            }

                            if (!status) {
                                System.out.println("O produto não foi encontrado em lugar algum :(");
                            }
                        }
                        break;
                    case 4:
                        /*Remover Produto*/
                    default:
                        System.out.println("Opção fora de escopo ou símbolo não reconhecido.");
                }
            } else {break;};
        }
        scanner.close();
    }
}
