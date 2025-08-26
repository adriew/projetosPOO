public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito Realizado!");
    }
    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque Realizado!");
        }
        else{
            System.out.println("Saldo Insuficiente.");
        }
    }
    public double getSaldo(){
        return this.saldo;
    }
}
