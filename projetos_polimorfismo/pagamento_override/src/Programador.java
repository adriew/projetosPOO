public class Programador extends Funcionario {
    public Programador(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public double calcularSalario(){
        double salario = super.calcularSalario();
        return salario + salario*0.2;
    }
}
