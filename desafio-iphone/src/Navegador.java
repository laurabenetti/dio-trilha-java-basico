public class Navegador {
    
    public void exibirPagina(){
        if(AparelhoTelefonico.getTelefone() == true){
            System.out.println("Exibindo página.");
        } else {
            System.out.println("O aparelho está desligado.");
        }
    }

    public void adicionarNovaAba(){
        if(AparelhoTelefonico.getTelefone() == true){
            System.out.println("Adicionando nova página.");
        } else {
            System.out.println("O aparelhoe está desligado.");
        }
    }

    public void atualizarPagina(){
        if(AparelhoTelefonico.getTelefone() == true){
            System.out.println("Atualizando página.");
        } else {
            System.out.println("O aparelho está desligado.");
        }
    }
}
