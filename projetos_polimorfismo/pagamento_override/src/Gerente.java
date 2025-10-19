public class Gerente extends Funcionario{

    public Gerente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public double calcularSalario(){
        double salario = super.calcularSalario();
        return salario + 500.00;
    }

}
