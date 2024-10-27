import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        // Criando gestão de frota
        GestaoFrota gestaoFrota = new GestaoFrota();

        // Criando motoristas
        Motorista motorista1 = new Motorista("João", 1, 123456, "iniciante");
        gestaoFrota.adicionarMotorista(motorista1);

        // Criando veículos
        CarrosCompactos carroCompacto = new CarrosCompactos(1, "Tesla", "Model 3", LocalDate.of(2022, 5, 14),200.0,200.0);
        gestaoFrota.adicionarVeiculo(carroCompacto);

        // Criando eletropostos
        Eletroposto eletroposto1 = new Eletroposto(1, "São Paulo", 10, 2);
        Eletroposto eletroposto2 = new Eletroposto(2, "Rio de Janeiro", 15, 2);
        gestaoFrota.adicionarEletroposto(eletroposto1);
        gestaoFrota.adicionarEletroposto(eletroposto2);

        // Criando e realizando viagem
        Viagem viagem = new Viagem(motorista1, carroCompacto, 300, "Rio de Janeiro");
        viagem.realizarViagem(gestaoFrota.getListaEletropostos());

        System.out.println(carroCompacto.getAutonomiaAtual());
        gestaoFrota.veiculosComBaixaAutonomia();
        
    }
}
