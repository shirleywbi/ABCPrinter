//References: "Java - Making a timer" by Soham Govande on https://www.youtube.com/watch?v=36jbBSQd3eU was used to develop
//the code for the timer.

package ui.panels;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

public class TimerPanel extends JPanel implements KeyListener {
    private boolean timerOn = false;
    private boolean showTimer = false;
    JLabel time = new JLabel("0");

    int secondsPassed = 0;
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
            secondsPassed++;
            time.setText(Integer.toString(secondsPassed));
        }
    };

    public TimerPanel() {
        setFocusable(true);
        addKeyListener(this);
        add(time);
    }

    //EFFECTS: starts running timer at fixed rate of 1s
    public void timerStart() {
        timer.scheduleAtFixedRate(task,1000,1000);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //EFFECTS: starts timer when space is pressed and if T is pressed show/hide timer
    @Override
    public void keyPressed(KeyEvent e) {
//        if (timerOn == false) {
//            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//                timerStart();
//                timerOn = true;
//            }
//        }
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
