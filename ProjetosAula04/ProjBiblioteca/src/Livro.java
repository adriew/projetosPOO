public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public boolean isDisponivel(){
        return this.disponivel;
    }

    public void emprestar(){
        if(this.disponivel){
            this.disponivel = false;
        }
        else{
            System.out.println("Infelizmente este livro não está disponivel.");
        }
    }

    public void devolver(){
        if(!this.disponivel){
            this.disponivel = true;
        }
        else{
            System.out.println("Este livro ainda não foi emprestado.");
        }
    }
}
