import java.util.ArrayList;

public class GestaoFrota {
    private ArrayList<VeiculosEletricos> listaVeiculos;
    private ArrayList<Motorista> listaMotoristas;
    private ArrayList<Eletroposto> listaEletropostos;

    public GestaoFrota() {
        listaVeiculos = new ArrayList<>();
        listaMotoristas = new ArrayList<>();
        listaEletropostos = new ArrayList<>();
    }

    public void adicionarVeiculo(VeiculosEletricos veiculo) {
        listaVeiculos.add(veiculo);
    }

    public void adicionarMotorista(Motorista motorista) {
        listaMotoristas.add(motorista);
    }

    public void adicionarEletroposto(Eletroposto eletroposto) {
        listaEletropostos.add(eletroposto);
    }

    public ArrayList<VeiculosEletricos> veiculosComBaixaAutonomia() {
        ArrayList<VeiculosEletricos> veiculosBaixaAutonomia = new ArrayList<>();
        for (VeiculosEletricos veiculo : listaVeiculos) {
            if (veiculo.precisaRecarregar(veiculo)) {
                veiculosBaixaAutonomia.add(veiculo);
            }
        }
        return veiculosBaixaAutonomia;
    }

    public ArrayList<Motorista> getListaMotoristas() {
        return listaMotoristas;
    }

    public ArrayList<Eletroposto> getListaEletropostos() {
        return listaEletropostos;
    }
}

