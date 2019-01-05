package ui;

import model.Word;
import ui.panels.PrinterPanel;
import ui.panels.SelectionPanel;

import javax.swing.*;
import java.awt.*;

public class Printer extends JFrame {
    private static Word word = new Word();

    public Printer() {
        setTitle("Randomized Word Printer");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setLayout(new FlowLayout());
        PrinterPanel panel = new PrinterPanel(word);
        SelectionPanel selectionPanel = new SelectionPanel();
        printer.add(selectionPanel); //TODO: Issue with spacebar activating checkbox instead of going next
        printer.add(panel);
        printer.setVisible(true);
    }

}
