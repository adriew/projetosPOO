import java.util.LinkedList;

public class Pedido{
    public class ItemPedido{
        private String nome;
        private int quantia;
        private double precoUni;

        
        public ItemPedido(){}
        public ItemPedido(String nome, int quantia, double precoUni) {
            this.nome = nome;
            this.quantia = quantia;
            this.precoUni = precoUni;
        }

        public String getNome() {
            return this.nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getQuantia() {
            return this.quantia;
        }
        public void setQuantia(int quantia) {
            this.quantia = quantia;
        }
        public double getPrecoUni() {
            return this.precoUni;
        }
        public void setPrecoUni(double precoUni) {
            this.precoUni = precoUni;
        }

        public double subTotal(){
            return this.quantia*this.precoUni;
        }
    }

    private LinkedList<ItemPedido> pedidos = new LinkedList<>();

    public void adicionarItem(String nome, int quantia, double precoUni){
        ItemPedido item = new ItemPedido(nome, quantia, precoUni);
        pedidos.add(item);
    }

    public double valorTotal(){
        double valor = 0;
        for(ItemPedido pedido : pedidos){
            valor += pedido.getPrecoUni()*pedido.getQuantia();
            
        }
        return valor;
    }

    
}