public class App {
    public static void main(String[] args) throws Exception {
        Desenvolvedor des = new Desenvolvedor(4780.0);
        Suporte sup = new Suporte(2700.0);

        System.out.println("O salário de desenvolvedor é " + des.calcSalarioFinal() + "\n");
        System.out.println("O salário do suporte é " + sup.calcSalarioFinal());


    }
}
