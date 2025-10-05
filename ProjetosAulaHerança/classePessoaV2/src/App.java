import pessoapac.Fornecedor;

public class App {
    public static void main(String[] args) throws Exception {
        Fornecedor fo = new Fornecedor("Yan", "Av. Alcinco Cacela", "(01) 2345-6789", 33995.81, 23590.12);
        System.out.println(fo.getNome()); 
        System.out.println(fo.getEnd());
        System.out.println(fo.getTelefone());
        System.out.println(fo.getCredito());
        System.out.println(fo.getDivida());
        System.out.printf("%.2f\n", fo.obterSaldo());
    }
}


