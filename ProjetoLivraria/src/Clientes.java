public class Clientes {
    String nome;
    String cadastro;
    int    idade;

    public Clientes(String nome, int idade, String cadastro){
        this.nome = nome;
        this.cadastro = cadastro;
        this.idade = idade;
    }

    void checarPerfil(){
        System.out.printf("---- Perfil de Cliente: ----\n");
        System.out.printf("Nome: %s\n,", nome);
        System.out.printf("Idade: %d\n", idade);
        System.out.printf("Cadastro: %s\n", cadastro);

    }
    void ler(){
        System.out.println("Leitura realizada sucesso! Inteligencia aumentou em 10 pontos!");

    }
}
