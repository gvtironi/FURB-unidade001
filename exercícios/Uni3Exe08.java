import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de dólares: ");
        double real = scanner.nextDouble();

        double troco = real * dolar;

        System.out.println("Seu troco é de: R$ " + troco);
        
        
        scanner.close();
    }
}
