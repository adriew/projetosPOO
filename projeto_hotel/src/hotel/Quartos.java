package hotel;

public class Quartos extends Instalacao {
    private int camas;
    
    public Quartos(int andar, int capacidade, int camas){
        this.disponivel = true;
        
        this.andar = andar;
        this.capacidade = capacidade;
        this.camas = camas;
        this.descricao = "Quarto localizado no " + andar + "º com " + 
         camas + " camas e capacidade para " + capacidade + " pessoas.";
    }
 
    public int getCamas() {
        return camas;
    }
    public void setCamas(int camas) {
        this.camas = camas;
    }

    public void reservar(){
        this.disponivel = false;
    }
    public void liberar(){
        this.disponivel = true;
    }

    public String getDescricao(){
        return descricao;
    }
}
