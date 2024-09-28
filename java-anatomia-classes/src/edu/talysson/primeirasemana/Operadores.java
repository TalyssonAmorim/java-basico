package edu.talysson.primeirasemana;
public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        String concatenacao = "?";
        String numeroUM = "Talysson";
        String NumeroDois = "Talysson";
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
        //incremento
        numero = numero + 1;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        //decremento
        numero--;
        System.out.println(numero);
        numero = numero - 1;
        System.out.println(numero);
        //comparação
        System.out.println(numero == 5);
        System.out.println(numero!= 5);
        System.out.println(numero > 4);
        System.out.println(numero < 6);
        System.out.println(numero >= 5);
        System.out.println(numero <= 5);
        //operador ternário
        int resultado = numero > 5? 10 : 5;
        System.out.println(resultado);
        //operador AND &&
        System.out.println(5 > 3 && 5 < 10);
        //operador OR
        System.out.println(5 > 3 || 5 < 10);
        //operador NOT!
        System.out.println(!true);
        //operador bitwise AND &
        System.out.println(5 & 3);
        //operador bitwise OR |
        System.out.println(5 | 3);
        //operador bitwise XOR ^
        System.out.println(5 ^ 3);
        //operador bitwise NOT ~
        System.out.println(~5);
        //operador shift left <<
        System.out.println(5 << 1);
        //operador shift right >>
        System.out.println(5 >> 1);
        //operador modulo %
        System.out.println(5 % 3);
        //operador incremento pré-fixado ++
        System.out.println(++numero);
        //operador incremento pós-fixado --
        System.out.println(numeroUM.equals(NumeroDois)); //metodo para verificar conteudo

    }
}
