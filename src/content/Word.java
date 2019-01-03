package content;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Word implements Content{
    public ArrayList<String> words = new ArrayList<>();

    public Word() {
        try {
            load("C:\\Users\\swwbi\\Dropbox\\Education (Sept 2018-)\\Personal Projects\\ABCPrinter\\src\\resources\\Level1_Words.txt");
        } catch (IOException e) {
            System.out.println("File Error.");
        }
    }

    private void load(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename));
        for (String line : lines) {
            if (line.contains("*")) {
                line = line.replace("*","");
            }
            words.add(line);
        }
    }

    @Override
    public String getNew() {
        Random r = new Random();
        int n = r.nextInt(words.size()) + 1;
        return words.get(n);
    }

}
