import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        double pi = 3.14159;
        int raio = scanner.nextInt();
        int altura = scanner.nextInt();

        double volume = pi * (raio * raio) * altura;

        System.out.println("O volume da lata de óleo é: " + volume);

        scanner.close();
    }
}
