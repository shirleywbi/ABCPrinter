import content.Word;

import javax.swing.*;
import java.awt.*;

public class WordPrinter extends JFrame {
    private static Word word = new Word();

    public WordPrinter() {
        setTitle("Word Printer");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        WordPrinter wordPrinter = new WordPrinter();
        wordPrinter.setLayout(new FlowLayout());
        PrinterUI panel = new PrinterUI(word);
        wordPrinter.add(panel);
        wordPrinter.setVisible(true);
    }

}
