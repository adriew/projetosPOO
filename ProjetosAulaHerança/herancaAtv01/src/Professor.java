public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String sexo, String especialidade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(double valor){
        this.salario += valor;
        System.out.printf("Novo salário: %.2f\n", this.salario);
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
