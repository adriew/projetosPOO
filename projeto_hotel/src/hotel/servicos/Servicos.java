package hotel.servicos;

public abstract class Servicos {
    boolean disponivel;
    

    public String isDisponivel(){
        return disponivel ? "disponivel." : "em intervalo.";
    }
}
