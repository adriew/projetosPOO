public class MainProduto {
    public static void main(String[] args){
        //criação de produtos
        Produto item01 = new Produto();
        Produto item02 = new Produto();
        Produto item03 = new Produto();

        //Atribuindo nomes
        item01.setNome("Caderno");
        item02.setNome("Caneta");
        item03.setNome("Borracha");

        //Atribuindo preços inválidos
        item01.setPreco(-29.99);
        item02.setPreco(-3.49);
        item03.setPreco(-4.29);

        //Preços válidos (Por desencargo de consciência)
        item01.setPreco(29.99);
        item02.setPreco(3.49);
        item03.setPreco(4.29);

        //imprimindo preço

        System.out.printf("\nProduto: %s \nPreço: %.2f\n\n", item01.getNome(), item01.getPreco());
        System.out.printf("Produto: %s \nPreço: %.2f\n\n", item02.getNome(), item02.getPreco());
        System.out.printf("Produto: %s \nPreço: %.2f", item02.getNome(), item02.getPreco());

    }
}
