package hotel;

public class Lazer extends Instalacao{
    private String nome;
    private String horaFuncionamento;

    public Lazer(String nome, String horaFuncionamento){
        this.nome = nome;
        this.horaFuncionamento = horaFuncionamento;
        this.disponivel = true;
        this.descricao = "Área de lazer com funcionamento das " + horaFuncionamento + ".";
    }

    public void setHoraFuncionamento(String horas){
        this.horaFuncionamento = horas;
    }
    public String getHoraFuncionamento(){
        return horaFuncionamento;
    }
}
