package content;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TODO: Consider implementation of wordsShown ArrayList --
// Is this the best way to store this data? Would it be better to convert existing to hashmap?
// It will depend on # of words vs. # of traverses through list
public class Word implements Content{
    private ArrayList<String> words = new ArrayList<>();
    private ArrayList<String> wordsShown = new ArrayList<>();
    private int current = 0;  //tracks current position of character

    public Word() {
        try {
            load("C:\\Users\\swwbi\\Dropbox\\Education (Sept 2018-)\\Personal Projects\\ABCPrinter\\src\\resources\\100_Words.txt");
        } catch (IOException e) {
            System.out.println("File Error.");
        }
    }

    //EFFECTS: loads given file and saves to list
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
        String s = words.get(n);
        wordsShown.add(s);
        current++;
        return s;
    }

    @Override
    public String getPrev() {
        if ((current - 1) >= 0) {
            current--;
            return wordsShown.get(current);
        }
        return wordsShown.get(current);
    }

    @Override
    public String getNext() {
        if ((current + 1) < wordsShown.size()) {
            current++;
            return wordsShown.get(current);
        }
        return wordsShown.get(current);
    }


}
