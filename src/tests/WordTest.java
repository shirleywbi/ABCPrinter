package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class WordTest {
    private ArrayList<String> testWordsShown = new ArrayList<>();

    @BeforeEach
    public void setup() {
        testWordsShown.add("test1");
        testWordsShown.add("test2");
        testWordsShown.add("test3");
        testWordsShown.add("test4");
        testWordsShown.add("test5");
    }

    //TODO: Check that files are loading their arrays properly - that all the words are in the list, no duplicates
    @Test
    public void testLoad() {

    }

    //TODO: Check that all the words in a given file can be reached: first word, last word, middle word
    @Test
    public void testGetNew() {

    }

    @Test
    public void testGetPrevNotLast() {

    }

    @Test
    public void testGetPrevLastOne() {

    }

    @Test
    public void testGetNextLastOne() {

    }

    @Test
    public void testGetNextNotLast() {

    }

}
