public class Main {
    public static void main(String[] args){
        //Criando uma biblioteca
        Biblioteca saraiva = new Biblioteca(5);
        
        //Criando livros para adicionar na biblioteca
        Livro liv01 = new Livro("Tomie", "Junji Ito");
        Livro liv02 = new Livro("Disformos", "Junji Ito");
        Livro liv03 = new Livro("Fragmentos do Horror", "Junji Ito");

        //adicionando os livros na biblioteca
        saraiva.adicionarLivro(liv01);
        saraiva.adicionarLivro(liv02);
        saraiva.adicionarLivro(liv03);

        //Mostrar livros cadastrados
        saraiva.mostrarLivros();

        // Emprestar um livtro
        saraiva.emprestarLivro("tomie");

        //Devolver o mesmo livro que foi emprestado
        saraiva.devolverLivro("Tomie");

        //mostrar livros (bem, mais uma vez...)
        saraiva.mostrarLivros();

    }
}
