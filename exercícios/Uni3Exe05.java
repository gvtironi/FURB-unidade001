import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double anelE = 3.50;
        double anelD = 4.00;


        System.out.println("Quantos frangos tem em sua granja: ");

        double qtdeFrango = scanner.nextDouble();

        double t1 = (anelE * 2) + anelD;
        double total = qtdeFrango * t1;

        System.out.println("Seu gasto total será de: R$ " + total);


        scanner.close();
    }
}
