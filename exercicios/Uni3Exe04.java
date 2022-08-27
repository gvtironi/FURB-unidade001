import java.util.Scanner;

public class Uni3Exe04 {

    // Faça um programa para ler três notas de um aluno em uma disciplina e 
    // imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        float n1 = scanner.nextFloat();

        System.out.println("Informe a segunda nota: ");
        float n2 = scanner.nextFloat();

        System.out.println("Informe a terceira nota: ");
        float n3 = scanner.nextFloat();

        float media = (n1 * 0.5f) + (n2 * 0.3f) + (n3 * 0.2f);

        System.out.println("Sua média é de: " + media);

        scanner.close();
        
    }
}
