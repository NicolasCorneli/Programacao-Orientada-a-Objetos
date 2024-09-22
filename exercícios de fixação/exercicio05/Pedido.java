import java.time.LocalDate;

public class Pedido {
    private CarrinhoDeCompras compras;
    private LocalDate data;
    private String status; //processando, enviado, entregue

    public Pedido(CarrinhoDeCompras carrinho, LocalDate data){
        this.compras = carrinho;
        this.data = data;
        this.status = "processando";
    }

    public CarrinhoDeCompras getCompras() {
        return compras;
    }

    public void setCompras(CarrinhoDeCompras compras) {
        this.compras = compras;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
