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
        printer.setLayout(new BorderLayout());
        PrinterPanel panel = new PrinterPanel(word);
        SelectionPanel selectionPanel = new SelectionPanel();
        printer.add(selectionPanel, BorderLayout.PAGE_START);
        printer.add(panel);
        printer.setVisible(true);
    }

}
