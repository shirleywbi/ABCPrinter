package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Word {
    private HashMap<Integer,ArrayList<String>> wordMap = new HashMap<>();
    private ArrayList<String> wordsShown = new ArrayList<>();
    private int current = -1;  //tracks current position of character

    //EFFECTS: loads all files into hash map
    public Word() {
        try {
            load("C:\\Users\\swwbi\\Dropbox\\Education (Sept 2018-)\\Personal Projects\\ABCPrinter\\src\\resources\\Alphabet.txt", 1);
            load("C:\\Users\\swwbi\\Dropbox\\Education (Sept 2018-)\\Personal Projects\\ABCPrinter\\src\\resources\\Digraph.txt",2);
            load("C:\\Users\\swwbi\\Dropbox\\Education (Sept 2018-)\\Personal Projects\\ABCPrinter\\src\\resources\\100_Words.txt", 3);
            load("C:\\Users\\swwbi\\Dropbox\\Education (Sept 2018-)\\Personal Projects\\ABCPrinter\\src\\resources\\Level1_Words.txt", 4);
            load("C:\\Users\\swwbi\\Dropbox\\Education (Sept 2018-)\\Personal Projects\\ABCPrinter\\src\\resources\\Level2_Words.txt", 5);
            load("C:\\Users\\swwbi\\Dropbox\\Education (Sept 2018-)\\Personal Projects\\ABCPrinter\\src\\resources\\Level3_Words.txt", 6);
            load("C:\\Users\\swwbi\\Dropbox\\Education (Sept 2018-)\\Personal Projects\\ABCPrinter\\src\\resources\\Level4_Words.txt", 7);
            load("C:\\Users\\swwbi\\Dropbox\\Education (Sept 2018-)\\Personal Projects\\ABCPrinter\\src\\resources\\Level5_Words.txt", 8);
        } catch (IOException e) {
            System.out.println("File Error.");
        }
    }

    //MODIFIES: this
    //EFFECTS: loads given file and saves to hash map
    private void load(String filename, Integer key) throws IOException {
        ArrayList<String> words = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get(filename));
        for (String line : lines) {
            if (line.contains("*")) {
                line = line.replace("*","");
            }
            words.add(line);
        }
        wordMap.put(key,words);
    }

    //REQUIRES: files must be loaded into hash map
    //EFFECTS: return a random word from a randomly selected file
    public String getNew() {
        Random randomFile = new Random();
        int fileIndex = randomFile.nextInt(wordMap.size()-1);
        ArrayList<String> randomList = wordMap.get(fileIndex);
        Random randomWord = new Random();
        int wordIndex = randomWord.nextInt(randomList.size()-1);
        String s = randomList.get(wordIndex);
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
