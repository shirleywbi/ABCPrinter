package content;

import java.util.Random;

public class ABC implements Content{

    @Override
    public String getNew(){
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'A');
        return Character.toString(c);
    }
}
