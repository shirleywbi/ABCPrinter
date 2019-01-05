package ui.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//Panel to select which sets of words to be used
public class SelectionPanel extends JPanel implements ItemListener {
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
        checkBox.setFont(new Font(null,Font.PLAIN,12));
        checkBox.setFocusable(false);
        checkBox.addItemListener(this);
        add(checkBox);
    }


    //EFFECTS: use selected files as database for random word generation
    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getItemSelectable();
        if (source == fileOptionABC) {

        }
        if (source == fileOptionDigraph) {

        }
        if (source == fileOption0) {

        }
        if (source == fileOption1) {

        }
        if (source == fileOption2) {

        }
        if (source == fileOption3) {

        }
        if (source == fileOption4) {

        }
        if (source == fileOption5) {

        }
    }
}
