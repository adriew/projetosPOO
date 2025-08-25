public class ContaBancaria {

    String numeroConta;
    String titular;
    double saldo; 

    void depositar(double a){

        saldo += a;

    }
    void sacar(double a){
        if(saldo >= a)
        {
            saldo -= a;
        }
        else{
            System.out.println("Seu saldo é insuficiente.");
        }
    }
    void checarSaldo(){
        System.out.printf("Seu saldo é: %.2f\n", saldo);
    }
 
}
