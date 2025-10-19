public class Suporte extends Funcionario {
    public Suporte(){}
    public Suporte(double salarioBase){
        this.salarioBase = salarioBase;
    }
    @Override
    public double calcSalarioFinal(){
        return salarioBase + 200.0;
    }
}
