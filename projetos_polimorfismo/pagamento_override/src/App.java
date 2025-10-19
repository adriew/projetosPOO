public class App {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Eco";
        Gerente gerente = new Gerente("Yan", "123.456.789-01");
        Programador programador = new Programador("Yuri", "098.765.432-10");

        Funcionario[] funcionarios = new Funcionario[]{funcionario, gerente, programador};
        for(Funcionario f : funcionarios){
            System.out.printf("O salario de %s é %.2f\n",f.nome, f.calcularSalario());
        }

        
    }
}
