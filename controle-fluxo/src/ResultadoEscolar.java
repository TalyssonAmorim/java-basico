public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        /*
        if(nota >= 7)
        {
            System.out.println("Parabéns! Você foi aprovado!");
        }else if (nota >= 5 && nota < 7){
            System.out.println("Prova de Recuperação");
        }
         else {
            System.out.println("Você foi reprovado.");
        }*/
        //abreviação por condição ternaria
        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
