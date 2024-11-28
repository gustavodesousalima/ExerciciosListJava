import java.util.Scanner;

public class Exercicio3 {

    public static  void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a base do triangulo");

        float base = entrada.nextFloat();

        System.out.println("Digite a altura do triangulo");

        float altura = entrada.nextFloat();

        float area = (base * altura) / 2;

        System.out.println("A area do triangulo é: " + area);
    }
}
