package pessoapac;

    public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;

    public Pessoa(){}
    public Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    public Pessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setEnd(String rua){
        this.endereco = rua;
    }
    public String getEnd(){
        return this.endereco;
    }

    public void setTelefone(String numero){
        this.telefone = numero;
    }
    public String getTelefone(){
        return this.telefone;
    }

}

