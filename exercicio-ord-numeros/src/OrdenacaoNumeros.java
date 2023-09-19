import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {
    
    private List <Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    @Override
    public int compareTo(Integer i) {
        return 0;
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public List<Integer> ordenarCrescente(){
        List<Integer> numOrdemCrescente = new ArrayList<>(numeros);
        Collections.sort(numOrdemCrescente);
        return numOrdemCrescente;
    }

    public List<Integer> ordenarDecrescente(){
        List<Integer> numOrdemDecrescente = new ArrayList<>(numeros);
        Collections.sort(numOrdemDecrescente, Collections.reverseOrder());
        return numOrdemDecrescente;

    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(3);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(6);

        System.out.println("Lista em ordem crescente: " + numeros.ordenarCrescente());
        System.out.println("Lista em ordem decrescente: " + numeros.ordenarDecrescente());
    }
}
