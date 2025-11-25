import hotel.Hotel;
import hotel.Lazer;
import hotel.Quartos;
import hotel.pessoas.Hospede;
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        Hotel hotel = new Hotel(6, 3.75, 4);
        Quartos quarto1 = new Quartos(1, 2, 1);
        Quartos quarto2 = new Quartos(1, 3, 2);
        Quartos quarto3 = new Quartos(2, 2, 1);
        Quartos quarto4 = new Quartos(2, 4, 3);
        Quartos quarto5 = new Quartos(3, 2, 1);
        Quartos quarto6 = new Quartos(3, 5, 4);
        quarto2.reservar();
        quarto4.reservar();
        hotel.adicionarQuarto(quarto1);
        hotel.adicionarQuarto(quarto2);
        hotel.adicionarQuarto(quarto3);
        hotel.adicionarQuarto(quarto4);
        hotel.adicionarQuarto(quarto5);
        hotel.adicionarQuarto(quarto6);
        Lazer fliperama = new Lazer("Fliperama", "8:00 às 18:00");
        Lazer piscina = new Lazer("Piscina", "7:00 às 20:00");
        Lazer sauna = new Lazer("Sauna", "10:00 às 22:00");
        Lazer academia = new Lazer("Academia", "6:00 às 23:00");

        hotel.adicionarLazer(sauna);
        hotel.adicionarLazer(fliperama);
        hotel.adicionarLazer(piscina);
        hotel.adicionarLazer(academia);

        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        Hospede hospede1 = new Hospede(nome);

        JOptionPane.showMessageDialog(null, "Boas-vindas ao hotel, " + nome + "!");
        String opcoes[] = {"inicio", "quartos", "servicos"};
        String menu = opcoes[0];
        int atual = 0;
        
        while(true){
            switch(menu){
                case "inicio" -> {
                    if(!hospede1.getReserva()){
                        int escolha = JOptionPane.showOptionDialog(null, "Atualmente você não tem uma reserva em nosso Hotel.",
                            "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[]{"Quartos", "Sair"}, "Quartos");
                            System.out.println(escolha);
                            if(escolha == 0){
                            menu = opcoes[1];
                            System.out.println(menu);
                        }else{
                            System.exit(0);
                        }
                    }else{
                        int escolha = JOptionPane.showOptionDialog(null, "Quais dos nossos serviços gostaria de usurfruir?", 
                        "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
                        new String[]{"Serviços", "Checkout", "Sair"}, null);

                        switch(escolha){
                            case 0 -> {
                                menu = opcoes[2];
                            }
                            case 1 -> {
                                JOptionPane.showMessageDialog(null , "Agradecemos pela preferencia! Volte sempre!");
                                hospede1.checkOut();
                            }
                            default -> System.exit(0);
                    }
                    }
                }
                case "quartos" ->{
                    Quartos quartoatual = hotel.getQuartos(atual);
                    
                    if(atual == 0){
                        int escolha = JOptionPane.showOptionDialog(null, quartoatual.descricao, 
                            "Quartos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                             null, new String[]{"Próximo", "Reservar", "Sair"}, "Próximo");
                        switch (escolha) {
                            case 0 -> atual++;
                            case 1 -> {
                                if(quartoatual.disponivel){
                                    quartoatual.reservar();
                                    hospede1.checkIn();
                                    JOptionPane.showMessageDialog(null, "Quarto reservado com sucesso!");
                                    menu = opcoes[0];
                                }else{
                                    JOptionPane.showMessageDialog(null, "Desculpe, este quarto não está disponível.");
                                }
                            }
                            default -> menu = opcoes[0];
                        }
                    }else if(atual == hotel.quantosQuartos() - 1){
                        int escolha = JOptionPane.showOptionDialog(null, quartoatual.descricao, 
                        "Quartos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                            null, new String[]{"Anterior", "Reservar", "Sair"}, "Próximo");
                        switch (escolha) {
                            case 0 -> atual--;
                            case 1 -> {
                                if(quartoatual.disponivel){
                                    quartoatual.reservar();
                                    hospede1.checkIn();
                                    JOptionPane.showMessageDialog(null, "Quarto reservado com sucesso!");
                                    menu = opcoes[0];
                                }else{
                                    JOptionPane.showMessageDialog(null, "Desculpe, este quarto não está disponível.");
                                }
                            }
                            default -> menu = opcoes[0];
                        }
                    }else{
                        int escolha = JOptionPane.showOptionDialog(null, quartoatual.descricao, 
                         "Quartos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                            null, new String[]{"Anterior", "Reservar", "Próximo", "Sair"}, 
                             "Próximo");
                        switch (escolha) {
                            case 0 -> atual--;
                            case 1 ->{
                                if(quartoatual.disponivel){
                                    quartoatual.reservar();
                                    hospede1.checkIn();
                                    JOptionPane.showMessageDialog(null, "Quarto reservado com sucesso!");
                                    menu = opcoes[0];
                                }else{
                                    JOptionPane.showMessageDialog(null, "Desculpe, este quarto não está disponível.");
                                }
                            }
                            case 2 -> atual++;
                            default -> menu = opcoes[0];
                        }
                    }
                }
                case "servicos" -> { 
                        int escolha = JOptionPane.showOptionDialog(null, "Quais dos nossos serviços gostaria de checar?",
                      "Menu de serviços", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
                                new String[]{"Serviços de Quarto", "Voltar"}, null);

                        if(escolha == 0){
                            JOptionPane.showMessageDialog(null, "Serviços de quarto não estão disponíveis no momento.");
                        }else{
                            menu = opcoes[0];
                        }
                }
            }
        }

    }
}
        