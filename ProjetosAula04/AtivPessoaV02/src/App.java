public class App {
    public static void main(String[] args){
        //criando endereços
        Endereco end01 = new Endereco("Caripunas", 44);
        Endereco end02 = new Endereco("Alcindo Cacela", 3);

        //criando pessoas
        Pessoa pes01 = new Pessoa("Yan", 23, end01.getRua(), end01.getNumero());
        Pessoa pes02 = new Pessoa("Yuri", 28, end02.getRua(), end02.getNumero()); 

        //Mostrando dados
        pes01.mostrarDados();
        pes02.mostrarDados();
    }
}
