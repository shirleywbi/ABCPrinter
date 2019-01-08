package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Word {
    private int current = -1;  //tracks current position of character
    private boolean ABCSelected = true;
    private boolean digraphSelected = false;
    private boolean basic100WordsSelected = false;
    private boolean level1Selected = false;
    private boolean level2Selected = false;
    private boolean level3Selected = false;
    private boolean level4Selected = false;
    private boolean level5Selected = false;

    private HashMap<Integer,ArrayList<String>> wordMap = new HashMap<>();
    private ArrayList<String> wordsShown = new ArrayList<>();
    private static Word instance = null;

    //EFFECTS: loads all files into hash map
    private Word() {
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

    public static Word getInstance() {
        if (instance == null) {
            instance = new Word();
        }
        return instance;
    }

    //REQUIRES: valid file path
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
    //MODIFIES: this
    //EFFECTS: return a random word from a randomly file that has been selected
    public String getNew() {
        //Randomly selects file
        Random randomFile = new Random();
        int fileIndex = selected().get(randomFile.nextInt(selected().size()));
        ArrayList<String> randomList = wordMap.get(fileIndex);
        //Randomly selects word from list
        Random randomWord = new Random();
        int wordIndex = randomWord.nextInt(randomList.size());
        String s = randomList.get(wordIndex);
        wordsShown.add(s);
        current++;
        return s;
    }

    //EFFECTS: returns a list of selected file numbers
    private ArrayList<Integer> selected() {
        ArrayList<Integer> selectedFileNumbers = new ArrayList<>();
        if (ABCSelected) {
            selectedFileNumbers.add(1);
        } else {
            selectedFileNumbers.remove(Integer.valueOf(1));
        }
        if (digraphSelected) {
            selectedFileNumbers.add(2);
        } else {
            selectedFileNumbers.remove(Integer.valueOf(2));
        }
        if (basic100WordsSelected) {
            selectedFileNumbers.add(3);
        } else {
            selectedFileNumbers.remove(Integer.valueOf(3));
        }
        if (level1Selected) {
            selectedFileNumbers.add(4);
        } else {
            selectedFileNumbers.remove(Integer.valueOf(4));
        }
        if (level2Selected) {
            selectedFileNumbers.add(5);
        } else {
            selectedFileNumbers.remove(Integer.valueOf(5));
        }
        if (level3Selected) {
            selectedFileNumbers.add(6);
        } else {
            selectedFileNumbers.remove(Integer.valueOf(6));
        }
        if (level4Selected) {
            selectedFileNumbers.add(7);
        } else {
            selectedFileNumbers.remove(Integer.valueOf(7));
        }
        if (level5Selected) {
            selectedFileNumbers.add(8);
        } else {
            selectedFileNumbers.remove(Integer.valueOf(8));
        }
        return selectedFileNumbers;
    }

    //EFFECTS: returns word that was shown previous
    public String getPrev() {
        if ((current - 1) >= 0) {
            current--;
            return wordsShown.get(current);
        }
        return wordsShown.get(current);
    }

    //EFFECTS: returns word that was shown next
    public String getNext() {
        if ((current + 1) < wordsShown.size()) {
            current++;
            return wordsShown.get(current);
        }
        return wordsShown.get(current);
    }

    //setters
    public void setABCSelected(boolean ABCSelected) {
        this.ABCSelected = ABCSelected;
    }
    public void setDigraphSelected(boolean digraphSelected) {
        this.digraphSelected = digraphSelected;
    }
    public void setBasic100WordsSelected(boolean basic100WordsSelected) {
        this.basic100WordsSelected = basic100WordsSelected;
    }
    public void setLevel1Selected(boolean level1Selected) {
        this.level1Selected = level1Selected;
    }
    public void setLevel2Selected(boolean level2Selected) {
        this.level2Selected = level2Selected;
    }
    public void setLevel3Selected(boolean level3Selected) {
        this.level3Selected = level3Selected;
    }
    public void setLevel4Selected(boolean level4Selected) {
        this.level4Selected = level4Selected;
    }
    public void setLevel5Selected(boolean level5Selected) {
        this.level5Selected = level5Selected;
    }
}
