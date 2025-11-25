package hotel.pessoas;

public class Hospede {

    private String nome;
    private boolean reserva; 

    public Hospede(String nome){
        this.nome = nome;
        this.reserva = false;
    }
    public String getNome(){
        return nome;
    }
    public boolean getReserva(){
        return reserva;
    }
    
    public void checkIn(){
        this.reserva = true;
    }
    public void checkOut(){
        this.reserva = false;
    }

    public String hasReserva(){
        return reserva ? "O hóspede possui uma reserva" : "O hóspede não possui reserva";
    }



}
