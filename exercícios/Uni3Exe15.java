import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int um = n1;
        
        int cem = um / 100;
        um = um - (cem  * 100);

        int dezena = um / 10;
        um = um - (dezena  * 10);

        int unidade = um / 1;
        um = um - (unidade  * 1);

        System.out.println(cem + " centena(s)" + dezena + " dezena(s)" + unidade + " unidade(s)");

        scanner.close();
    }
}
