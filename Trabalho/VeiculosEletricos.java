import java.time.LocalDate;
import java.util.ArrayList;

public class VeiculosEletricos {
    private int id;
    private String marca;
    private String modelo;
    private LocalDate anoFabricacao;
    private double capacidadeBateria;
    private double autonomiaMaxima;
    private double autonomiaAtual;
    private ArrayList<String> historicoRecargas;

    public VeiculosEletricos(int id, String marca, String modelo, LocalDate anoFabricacao, double capacidadeBateria, double autonomiaMaxima) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.capacidadeBateria = capacidadeBateria;
        this.autonomiaMaxima = autonomiaMaxima;
        this.autonomiaAtual = autonomiaMaxima; 
        this.historicoRecargas = new ArrayList<>();
    }

    public double getAutonomiaAtual() {
        return autonomiaAtual;
    }

    public void setAutonomiaAtual(double autonomiaAtual) {
        this.autonomiaAtual = autonomiaAtual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(LocalDate anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(double capacidadeBateria) {
        if (this instanceof CarrosCompactos) {
            this.capacidadeBateria = 200;
        } else if (this instanceof CarrosSedans) {
            this.capacidadeBateria = 400;
        } else if (this instanceof SuvEletricos) {
            this.capacidadeBateria = 600;
        }
    }

    public double getAutonomiaMaxima() {
        return autonomiaMaxima;
    }

    public void setAutonomiaMaxima(double autonomiaMaxima) {
        if (this instanceof CarrosCompactos) {
            if (autonomiaMaxima <= 200) {
                this.autonomiaMaxima = autonomiaMaxima;
                this.autonomiaAtual = autonomiaMaxima;
            } else {
                System.out.println("A autonomia máxima para carros compactos não pode exceder 200 km.");
            }
        } else if (this instanceof CarrosSedans) {
            if (autonomiaMaxima <= 400) {
                this.autonomiaMaxima = autonomiaMaxima;
                this.autonomiaAtual = autonomiaMaxima;
            } else {
                System.out.println("A autonomia máxima para sedans não pode exceder 400 km.");
            }
        } else if (this instanceof SuvEletricos) {
            if (autonomiaMaxima > 400) {
                this.autonomiaMaxima = autonomiaMaxima;
                this.autonomiaAtual = autonomiaMaxima;
            } else {
                System.out.println("A autonomia mínima para SUVs deve ser maior que 400 km.");
            }
        }
    }

    public void recarregarBateria(double kWh) {
        this.autonomiaAtual += kWh;
        if (this.autonomiaAtual > this.autonomiaMaxima) {
            this.autonomiaAtual = this.autonomiaMaxima;
        }
        historicoRecargas.add("Recarga de " + kWh + " kWh em " + LocalDate.now());
    }

    public void consumirBateria(double km) {
        this.autonomiaAtual -= km;
    }

    public boolean precisaRecarregar() {
        return this.autonomiaAtual <= (this.autonomiaMaxima * 0.2);
    }

    public void consultarHistoricoRecargas() {
        System.out.println("Histórico de Recargas do carro com ID: " + this.id + " e Modelo: " + this.modelo);
        for (String recarga : historicoRecargas) {
            System.out.println(recarga);
        }
    }

}
