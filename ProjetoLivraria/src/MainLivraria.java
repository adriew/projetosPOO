public class MainLivraria {
    public static void main(String[] args) {
        
        // criando objetos
        Livros liv1 = new Livros("Tomie vol. 1", 376, 1987, 99.99);
        Livros liv2 = new Livros("Dismorfos", 397, 2018, 119.60);
        Clientes pessoa1 = new Clientes("Yan", 22, "1001");
        Clientes pessoa2 = new Clientes("Yuri", 28, "2002");

        liv1.cadastrar();
        liv2.cadastrar();
        System.out.println("Cadastrado com sucesso!");

        pessoa1.checarPerfil();

        System.out.println("Checando livros disponiveis...");
        System.out.printf("Livro: %s\npreço: %.2f\nano de publicação: %d\npaginas: %d\n", liv1.titulo, liv1.preco, liv1.anoPubli, liv1.numPags);
        System.out.printf("Livro: %s\npreço: %.2f\nano de publicação: %d\npaginas: %d\n", liv2.titulo, liv2.preco, liv2.anoPubli, liv2.numPags);

        System.err.println("Calculando frete...");

        liv2.calcFrete("19890");

        System.out.println("Prosseguindo para a compra...");

        liv2.vender();

        pessoa1.ler();
        pessoa2.ler();


    }
}
