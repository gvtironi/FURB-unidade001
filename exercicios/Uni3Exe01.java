import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Uma imobiliária vende apenas terrenos retangulares. 
        // Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.

        System.out.println("Informe a largura do terreno: ");
        float larg = scanner.nextFloat();

        System.out.println("Informe o comprimento do terreno: ");
        float comp = scanner.nextFloat();

        float area = comp * larg;

        System.out.println("As dimensões do terreno serão de " + area + " metros.");

        scanner.close();
    
}}
