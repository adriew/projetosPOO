public class Livros {
    String titulo;
    int    numPags;
    int    anoPubli;
    double preco;

    public Livros(String titulo, int numpags, int anopubli, double preco){
        this.titulo   = titulo;
        this.numPags  = numpags;
        this.anoPubli = anopubli;
        this.preco    = preco;
    }

    void cadastrar(){
        System.err.println("Cadastrando no banco de dados...");
        System.out.println("Cadastrado com sucesso!");
    }
    double calcFrete(String cep){
        int    frete = Integer.parseInt(cep);
        double valFrete = frete/7;
        System.out.println("Calculando frete...");
        System.out.printf("Seu frete ficou %.2f\n", valFrete); //obs: buscar uma forma melhor d calcular isso 
        return valFrete;
    }
    void vender(){
        System.out.printf("Livro vendido por %.2f\n", preco);
    }
}
