import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE","MARCIA","PAULO","AUGUSTO","JULHA"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
        }while(continuarTentando && tentativasRealizadas <3);
        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+ candidato + " NUMERO MAXIMO TENTATIVAS " + tentativasRealizadas);
            
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    static void selecaoCandidatos (){
        String [] candidatos = {"FELIPE","MARCIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JOSE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o Candidato");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o Candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultados dos demais candidatos");
        }
    }
}
