import java.time.LocalDate;

public class Principal {
    public static void main(String[] args){
        LojaVirtual l = new LojaVirtual();

        Produto p0 = new Produto("Colchão", 1000, 34);
        Produto p1 = new Produto("Sapato", 100, 22);
        Produto p2 = new Produto("Cobertor", 88, 55);
        
        l.adicionarProdutosListaGeral(p0);
        l.adicionarProdutosListaGeral(p1);
        l.adicionarProdutosListaGeral(p2);

        Cliente c0 = new Cliente("Marco","XXXXXX","marco1312@gmail.com");
        Cliente c1 = new Cliente("Bruno","YYYYYY","bruno122@gmail.com");
        Cliente c2 = new Cliente("Gabriel","ZZZZZ","gabriel12@gmail.com");

        CarrinhoDeCompras marco = new CarrinhoDeCompras(c0);
        CarrinhoDeCompras bruno = new CarrinhoDeCompras(c1);
        CarrinhoDeCompras gabriel = new CarrinhoDeCompras(c2);

        marco.adicionarProduto(p0);
        marco.adicionarProduto(p1);
        bruno.adicionarProduto(p1);
        bruno.adicionarProduto(p2);
        gabriel.adicionarProduto(p2);

        Pedido pedidoMarco = new Pedido(marco, LocalDate.now());
        Pedido pedidoBruno = new Pedido(bruno, LocalDate.now());
        Pedido pedidoGabriel = new Pedido(gabriel, LocalDate.now());
        
        l.adicionarPedidos(pedidoMarco);
        l.adicionarPedidos(pedidoBruno);
        l.adicionarPedidos(pedidoGabriel);

        l.processarPedidos(pedidoMarco);
        System.out.println("---------------------");
        l.processarPedidos(pedidoBruno);
        System.out.println("---------------------");
        l.processarPedidos(pedidoGabriel);

        System.out.println("---------------------");
        System.out.println("---------------------");

        l.calcularValorCarrinho(pedidoMarco);
        System.out.println("---------------------");
        System.out.println("---------------------");
        l.relatorioVendas();


        

    }
    
}
