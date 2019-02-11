//References: "Java - Making a timer" by Soham Govande on https://www.youtube.com/watch?v=36jbBSQd3eU was used to develop
//the code for the timer.
//TODO: Try this: https://examples.javacodegeeks.com/desktop-java/awt/event/a-simple-timer-example/

package ui.panels;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

public class TimerPanel extends JPanel implements KeyListener {
    private boolean timerOn = false;
    private boolean showTimer = false;
    private JLabel time = new JLabel("0");
    private int count = 0;

    public TimerPanel() {
        setFocusable(true);
        addKeyListener(this);
        add(time);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //EFFECTS: starts timer when space is pressed and if T is pressed show/hide timer
    @Override
    public void keyPressed(KeyEvent e) {
        if (timerOn == false) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                Timer timer = new Timer();
                timer.scheduleAtFixedRate(new TimerTask() {
                    public void run() {
                        count++;
                        time.setText(Integer.toString(count));
                    }
                }, 0, 1000);
                timerOn = true;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_T) {
            if (showTimer == false) {
                setVisible(true);
            } else {
                setVisible(false);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
