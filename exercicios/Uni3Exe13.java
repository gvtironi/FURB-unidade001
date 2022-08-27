import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float azulejop = 12.50f;

        System.out.println("Informe o comprimento da parade: ");
        int comprimento = scanner.nextInt();

        System.out.println("Informe a altura da parede: ");
        int altura = scanner.nextInt();

        float parede = (comprimento * altura);
        float azulejo = parede * 9f;
        float valor = azulejo * azulejop;

        System.out.println("O preço dos azulejos será de: R$ " + valor);

        scanner.close();
    }
}

