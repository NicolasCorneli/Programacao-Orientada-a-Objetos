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

    public void veiculosComBaixaAutonomia() {
        ArrayList<VeiculosEletricos> veiculosBaixaAutonomia = new ArrayList<>();
        for (VeiculosEletricos veiculo : listaVeiculos) {
            if (veiculo.precisaRecarregar()) {
                veiculosBaixaAutonomia.add(veiculo);
            }
        }
        for (VeiculosEletricos veiculo : veiculosBaixaAutonomia) {
            System.out.println("Veículo com baixa autonomia: " + veiculo.getModelo() + " ID: " + veiculo.getId() + ", Autonomia atual: " + veiculo.getAutonomiaAtual());
        }
    }


    public ArrayList<Motorista> getListaMotoristas() {
        return listaMotoristas;
    }

    public ArrayList<Eletroposto> getListaEletropostos() {
        return listaEletropostos;
    }
}



    public ArrayList<Motorista> getListaMotoristas() {
        return listaMotoristas;
    }

    public ArrayList<Eletroposto> getListaEletropostos() {
        return listaEletropostos;
    }
}

