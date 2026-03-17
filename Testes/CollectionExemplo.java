import java.util.*;

/*Collections adiciona várias funções para a manipulação de uma Array*/
public class CollectionExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("André");

        Collections.sort(nomes);
        System.out.println(nomes);
        Collections.reverse(nomes);
        System.out.println(nomes);
        Collections.shuffle(nomes);
        System.out.println(nomes);
        /*O metodo MAX() e MIN() dão respectivamente o nome com a letra mais perto de Z e a
        letra mais perto de A, me números pega o maior e o menor*/

        scanner.close();
    }
}