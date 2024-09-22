import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> produtos;
    private Cliente cliente;

    public CarrinhoDeCompras(Cliente cliente){
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void adicionarProduto(Produto p){
        produtos.add(p);
    }

    public void removerProdutos(Produto p){
        if (produtos.contains(p)){
            produtos.remove(p);
        }
    }

}
