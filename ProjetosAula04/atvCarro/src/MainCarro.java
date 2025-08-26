public class MainCarro {
    public static void main(String[] args) {
        //criando objetos
        Carro car01 = new Carro("Toyota", 1995);
        Carro car02 = new Carro("Nissan", 2023);

        //exibindo atributos 

        System.out.printf("carro: %s\n", car01.getMarca());
        System.out.printf("Ano: %d\n\n", car01.getAno());

        System.out.printf("carro: %s\n", car02.getMarca());
        System.out.printf("Ano: %d", car02.getAno());

    }
}
