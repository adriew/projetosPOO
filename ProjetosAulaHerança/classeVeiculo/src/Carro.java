public class Carro extends Veiculo{
    private int quantidadePortas;

    public Carro(){}
    public Carro(String marca, String modelo, int quantidadePortas){
        this.marca = marca;
        this.modelo = modelo;
        this.quantidadePortas = quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas){
        this.quantidadePortas = quantidadePortas;
    }
    public int getQuantidadePortas(){
        return this.quantidadePortas;
    }
}
