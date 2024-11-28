import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio do circulo");

        float raiocirculo = entrada.nextFloat();


        float area = (float) ((raiocirculo * raiocirculo) * 3.14159);
        System.out.println("A área é: " + area);

        float perimetro = (float) ((2 * raiocirculo) * 3.14159);

        System.out.println("O perimetro é: " + perimetro);

    }
}
