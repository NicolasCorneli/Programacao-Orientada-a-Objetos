public class Eletronico extends Produto{
    private boolean garantia;

    public Eletronico(String nome, double preco){
        super(nome,preco);
        this.garantia = true;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }
    
    public void exibir(){
        super.exibir();
        System.out.println("Garantia: "+ isGarantia());
    }
}
