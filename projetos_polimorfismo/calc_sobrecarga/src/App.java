public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Método com 2 inteiros chamado\nResultado: " + Calculadora.somar(1, 2));
        
        System.out.println("\nMétodo com 3 inteiros chamado\nResultado: " 
        + Calculadora.somar(1, 2, 3));

        System.out.println("\nMétodo com 2 reais chamado\nResultado: " + Calculadora.somar(1.5, 3.2));
    }
}
