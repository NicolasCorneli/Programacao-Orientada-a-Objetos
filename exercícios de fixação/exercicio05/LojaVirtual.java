import java.util.ArrayList;

public class LojaVirtual {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Produto> produtos;

    public LojaVirtual(){
        pedidos = new ArrayList<>();
        produtos = new ArrayList<>();
    }

    public void processarPedidos(Pedido p){
        if (p.getStatus() == "processando"){
            p.setStatus("enviado");
            pedidos.add(p);

            System.out.println("O pedido foi processado com sucesso, e foi enviado!");
            System.out.println("Pedido: ");
            System.out.println("Nome do Cliente: " +p.getCompras().getCliente().getNome());
            System.out.println("Produtos comprados: ");
            for (Produto x : p.getCompras().getProdutos()){
                System.out.println("Produto: " + x.getNome() + " | Preço: R$ " + x.getPreco());
            }
            for (Produto x : p.getCompras().getProdutos()){
                x.setEstoque(x.getEstoque() - 1);
            }
        }
    }

    public void atualizarEstoque(Produto p, int qntd){
        p.setEstoque(p.getEstoque() + qntd);
    }

    public void adicionarProdutosListaGeral(Produto p){
        produtos.add(p);
    }

    public void adicionarPedidos(Pedido p){
        pedidos.add(p);
    }

    public void calcularValorCarrinho(Pedido pedido){
        double total = 0;
        for (Produto x : pedido.getCompras().getProdutos()){
            total = total + x.getPreco();
        }
    }

    public void relatorioVendas(){
        double total = 0;
        System.out.println("Relatório de vendas: ");
        for (Pedido x : pedidos){
            if (x.getStatus() == "enviado" || x.getStatus() == "entregue"){
                for (Produto p : x.getCompras().getProdutos()){
                    System.out.println("Produto: " + p.getNome() + " | Preço: R$ " + p.getPreco());
                    total = total + p.getPreco();
                }
            }
        }

    }
}
    

