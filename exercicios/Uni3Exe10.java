import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cateto1 = scanner.nextInt();
        int cateto2 = scanner.nextInt();

        int hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
        
        System.out.println(" A hipotenusa vai ser: " + Math.sqrt(hipotenusa));


        scanner.close();
    }
}
