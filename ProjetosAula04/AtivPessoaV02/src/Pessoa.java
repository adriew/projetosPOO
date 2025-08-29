public class Pessoa{
    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade, String rua, int numero){
        this.nome = nome;
        this.idade = idade;
        this.endereco = new Endereco(rua, numero);
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void mostrarDados(){
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Idade: %d\n", this.idade);
        System.out.printf("endereço: Rua %s; número %d\n\n", this.endereco.getRua(), this.endereco.getNumero());
        

    }
}
