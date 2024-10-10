public class ExemploFor {
    public static void main(String[] args) {
        String alunos [] = {"JOÃO", "PAULO", "PEDRO", "MIGUEL"};

        for (int x = 0; x < alunos.length ; x++){
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }
        //variavel de escopo
        for (String aluno: alunos){
            System.out.println("O aluno é " + aluno);
        }
    }
}
