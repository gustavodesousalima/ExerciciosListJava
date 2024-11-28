import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float valorTotal;

        System.out.println("Digite o valor do produto");
        float valor = entrada.nextFloat();

        System.out.println("Digite a quantidade comprada");
        float quantidade = entrada.nextFloat();

        if (quantidade > 10){
            valorTotal = valor * quantidade;

            float totalDesconto10 = (valorTotal * 10) / 100;

            float totalcomdesconto = valorTotal - totalDesconto10;

            System.out.println("Total a ser pago com 10% de desconto: " + totalcomdesconto);
        }else{
            valorTotal = valor * quantidade;

            System.out.println("Total a ser pago: " + valorTotal);
        }

    }
}
