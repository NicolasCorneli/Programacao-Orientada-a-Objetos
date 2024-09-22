public class Quarto {
    private int numero;
    private String tipo;
    private boolean disponibilidade;

    public Quarto(int numero, String tipo){
        this.numero = numero;
        this.tipo = tipo;
        this.disponibilidade = true;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

}
