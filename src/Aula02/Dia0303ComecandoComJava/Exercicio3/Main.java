package Aula02.Dia0303ComecandoComJava.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        float primeiraNota = scanner.nextFloat();

        System.out.println("Informe a segunda nota: ");
        float segundaNota = scanner.nextFloat();

        System.out.println("Informe a terceira nota: ");
        float terceiraNota = scanner.nextFloat();

        float media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.printf("A media final eh %.1f", media);
    }
}
