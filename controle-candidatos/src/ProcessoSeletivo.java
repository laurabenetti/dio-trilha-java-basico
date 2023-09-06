import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato:candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){

                tentativasRealizadas++;
            } 
            else
                System.out.println("Contato realizado com sucesso");


        }
        while(continuarTentando && tentativasRealizadas <3);

        if(atendeu)
            System.out.println("Conseguimos contato com " +candidato+ " na " +tentativasRealizadas+ "º tentativa ");
        else
            System.out.println("Não conseguimos contato com " +candidato+ ", número máximo de tentativas excedido.");
    }

    static boolean atender(){

        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {

        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for(String candidato : candidatos){

            System.out.println("O candidato " +candidato+ " foi selecionado " );
        }
    }

    static void selecaoCandidatos() {

        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Ana","Mirela","Daniela"};

        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) {

            String candidato = candidatos [candidatosAtuais];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " +candidato+ " solicitou este valor de salário " +salarioPretendido);
            if(salarioBase >= salarioPretendido) {

                System.out.println("O candidato " +candidato+ " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            candidatosAtuais++;

        }
    }

    static double valorPretendido() {

        return ThreadLocalRandom.current().nextDouble(1800,2200);
    
    }

    static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {

            System.out.println("Ligar para o candidato");
        
        } else if (salarioBase == salarioPretendido) {

            System.out.println("Ligar para o candidato com contraproposta");
        
        } else {

            System.out.println("Aguardando resultado dos demais candidatos");
        
        }
    }
}
