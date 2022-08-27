import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
        //°F = (9/5) °C + 32

        System.out.println("Informe a temperatura em graus: ");

        int grausC = scanner.nextInt();
        int grausF = (grausC * 9/5) + 32;
        
        
        System.out.println("Sua temperatura em Fahrenheit é: " + grausF + " °F.");


        scanner.close();
    }
}
