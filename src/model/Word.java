package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Word {
    private ArrayList<String> words = new ArrayList<>();
    private ArrayList<String> wordsShown = new ArrayList<>();
    private int current = -1;  //tracks current position of character

    public Word() {
        try {
            load("C:\\Users\\swwbi\\Dropbox\\Education (Sept 2018-)\\Personal Projects\\ABCPrinter\\src\\resources\\100_Words.txt", words);
        } catch (IOException e) {
            System.out.println("File Error.");
        }
    }

    //EFFECTS: loads given file and saves to list
    private void load(String filename, ArrayList<String> wordList) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename));
        for (String line : lines) {
            if (line.contains("*")) {
                line = line.replace("*","");
            }
            wordList.add(line);
        }
    }

    public String getNew() {
        Random r = new Random();
        int n = r.nextInt(words.size());
        String s = words.get(n);
        wordsShown.add(s);
        current++;
        return s;
    }

    public String getPrev() {
        if ((current - 1) >= 0) {
            current--;
            return wordsShown.get(current);
        }
        return wordsShown.get(current);
    }

    public String getNext() {
        if ((current + 1) < wordsShown.size()) {
            current++;
            return wordsShown.get(current);
        }
        return wordsShown.get(current);
    }
}
