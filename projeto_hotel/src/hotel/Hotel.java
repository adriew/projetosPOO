package hotel;

public class Hotel {
    private Quartos[] quartos;
    private double avaliacao;
    private Lazer[] lazer;

    public Hotel(int numQuartos, double avaliacao, int numLazer){
        this.quartos = new Quartos[numQuartos];
        this.avaliacao = avaliacao;
        this.lazer = new Lazer[numLazer];
    }

    public void adicionarQuarto(Quartos quarto){
        for(int i = 0; i < quartos.length; i++){
           if(quartos[i] == null){
                quartos[i] = quarto;
                return;
           } 
        }
        System.out.println("Não há capacidade para mais quartos.");
    }
    public void adicionarLazer(Lazer lazer){
        for(int i = 0; i < this.lazer.length; i++){
           if(this.lazer[i] == null){
                this.lazer[i] = lazer;
                return;
           } 
        }
        System.out.println("Não há capacidade para mais áreas de lazer.");
    }

    public double getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    public Quartos getQuartos(int atual){
        return quartos[atual];
    }
    public int quantosQuartos(){
        return quartos.length;
    }
    public Lazer getLazer(int atual){
        return lazer[atual];
    }
    public int quantosLazer(){
        return lazer.length;
    }
}
