
import java.text.DecimalFormat;
import java.util.Scanner;

// Um motorista deseja abastecer seu tanque de combustível. Escreva um programa para ler o preço do litro da gasolina 
//e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe o preço da gasolina: ");
        float gasolina = scanner.nextFloat();

        System.out.println("Informe quanto você gastou: ");
        float gasto = scanner.nextFloat();

        float valor = gasto / gasolina;

        System.out.println("Você abasteceu " + df.format(valor) + " litros.");

        scanner.close();

    



    }
}
