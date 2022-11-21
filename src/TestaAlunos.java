import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Marcos");
        alunos.add("Alberto Souza");
        alunos.add("Matheus Souza");
        alunos.add("Renan Souza");
        alunos.add("Renan Souza");

        boolean pauloEstaMatriculado = alunos.contains("Marcos");
        alunos.remove("Alberto Souza");

        System.out.println(pauloEstaMatriculado);
        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        List<String> alunosEmList = new ArrayList<>(alunos);

    }
}
