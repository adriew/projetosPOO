public class ProjAluno {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();

        aluno01.nome = "Yan";
        aluno02.nome = "Yuri";

        aluno01.matricula = 1234;
        aluno02.matricula = 4321;

        aluno01.notaAv1 = 4.5;
        aluno02.notaAv1 = 9.0;

        aluno01.notaAv2 = 8.0;
        aluno02.notaAv2 = 8.0;

        aluno01.dados();
        aluno02.dados();

        aluno01.aprovado();
        aluno02.aprovado();

    }
}
