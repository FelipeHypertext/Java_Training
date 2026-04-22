package Example4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*java.util.Comparator (Biblioteca para comparação de Array de Objetos)*/
public class App {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Pessoa p1 = new Pessoa("Ana", 22, 1.72f);
        listaPessoas.add(p1);
        Pessoa p2 = new Pessoa("Felipe", 22, 1.85f);
        listaPessoas.add(p2);
        Professor pr1 = new Professor("Lázaro", 20, 1.50f, "Zootecnia", 3.500);

        /*Adiciona novas instâcias dentro de uma lista*/
        listaPessoas.add(new Pessoa("Marcelo", 20, 1.80f));
        listaPessoas.add(new Pessoa("Carlos", 25, 1.75f));
        listaPessoas.add(new Pessoa("Durango", 80, 1.85f));

        for (int i = 0; i < listaPessoas.size(); i++) {
            System.out.printf("Olá, seja bem vindo " + listaPessoas.get(i).getNome() + ".\n");
            listaPessoas.get(i).apresentar();
        }

        for(int i = 1; i <= 3; i++){
            System.out.print("Informe nome: ");
            String nome = scanner.nextLine();
            System.out.print("Informe idade: ");
            int idade = scanner.nextInt();
            System.out.print("Informe altura: ");
            float altura = scanner.nextFloat();
            /* Limpa o buffer */
            scanner.nextLine();
            /* Adiciona o objeto Pessoa ao ArrayList */
            listaPessoas.add(new Pessoa(nome, idade, altura));
            System.out.println();
        }

        /*Ordenação da lista de objetos*/
        listaPessoas.sort(Comparator.comparing(Pessoa::getNome));
        for (int i = 0; i < listaPessoas.size(); i++) {

            System.out.printf("Nome: " + listaPessoas.get(i).getNome() + "\n");
            System.out.printf("Idade: " + listaPessoas.get(i).getIdade() + "\n");
            System.out.printf("Altura: " + listaPessoas.get(i).getAltura() + "\n");
            System.out.println(listaPessoas.get(i));
            System.out.println();
        }

        scanner.close();
    }
}
