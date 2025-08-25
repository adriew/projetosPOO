public class Carro {
    String marca;
    String modelo;
    int ano;

    void info(){
        System.out.println("--CARRO--");
        System.out.printf(" - Marca: %s\n", marca);
        System.out.printf(" - Modelo: %s\n", modelo);
        System.out.printf(" - Ano: %d\n", ano);
    }
    void ligar(){
        System.out.println("Carro Ligado!");
    }

}