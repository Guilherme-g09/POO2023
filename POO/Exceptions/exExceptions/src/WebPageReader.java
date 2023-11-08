import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WebPageReader {
    private BufferedReader reader;

    public WebPageReader(String endereco) throws IOException {
        URL url = new URL(endereco);
        this.reader = new BufferedReader(new InputStreamReader(url.openStream()));
        boolean done = false;
        while(!done) {
            String input = this.reader.readLine();
            if (input == null) {
                done = true;
            } 
            else {
                System.out.print(input);
            } 
        }
    }

    public String readLine() throws IOException {
        return this.reader.readLine();
    }
}
