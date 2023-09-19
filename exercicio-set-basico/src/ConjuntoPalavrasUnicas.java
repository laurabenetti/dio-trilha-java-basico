import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private String palavra;

    public ConjuntoPalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }
    
    public String getPalavra() {
        return palavra;
    }

    private Set<ConjuntoPalavrasUnicas> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return palavra;
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(new ConjuntoPalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra){
        if(!palavraSet.isEmpty()){
            ConjuntoPalavrasUnicas palavrasParaRemover = null;
            for(ConjuntoPalavrasUnicas c : palavraSet){
                if(c.getPalavra() == palavra){
                    palavrasParaRemover = c;
                    break;
                }
            }

            palavraSet.remove(palavrasParaRemover);

        }
    }

    public void verificarPalavra(String palavra){
        if(!palavraSet.isEmpty()){
            for(ConjuntoPalavrasUnicas c : palavraSet){
                if(c.getPalavra().equalsIgnoreCase(palavra)){
                    
                    System.out.println("A palavra " +palavra+ " está na lista.");
                    
                } 

            }
        } 
        else{
            System.out.println("A lista está vazia.");
            
        }
    }

    public void exibirPalavras(String palavra){
        if(!palavraSet.isEmpty()){
            System.out.println(palavraSet);
        }
        else{
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("cadeira");
        palavrasUnicas.adicionarPalavra("sol");
        palavrasUnicas.adicionarPalavra("azul");
        palavrasUnicas.adicionarPalavra("melancia");

        palavrasUnicas.verificarPalavra("cadeira");
        palavrasUnicas.exibirPalavras(null);
        palavrasUnicas.removerPalavra("melancia");
        palavrasUnicas.exibirPalavras(null);
    }
    
}
