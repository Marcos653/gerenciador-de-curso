import java.util.List;

public class TestaListaDeCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes do java", "Marcos");
        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println("---------------------------");
        System.out.println(aulas);

        // aulas.add(new Aula("Trabalhando com ArrayList", 21));

        System.out.println("---------------------------");
        System.out.println(aulas);
        System.out.println("---------------------------");
        System.out.println(javaColecoes.getAulas());
        System.out.println("---------------------------");

        // javaColecoes.getAulas().add(new Aula("Trabalhando com isso", 28));
        javaColecoes.adiciona(new Aula("Trabalhando com isso", 28));
        javaColecoes.adiciona(new Aula("Trabalhando com isso", 20));
        javaColecoes.adiciona(new Aula("Trabalhando com isso", 17));

        System.out.println("---------------------------");
        System.out.println(javaColecoes.getAulas());
        System.out.println("---------------------------");

    }
}
