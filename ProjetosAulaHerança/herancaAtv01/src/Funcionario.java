public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String sexo, String setor){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.setor = setor;

    }
    public void mudarTrabalho(String setor){
        this.setor = setor;
        System.out.printf("Novo setor: %s\n", this.setor);
    }
    public String getSetor() {
        return this.setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean isTrabalhando() {
        return this.trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    
}
