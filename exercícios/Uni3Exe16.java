import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int um = n1;
        
        int cem = um / 100;
        um = um - (cem  * 100);

        int dez = um / 10;
        um = um - (dez  * 10);

        int unidade = um / 1;
        um = um - (unidade  * 1);

        System.out.println(n1);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(unidade + " nota(s) de R$ 1,00");

        scanner.close();
    }
}
