import java.time.LocalDate;

public class Reserva {
    private Quarto quarto;
    private Cliente cliente;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;
    
    public Reserva(Quarto quarto, Cliente cliente, LocalDate dataCheckIn, LocalDate dataCheckOut){
        this.quarto = quarto;
        this.cliente = cliente;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;

    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(LocalDate dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(LocalDate dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }
}
