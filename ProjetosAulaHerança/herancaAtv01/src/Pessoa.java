public abstract class Pessoa{
    String nome;
    int idade;
    String sexo;

    public void fazerAniv(){
        this.idade++;
        System.out.printf("Parabéns pelos %d anos\n", this.idade);
    }
}