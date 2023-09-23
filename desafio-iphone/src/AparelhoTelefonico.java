public class AparelhoTelefonico {
    
    private static boolean telefone;

    public AparelhoTelefonico(boolean telefone) {
        AparelhoTelefonico.telefone = telefone;
    }

    public static boolean getTelefone() {
        return telefone;
    }

    public void ligar(){
        if(telefone == true){
            System.out.println("O telefone já está ligado!");
        } else{
            telefone = true;
            System.out.println("Telefone ligado.");
        }
    }

    public void atender(){
        if(telefone == true){
            System.out.println("A chamada foi atendida com sucesso.");
        } else {
            System.out.println("O telefone está desligado.");
        }
    }

    public void iniciarCorreioVoz(){
        if(telefone == true){
            System.out.println("Correio de voz iniciado.");
        } else {
            System.out.println("O telefone está desligado.");
        }
    }

    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico(false);
        ReprodutorMusica reprodutor = new ReprodutorMusica();
        Navegador navegador = new Navegador();
        
        //executando
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        //executando
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();

        //executando
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        navegador.exibirPagina();
    }
}
