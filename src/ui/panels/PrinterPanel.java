package ui.panels;

import model.Word;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//User interface for displaying words/characters
public class PrinterPanel extends JPanel implements KeyListener {
    private JLabel wordDisplay = new JLabel();
    private Word word;

    //TODO: Make it so if width of word is larger than screen, shrink word to fit
    public PrinterPanel(Word word) {
        this.word = word;
        setFocusable(true);
        wordDisplay.setText(word.getNew());
        wordDisplay.setFont(new Font(null, Font.BOLD, 500));
        wordDisplay.setAlignmentY(CENTER_ALIGNMENT);
        addKeyListener(this);
        add(wordDisplay);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //MODIFIES: this
    //EFFECTS: when space key is pressed, show new word
    //         when left arrow key is pressed, show previously displayed word
    //         when right arrow key is pressed, show word that had been displayed next
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            wordDisplay.setText(word.getNew());
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            wordDisplay.setText(word.getPrev());
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            wordDisplay.setText(word.getNext());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
