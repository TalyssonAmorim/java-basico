package edu.talysson.primeirasemana;

public class TiposVariaveis {
    public static void main(String[] args) {
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        /*  
         short numeroCurto2 = numeroNormal;
         Como a linguagem e fortemente tipada é necessario fazer um casting:
        */
        short numeroCurto2 = (short) numeroNormal;
        //para declarar uma constante em java usa-se a palavra final antes de declarar o tipo:

        final double VALOR_DE_PI =3.1415;
        System.out.println(VALOR_DE_PI);
    }
}
