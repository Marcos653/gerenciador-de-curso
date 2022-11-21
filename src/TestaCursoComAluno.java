import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes do java", "Marcos");

        javaColecoes.adiciona(new Aula("Trabalhando com isso", 28));
        javaColecoes.adiciona(new Aula("AAAA", 20));
        javaColecoes.adiciona(new Aula("Trabalhando com isso", 17));

        Aluno a1 = new Aluno("Marcos Costa", 34672);
        Aluno a2 = new Aluno("Costa", 576);
        Aluno a3 = new Aluno("Daniel", 3462);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");

        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("O aluno " + a1 + " está matriculado ?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno costa = new Aluno("Costa", 576);
        System.out.println("O a2 é equals ao costa?");
        System.out.println(a2.equals(costa));

        // Obrigatoriamente o seguinte é true:
        System.out.println(a2.hashCode() == costa.hashCode());

        // hash code é o codigo unico do obj na hr de comparar

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();

        while(iterator.hasNext()) {
            Aluno next = iterator.next();
            System.out.println(next);
        }

        Vector<Aluno> vetor = new Vector<>();
    }
}
