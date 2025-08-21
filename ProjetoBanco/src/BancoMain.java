import java.util.Scanner;

public class BancoMain {

    public static boolean voltar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Gostaria de continuar? ");
        System.out.println("1. Sim         2. Não");
        int continuar = input.nextInt(); 
        return continuar == 1;

    }
    public static void main(String[] args){
        
        // objetos e atributos
        ContaBancaria conta01 = new ContaBancaria();
        ContaBancaria conta02 = new ContaBancaria();
        conta01.numeroConta = "1";
        conta02.numeroConta = "2";
        conta01.saldo = 1000;
        conta02.saldo = 3000;
        conta01.titular = "Yan";
        conta02.titular = "Yuri";

        // variaveis
        boolean ligado = true;
        boolean login = false;
        int ato = 0;
        String conta = "";
        Scanner input = new Scanner(System.in);



            while(login == false)
            {
                System.out.println("Escolha uma conta");
                System.out.println("1.          2." );
                conta = input.nextLine();
                if(conta.equals("1") || conta.equals("2")){
                    login = true;
                }
                else{
                    System.out.println("Insira uma conta válida");
                }
            }

            while(ligado == true){
                System.out.println("Escolha uma ação:");
                System.out.println("1. Sacar    2. Depositar    3. Checar Saldo    4. Sair");
                ato = input.nextInt();

            
            
            switch(ato){
                case 1:
                
                System.out.println("Quanto gostaria de sacar?");
                double valor = input.nextDouble();
                if(conta.equals("1")){
                    if(conta01.saldo >= valor){
                        conta01.sacar(valor);
                    }
                    else{
                        System.out.println("Saldo Insuficiente");
                    }
                }
                else{
                    if(conta02.saldo >= valor){
                        conta02.sacar(valor);
                    }
                    else{
                        System.out.println("Saldo Insuficiente");
                    }
                }
                
                ligado = voltar();

                break;

                case 2:

                System.out.println("Quanto gostaria de depositar?");
                valor = input.nextDouble();
                if(conta.equals("1")){
                    conta01.depositar(valor);
                }
                else{
                    conta02.depositar(valor);
                }
                ligado = voltar();

                break;

                case 3:

                if(conta.equals("1")){
                    conta01.checarSaldo();
                }
                else{
                    conta02.checarSaldo();
                 }
                ligado = voltar();

                break;

                case 4:
                 System.out.println("Agradecemos pela preferencia!");
                 ligado = false;

                break;

                default:

                System.out.println("Insira um valor válido.");

                break;

            }
        }
    }
}
