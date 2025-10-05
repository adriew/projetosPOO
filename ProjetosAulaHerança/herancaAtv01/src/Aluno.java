public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, String matricula, String curso){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
    }

    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getCurso() {
        return this.curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
