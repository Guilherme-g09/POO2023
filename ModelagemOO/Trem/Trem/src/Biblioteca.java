import java.util.Scanner;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Biblioteca {
    public static String[] readFile(String filename) {
        String currDir = Paths.get("").toAbsolutePath().toString();
        String nameComplete = currDir + "/ModelagemOO/Trem/Trem/src/" + filename;
        Path path = Paths.get(nameComplete);

        String stringValues = "";

        try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))) {
            stringValues = sc.nextLine();
        } catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }

        String[] linhas = stringValues.split(";");

        return linhas;
    }
}
