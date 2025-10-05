public abstract class Veiculo{
    protected String marca;
    protected String modelo;

    public Veiculo(){}
    public Veiculo(String marca, String modelo){}

    public void exibirInfo(){
        System.out.printf("Marca: %s\nModelo: %s\n\n", this.marca, this.modelo);
    }



}