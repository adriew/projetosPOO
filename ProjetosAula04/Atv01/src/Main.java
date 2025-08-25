public class Main {
    public static void main(String[] args){

        //Criação de objetos 
        Pessoa pessoa01 = new Pessoa("Yan", 23);
        Pessoa pessoa02 = new Pessoa("Yuri", 25);

        //IMprimindo seus valorws
        System.out.printf("Nome: %s\n", pessoa01.nome);
        System.out.printf("Idade: %d\n", pessoa01.idade);
        System.out.printf("Nome: %s\n", pessoa02.nome);
        System.out.printf("Idade: %d", pessoa02.idade);

        
    }
}
