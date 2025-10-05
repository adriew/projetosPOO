package pessoapac;

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(){}
    public Fornecedor(String nome, String endereco, String telefone, double valCredito, double ValDivida){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.valorCredito = valCredito;
        this.valorDivida = ValDivida;
    }

    public void setCredito(double valor){
        this.valorCredito = valor;
    }
    public double getCredito(){
        return this.valorCredito;
    }

    public void setDivida(double valor){
        this.valorDivida = valor;
    }
    public double getDivida(){
        return this.valorDivida;
    }

    public double obterSaldo(){
        return this.valorCredito - this.valorDivida;
    }
}
