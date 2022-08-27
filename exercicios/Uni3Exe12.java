import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        int horas = scanner.nextInt();

        System.out.println("Informe a quantidade de dependentes: ");
        int dep = scanner.nextInt();

        int salarioTrab = horas * 10;
        int salarioFami = dep * 60;

        double INSS = salarioTrab * 0.085;
        double imposto = salarioTrab * 0.05; 

        double salarioBruto = salarioTrab + salarioFami;
        double salarioLiq = salarioBruto - (INSS + imposto);


        System.out.println(nome + ", seu salário bruto é: R$ " + salarioBruto + " e seu salário líquido é: R$ " + salarioLiq + ".");

        scanner.close();
    }
}
