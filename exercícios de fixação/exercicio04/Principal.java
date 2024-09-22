import java.time.LocalDate;
public class Principal {
    public static void main(String[] args){
        Hotel h = new Hotel();

        Quarto q0 = new Quarto(0, "Suíte");
        h.adicionarQuarto(q0);
        Quarto q1 = new Quarto(1, "Suíte");
        h.adicionarQuarto(q1);
        Quarto q2 = new Quarto(2, "Comum");
        h.adicionarQuarto(q2);
        Quarto q3 = new Quarto(3, "Comum");
        h.adicionarQuarto(q3);

        Cliente c0 = new Cliente("José", 0, "555555555");
        Cliente c1 = new Cliente("Leandro", 1, "77777777777");
        

        h.reservarQuarto(q0, c0, LocalDate.of(2024,9,1),LocalDate.of(2024,10,1));
        h.reservarQuarto(q1, c1, LocalDate.of(2024,9,1),LocalDate.of(2024,10,1));
        h.reservarQuarto(q2, c1, LocalDate.of(2024,10,1),LocalDate.of(2024,11,1));


        h.reservasFuturas();

        h.quartosDisponiveis("Comum");
    }
    
}
