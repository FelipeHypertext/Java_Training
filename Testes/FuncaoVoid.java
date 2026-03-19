public class FuncaoVoid {

    public static void decorador(int num, char caracter){
        for(int i = 1; i <= num; i++){
            System.out.print(caracter);
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        decorador(10, '-');
        System.out.println("Numeros de 1 a 5:");
        decorador(100, '/');

        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        decorador(50, '?');
    }
}