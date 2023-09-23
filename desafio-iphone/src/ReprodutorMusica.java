public class ReprodutorMusica {
    
    public void tocar(){
        if(AparelhoTelefonico.getTelefone() == true){
            System.out.println("Música reproduzida com sucesso.");
        } 
    }

    public void pausar(){
        if(AparelhoTelefonico.getTelefone() == true){
            System.out.println("A música foi pausada.");
        }
    }

    public void selecionarMusica(){
        if(AparelhoTelefonico.getTelefone() == true){
            System.out.println("Selecionando música.");
        } else {
            System.out.println("O aparelho está desligado.");
        }
    }
}
