public class Biblioteca {
    Livro livros[];
    int espacos;

    public Biblioteca(int tamanho)
    {
        this.livros = new Livro[tamanho];
        this.espacos = tamanho;
    }

    public void adicionarLivro(Livro livro){
        if(espacos > 0){
            for(int i = 0; i < livros.length; i++){
                if(this.livros[i] == null){
                    this.livros[i] = livro;
                    this.espacos--;
                    break;
                }
            }
        }
        else{
            System.out.println("Não há espaços disponiveis!");
        }
    }

    public void emprestarLivro(String titulo){
        boolean encontrado = false;
        for(Livro each : this.livros){
            
            if(each != null && each.getTitulo().equalsIgnoreCase(titulo)){ //isso foi dificil
                encontrado = true;
                each.emprestar();
                System.out.println("Aproveite sua leitura!\n");
                break;
            }
        }

        if(!encontrado){
            System.out.println("Não conseguimos encontrar esta obra em nosso estoque.");
        }
        
    }
    public void devolverLivro(String titulo){
        boolean encontrado = false;
        for(Livro each : this.livros){

            if(each != null && each.getTitulo().equalsIgnoreCase(titulo)){
                encontrado = true;
                each.devolver();
                System.out.println("Agradacemos a preferência!\n");
                break;
            }
        }
        if(!encontrado){
            System.out.println("Não encontramos registros de empréstimo para esta obra.");
        }
    }
    public void mostrarLivros(){
        for(Livro each : this.livros){
            if(each != null){
                System.out.printf("Titulo: %s\n", each.getTitulo());
                if(each.isDisponivel()){
                    System.out.printf("Em estoque: sim\n\n");
                }
                else{
                    System.out.printf("Em estoque: não\n\n");
                }
            }
        }
    }
        
}

