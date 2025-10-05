public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("Yan", 23, "M", "01", "Direito");
        Funcionario f1 = new Funcionario("Yuri", 25, "F", "Autópsia");
        Professor p1 = new Professor("Yuzuha", 19, "F", "Administração", 6800.98);

        System.out.println(a1.nome);
        System.out.println(a1.idade);
        System.out.println(a1.sexo);
        System.out.println(a1.getMatricula());
        a1.cancelarMatricula();
        a1.fazerAniv();
        System.out.println();

        System.out.println(f1.nome);
        System.out.println(f1.idade);
        System.out.println(f1.sexo);
        System.out.println(f1.getSetor());
        f1.mudarTrabalho("Embalsamamento");
        f1.fazerAniv();
        System.out.println();

        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.sexo);
        System.out.println(p1.getEspecialidade());
        System.out.println(p1.getSalario());
        p1.receberAumento(379.17);
        p1.fazerAniv();
    }
}
