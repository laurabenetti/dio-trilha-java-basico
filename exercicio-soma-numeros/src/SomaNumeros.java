import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    //atributo lista de números
    private List<Integer> numeros;

    //construtor
    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    //métodos
    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer numero : numeros)
        soma+=numero;
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                if(numero >= maiorNumero){
                     maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            System.out.println("A lista está vazia.");
            return 0;
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            System.out.println("A lista está vazia.");
            return 0;
        }
    }

    public void exibirNumero(){
        System.out.println(this.numeros);
    }
    
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(10);

        System.out.println("A soma dos números é: " + numeros.calcularSoma());
        System.out.println("O maior número da lista é: " + numeros.encontrarMaiorNumero());
        System.out.println("O menor número da lista é: " + numeros.encontrarMenorNumero());
        System.out.println("O números na lista são: ");
        numeros.exibirNumero();

        
    }
    
}
