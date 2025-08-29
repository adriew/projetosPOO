public class Produto {

    private String nome;
    private double preco;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco){
        if(preco >= 0){ 
            this.preco = preco;
        }
        else{
            System.out.println("Por favor, insira um valor válido!");
        }
    }
    public double getPreco(){
        return this.preco;
    }
}
