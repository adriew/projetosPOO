public class App {
    public static void main(String[] args) throws Exception {
        Veiculo[] veiculos = new Veiculo[3];
        Carro c1 = new Carro("Renault", "Sandero", 4);
        Carro c2 = new Carro("Mitsubishi", "Pajero", 4);
        Moto m1 = new Moto("Honda", "CB 500X", 471);

        veiculos[0] = c1;
        veiculos[1] = c2;
        veiculos[2] = m1;

        for(Veiculo v : veiculos){
            v.exibirInfo();
        }

        
    }
}
