import java.util.*;

/*Dinamização de tamanho das Arrays*/
public class ExemploArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        /*Adição de um elmento em ordem*/
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("André");
        System.out.println(nomes);
        /*Adição de um elemento em um índice específico*/
        nomes.add(1, "Antônio");

        System.out.println("Informe nome: ");
        nomes.add(scanner.next());
        /*Pesquisa Geral*/
        System.out.println(nomes);
        /*Pesquisa Específica*/
        System.out.println(nomes.get(1));
        /*Altera um elemento do array*/
        nomes.set(2, "Rafael");
        System.out.println(nomes);
        /*Remover um Elemento*/
        nomes.remove(0);
        System.out.println(nomes);
        /*Tamanho da lista*/
        System.out.println("Tamanho da lista: " + nomes.size());

        /*Percorrer o vetor dinâmico*/
        for(int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        /*Formartar o vetor dinâmico (FOR EACH)*/
        for(String nome : nomes) {
            System.out.println(nome);
        }
        scanner.close();
    }
}
