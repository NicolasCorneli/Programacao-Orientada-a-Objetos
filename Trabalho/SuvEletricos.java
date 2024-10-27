import java.time.LocalDate;

public class SuvEletricos extends VeiculosEletricos {

    private int tempoCargaSuv;

    public SuvEletricos(int id, String marca, String modelo, LocalDate anoFabricacao, double capacidadeBateria, double autonomiaMaxima) {
        super(id, marca, modelo, anoFabricacao, capacidadeBateria, autonomiaMaxima);
        this.tempoCargaSuv = 8;
    }

    public int getTempoCargaSuv() {
        return tempoCargaSuv;
    }

    public void setTempoCargaSuv(int tempoCargaSuv) {
        this.tempoCargaSuv = tempoCargaSuv;
    }
}
