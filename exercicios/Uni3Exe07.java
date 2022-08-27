import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lata = scanner.nextDouble();
        double garrafa600 = scanner.nextDouble();
        double garrafa2l = scanner.nextDouble();

        System.out.println("Quantidade de latas: " + lata);
        System.out.println("Quantidade de garrafas 600 ml: " + garrafa600);
        System.out.println("Quantidade de garrafas 2 litros: " + garrafa2l);

        double total = (lata * 0.350) + (garrafa600 * 0.600) + (garrafa2l * 2.0);

        System.out.println("Seu total de litros foi de: " + total + "l.");

        



        scanner.close();
    }
}
