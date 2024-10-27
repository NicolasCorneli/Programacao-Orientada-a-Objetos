import java.time.LocalDate;

public class CarrosSedans extends VeiculosEletricos {
    private int tempoCargaSedan;

    public CarrosSedans(int id, String marca, String modelo, LocalDate anoFabricacao, double capacidadeBateria, double autonomiaMaxima){
        super(id, marca, modelo, anoFabricacao, capacidadeBateria, autonomiaMaxima);
        this.tempoCargaSedan = 6;
    }

    public int getTempoCargaSedan() {
        return tempoCargaSedan;
    }

    public void setTempoCargaSedan(int tempoCargaSedan) {
        this.tempoCargaSedan = tempoCargaSedan;
    }
}
