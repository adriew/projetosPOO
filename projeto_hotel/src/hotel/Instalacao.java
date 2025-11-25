package hotel;

public abstract class Instalacao{
    public int andar;
    public boolean disponivel;
    public int capacidade;
    public String descricao;

    public String isDisponivel(){
        return disponivel ? "disponivel" : "Ocupado";
    }
}