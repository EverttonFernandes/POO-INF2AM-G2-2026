package Dia0303ComecandoComJava.ExemploUsandoOScanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner é o teclado virtual que vocês criam para inserir qualquer informação no programa java!
        // o sout ou System.out.println é a mensagem no console que vocês colocal (como se fosse o console.log no javascript)
        Scanner tecladoVirtual = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String meuNome = tecladoVirtual.nextLine(); // Quando o usuario digitar algum texto

        System.out.println("Informe a sua idade: ");
        int minhaIdade = tecladoVirtual.nextInt(); // Quando o usuario digitar um numero
        System.out.println("Seja bem vindo " + meuNome + " sua idade é " + minhaIdade);

        if (minhaIdade > 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

    }
}
