public class App {
    public static void main(String[] args) throws Exception {
        Pedido p1 = new Pedido();
        p1.adicionarItem("Borracha", 2, 6.15);
        p1.adicionarItem("Caderno", 3, 27.89);
        p1.adicionarItem("Lápis", 3, 4.31);
        System.out.println("O total do seu pedido fica " + p1.valorTotal() + ".");
    }
}
