package Exercise4;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro l1 = new Livro("O cavaleiro preso na armadura", 1993, "Robert Fisher", 128);
        DVD d1 = new DVD("Matrix", 1999, "Ficção Científica", 136);

        System.out.print(l1);
        System.out.print("\n");
        System.out.println(d1);
    }
}
