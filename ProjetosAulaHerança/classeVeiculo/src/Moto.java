public class Moto extends Veiculo {
    private double cilindrada;

    public Moto(){}
    public Moto(String marca, String modelo, double cilindrada){
        this.marca = marca;
        this.modelo= modelo;
        this.cilindrada = cilindrada;
    }

    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }
    public double getCilindrada(){
        return this.cilindrada;
    }
}
