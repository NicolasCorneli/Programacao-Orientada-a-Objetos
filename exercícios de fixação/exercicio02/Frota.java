import java.util.ArrayList;
public class Frota {
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Viagem> viagens;

    public Frota(){
        veiculos = new ArrayList<>();
        viagens = new ArrayList<>();
    }

    public void adicionarVeiculos(Veiculo v){
        veiculos.add(v);
    }

    public void registrarViagens(Viagem vi){
        viagens.add(vi);
    }

    public void viagensPorVeiculo(Veiculo v){
        for (Viagem x : viagens){
            if (v == x.getVeiculo()){
                System.out.println("Viagem de " + x.getOrigem() + " para " + x.getDestino() + " e distância percorrida de: "+ x.getDistancia() + " Km");
            }
        }
    }

    public void calcularQuilometragemFrota(){
        double total = 0;
        for (Viagem x : viagens){
            total = total + x.getDistancia();
        }
        System.out.println("Distância total percurrida pela frota: "+ total);
    }


    
}
