import java.util.Random;

public class ABC {
    private Random r = new Random();
    private char c = (char) (r.nextInt(26) + 'A');
    private String s = Character.toString(c);

    public String getLetter(){
        return s;
    }

    public String getNewLetter(){
        r.nextInt();
        char c = (char) (r.nextInt(26) + 'A');
        return Character.toString(c);
    }
}
