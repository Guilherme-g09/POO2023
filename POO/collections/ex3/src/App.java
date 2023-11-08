import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class App {
    public static List<Integer> getMatriculasRegistrados(List<Integer> matriculas) {
        return new ArrayList<Integer>(new TreeSet<>(matriculas));
    }

    public static void main(String[] args) throws Exception {
        List<Integer> matriculas = Arrays.asList(10, 10, 20, 30, 40, 50, 60, 10);
        List<Integer> matriculasSemDupli = getMatriculasRegistrados(matriculas);
        System.out.print(matriculasSemDupli);
    }
}
