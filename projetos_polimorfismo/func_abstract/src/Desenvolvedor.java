public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(){}
    public Desenvolvedor(double salarioBase){
        this.salarioBase = salarioBase;
    }
    
    @Override
    public double calcSalarioFinal(){
        return salarioBase + salarioBase*0.1;
    }
}
