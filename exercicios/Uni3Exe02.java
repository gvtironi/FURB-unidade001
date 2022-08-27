import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.00");

            System.out.println("Informe o valor do sapato: ");
            float valor = scanner.nextFloat();

            float desconto = valor * 0.12f;

            System.out.println("O valor do seu desconto é de R$ " + df.format(desconto) +  ". O preço do seu sapato com desconto é " + df.format(valor - desconto));

            scanner.close();
    }
}
