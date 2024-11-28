import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero ");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero ");
        int numero2 = entrada.nextInt();

        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
        System.out.println(numero1 + " X " + numero2 + " = " + (numero1 * numero2));
        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));

    }
}
