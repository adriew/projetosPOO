public class MainBanco {
    public static void main(String[] args) {
        //Criando uma conta
        ContaBancaria conta = new ContaBancaria(120012, 1000);

        //Operações
        conta.sacar(1200);
        System.out.printf("Saldo atual %.2f\n\n", conta.getSaldo());

        conta.depositar(350.50);
        System.out.printf("Saldo atual %.2f\n\n", conta.getSaldo());

        conta.sacar(1200);
        System.out.printf("Saldo atual %.2f", conta.getSaldo());

    }
}
