package ui.panels;

import model.Word;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//Panel to select which sets of words to be used
public class SelectionPanel extends JPanel implements ItemListener {
    private Word word = Word.getInstance();
    private JCheckBox fileOptionABC = new JCheckBox("ABC");
    private JCheckBox fileOptionDigraph = new JCheckBox("Digraph");
    private JCheckBox fileOption0 = new JCheckBox("100 Basic");
    private JCheckBox fileOption1 = new JCheckBox("Grade 1");
    private JCheckBox fileOption2 = new JCheckBox("Grade 2");
    private JCheckBox fileOption3 = new JCheckBox("Grade 3");
    private JCheckBox fileOption4 = new JCheckBox("Grade 4");
    private JCheckBox fileOption5 = new JCheckBox("Grade 5");

    public SelectionPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        fileOptionABC.setSelected(true); //default selection
        fileOptionSetup(fileOptionABC);
        fileOptionSetup(fileOptionDigraph);
        fileOptionSetup(fileOption0);
        fileOptionSetup(fileOption1);
        fileOptionSetup(fileOption2);
        fileOptionSetup(fileOption3);
        fileOptionSetup(fileOption4);
        fileOptionSetup(fileOption5);
    }

    //MODIFIES: this
    //EFFECTS: sets up checkboxes and adds it to selection panel
    private void fileOptionSetup(JCheckBox checkBox) {
        checkBox.setFont(new Font(null, Font.PLAIN, 12));
        checkBox.setFocusable(false);
        checkBox.addItemListener(this);
        add(checkBox);
    }


    //EFFECTS: use selected files as database for random word generation
    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        if (source == fileOptionABC) {
            if (fileOptionABC.isSelected()) {
                word.setABCSelected(true);
            } else {
                word.setABCSelected(false);
            }
        }
        if (source == fileOptionDigraph) {
            if (fileOptionDigraph.isSelected()) {
                word.setDigraphSelected(true);
            } else {
                word.setDigraphSelected(false);
            }
        }
        if (source == fileOption0) {
            if (fileOption0.isSelected()) {
                word.setBasic100WordsSelected(true);
            } else {
                word.setBasic100WordsSelected(false);
            }
        }
        if (source == fileOption1) {
            if (fileOption1.isSelected()) {
                word.setLevel1Selected(true);
            } else {
                word.setLevel1Selected(false);
            }
        }
        if (source == fileOption2) {
            if (fileOption2.isSelected()) {
                word.setLevel2Selected(true);
            } else {
                word.setLevel2Selected(false);
            }
        }
        if (source == fileOption3) {
            if (fileOption3.isSelected()) {
                word.setLevel3Selected(true);
            } else {
                word.setLevel3Selected(false);
            }
        }
        if (source == fileOption4) {
            if (fileOption4.isSelected()) {
                word.setLevel4Selected(true);
            } else {
                word.setLevel4Selected(false);
            }
        }
        if (source == fileOption5) {
            if (fileOption5.isSelected()) {
                word.setLevel5Selected(true);
            } else {
                word.setLevel5Selected(false);
            }
        }
    }
}
