package edu.talysson.primeirasemana;
public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        String concatenacao = "?";
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        //concatenação
        System.out.println(nomeCompleto);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        System.out.println( numero);
        numero = - numero;
        System.out.println( numero);
        numero = numero * -1;
        System.out.println( numero);

    }
}
