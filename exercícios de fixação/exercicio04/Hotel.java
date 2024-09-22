import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Quarto> quartos;
    private ArrayList<Reserva> reservas;
    
    public Hotel(){
        quartos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void reservarQuarto(Quarto q, Cliente c, LocalDate checkin, LocalDate checkout){
        if (q.isDisponibilidade()){
            Reserva x = new Reserva(q, c, checkin, checkout);
            reservas.add(x);
            q.setDisponibilidade(false);
            System.out.println("Reserva concluida com sucesso\n");
            System.out.println("Quarto reservado: "+q.getNumero()+" "+q.getTipo());
            System.out.println("Nome do cliente: "+c.getNome());
            System.out.println("CheckIn: "+ checkin + " & " + "CheckOut: "+ checkout);
        }else{
            System.out.println("Quarto indisponível");
        }
    }

    public void quartosDisponiveis(String tipo){
        for (Quarto q : quartos){
            if (q.isDisponibilidade() && q.getTipo() == tipo){
                System.out.println("O quarto "+q.getNumero()+" Esta disponível");
            }
        }
    }

    public void cancelarReserva(Quarto q){
        if (q.isDisponibilidade() == false){
            q.setDisponibilidade(true);
        }
    }

    public void reservasFuturas(){
        System.out.println("Reservas: \n");
        for (Reserva r : reservas){
            System.out.println("Quarto: "+ r.getQuarto().getNumero());
            System.out.println("Cliente: "+ r.getCliente().getNome());
            System.out.println("Check In: "+r.getDataCheckIn());
            System.out.println("Check Out: "+r.getDataCheckOut());
        }
    }

}
