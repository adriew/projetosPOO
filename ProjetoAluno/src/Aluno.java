public class Aluno {

    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;

    void dados(){
        System.out.println("DADOS DO ALUNO: ");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Matricula: %d\n", matricula);
        System.out.printf("Nota primeira avaliação: %.2f\n", notaAv1);
        System.out.printf("Nota segunda avaliação: %.2f\n", notaAv2);

    }

    double media(double a, double b){
        
        double nota = (a + b)/2;
        
        return nota;
    }

    void aprovado(){

        double mediaFinal = media(notaAv1, notaAv2);

        if(mediaFinal < 4){
            System.out.println("reprovou.");
        }
        else if(mediaFinal < 7 && mediaFinal >= 4){
            System.out.println("Voce esta na prova final. Estude com mais cuidado.");
        }
        else{
            System.out.printf("Parabens, %s, voce passou!\n", nome);
        }

    }

}
