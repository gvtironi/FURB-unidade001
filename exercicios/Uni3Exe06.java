import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {

        //Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato montado pelo cliente 
        // (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Informe o peso do seu prato: ");

        float peso1 = scanner.nextFloat();
        float peso =  peso1 * (25 * 0.75f);
        float totalPagar = peso;

        System.out.println("Seu prato deu um total de: R$ " + totalPagar);



        scanner.close();
    }
}
