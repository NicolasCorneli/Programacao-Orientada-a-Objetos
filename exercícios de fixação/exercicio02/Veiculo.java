public class Veiculo {
    private String modelo;
    private String placa;
    private int capacidade;

    public Veiculo(String modelo, String placa, int capacidade){
        this.modelo = modelo;
        this.placa = placa;
        this.capacidade = capacidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
}
