public class MainCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "toyota";
        carro2.marca = "ford";
        carro1.modelo = "corolla";
        carro2.modelo = "mustang";
        carro1.ano = 2022;
        carro2.ano = 2018;

        carro1.info();
        carro1.ligar();

        carro2.info();
        carro2.ligar();
        
    }
}
