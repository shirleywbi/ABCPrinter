package content;

import java.util.ArrayList;
import java.util.Random;

//TODO: Convert to iterator
public class ABC implements Content{
    private ArrayList<String> charShown = new ArrayList<>();
    private int current = -1;  //tracks current position of character

    //EFFECTS: returns new character and adds to list of characters shown so far
    @Override
    public String getNew(){
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'A');
        String s = Character.toString(c);
        charShown.add(s);
        current++;
        return s;
    }

    //EFFECTS: returns previous character; does nothing if no characters to return
    @Override
    public String getPrev() {
        if ((current - 1) >= 0) {
            current--;
            return charShown.get(current);
        }
        return charShown.get(current);
    }

    //EFFECTS: returns next character; does nothing if no characters to return
    @Override
    public String getNext() {
        if ((current + 1) < charShown.size()) {
            current++;
            return charShown.get(current);
        }
        return charShown.get(current);
    }
}
