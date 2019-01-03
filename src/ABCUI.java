import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ABCUI extends JPanel implements KeyListener {
    private ABC abc = new ABC();
    private JLabel letter = new JLabel();

    public ABCUI() {
        setFocusable(true);
        letter.setText(abc.getLetter());
        letter.setFont(new Font(null, Font.BOLD, 600));
        addKeyListener(this);
        add(letter);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            letter.setText(abc.getNewLetter());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}


