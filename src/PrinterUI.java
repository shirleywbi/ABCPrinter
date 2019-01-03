import content.Content;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PrinterUI extends JPanel implements KeyListener {
    private JLabel wordDisplay = new JLabel();
    private Content content;

    public PrinterUI(Content content) {
        this.content = content;
        setFocusable(true);
        wordDisplay.setText(content.getNew());
        wordDisplay.setFont(new Font(null, Font.BOLD, 600));
        addKeyListener(this);
        add(wordDisplay);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
            wordDisplay.setText(content.getNew());
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
