package edu.talysson.segundasemana;
import java.util.Locale;
import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altua");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite sua altua");
        String sobrenome = scanner.next();
    }
}
