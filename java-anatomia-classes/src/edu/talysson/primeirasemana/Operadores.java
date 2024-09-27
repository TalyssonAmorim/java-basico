package edu.talysson.primeirasemana;
public class Operadores {
    public static void main(String[] args) {
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
    }
}
