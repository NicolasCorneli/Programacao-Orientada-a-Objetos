import java.time.LocalDate;

public class CarrosCompactos extends VeiculosEletricos {
    private int tempoCargaCompacto;

    public CarrosCompactos(int id, String marca, String modelo, LocalDate anoFabricacao, double capacidadeBateria, double autonomiaMaxima){
        super(id, marca, modelo, anoFabricacao, capacidadeBateria, autonomiaMaxima);
        this.tempoCargaCompacto = 4;
    }

    public int getTempoCargaCompacto() {
        return tempoCargaCompacto;
    }

    public void setTempoCarga(int tempoCargaCompacto) {
        this.tempoCargaCompacto = tempoCargaCompacto;
    }
}

