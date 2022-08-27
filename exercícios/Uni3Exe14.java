import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double litro = 12;

        System.out.println(" Informe a distância percorrida: ");
        int dist = scanner.nextInt();

        System.out.println("Informe o tempo da viagem: ");
        int tempo = scanner.nextInt();

        int VM = dist / tempo;

        double comb = dist / litro;

        System.out.println("Sua velocidade média foi " + VM + " km/h. E gastou-se " + df.format(comb) + " litros de gasolina.");


        scanner.close();
    }
}
