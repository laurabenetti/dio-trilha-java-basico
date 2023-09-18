import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> compraList;

    public CarrinhoDeCompras() {
        this.compraList = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade) {

        compraList.add(new Item (nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensPararRemover = new ArrayList<>();

        for (Item i : compraList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensPararRemover.add(i);
            }
        }

        compraList.removeAll(itensPararRemover);
    } 
    
    public double calcularValorTotal(){
        double valorTotal = 0d;
        for(Item i : compraList){
            if(!compraList.isEmpty()){
               double valorItem = i.getPreco()*i.getQuantidade();
               valorTotal += valorItem;
               System.out.println("O valor total do carrinho é de " + valorTotal);
            } else {
                System.out.println("Não há itens no seu carrinho.");
            }
        }
        return 0;
    }

    public void exibirItens(){
        
            if(!compraList.isEmpty()){
            System.out.println(this.compraList);
            }
            else{
            System.out.println("Não há itens no seu carrinho.");
            }
        
    }

    public static void main(String[] args) {
        
        CarrinhoDeCompras listacompras = new CarrinhoDeCompras();
        listacompras.adicionarItem("Melancia", 40, 2);
        listacompras.adicionarItem("Tomate", 10, 1);
        listacompras.calcularValorTotal();

    }
}


