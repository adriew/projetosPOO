import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String input1 = null;
        String input2 = null;
        double n1 = 0;
        double n2 = 0;

        while(input1 == null){
            try {
                input1 = JOptionPane.showInputDialog("Insira o primeiro numero");
                n1 = Double.parseDouble(input1.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor insira apenas números");
                input1 = null;
            }
        }
        while(input2 == null){
            try{
                input2 = JOptionPane.showInputDialog("Insira o segundo numero");
                n2 = Double.parseDouble(input2.trim());
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor insira apenas números");
                input2 = null;
            }
        
        }
        int opt = JOptionPane.showOptionDialog(null, "Escolha sua operação", "Calc", 
         JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
          new String[]{" + ", " - "," X ", " ÷ "}, null);

        switch(opt) {
            case 0 -> JOptionPane.showMessageDialog(null,"O resultado é: " + (n1+n2));

            case 1 -> JOptionPane.showMessageDialog(null,"O resultado é: " + (n1-n2));

            case 2 -> JOptionPane.showMessageDialog(null,"O resultado é: " + (n1*n2));

            case 3 -> {
                if(n2 == 0){
                    JOptionPane.showMessageDialog(null,"Não é possivel dividir por 0");
                } else{
                    JOptionPane.showMessageDialog(null,"O resultado é: " + (n1/n2));
                }
            }
        }
                
    }
}
