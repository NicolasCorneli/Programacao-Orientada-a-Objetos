public class Principal {
    public static void main(String[] args){
        Frota f = new Frota();
        Veiculo v1 = new Veiculo("SUV", "AAAAB1", 1);
        Veiculo v2 = new Veiculo("Sandero", "BBBAB1", 4);
        
        Motorista m1 = new Motorista("Jorge", 11111);
        Motorista m2 = new Motorista("Alberto", 00000);

        Viagem viagem1 = new Viagem(v1, m2, "Las Vegas", "Califórnia", 700);
        Viagem viagem2 = new Viagem(v2,m1,"Kyoto","Osaka",56);

        f.adicionarVeiculos(v1);
        f.adicionarVeiculos(v2);

        f.registrarViagens(viagem1);
        f.registrarViagens(viagem2);

        f.viagensPorVeiculo(v2);

        f.calcularQuilometragemFrota();

    }
    
}
