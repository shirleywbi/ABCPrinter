package ui;

import model.Word;
import ui.panels.PrinterPanel;
import ui.panels.SelectionPanel;
import ui.panels.TimerPanel;

import javax.swing.*;
import java.awt.*;

public class Printer extends JFrame {

    public Printer() {
        setTitle("Randomized Word Printer");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Word word = Word.getInstance();
        Printer printer = new Printer();
        printer.setLayout(new BorderLayout());
        PrinterPanel panel = new PrinterPanel(word);
        SelectionPanel selectionPanel = new SelectionPanel();
        TimerPanel timerPanel = new TimerPanel();
//        timerPanel.timerStart();
        printer.add(timerPanel, BorderLayout.NORTH);
        printer.add(selectionPanel, BorderLayout.WEST);
        printer.add(panel);
        printer.setVisible(true);
    }

}
