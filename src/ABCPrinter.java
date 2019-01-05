import content.ABC;

import javax.swing.*;
import java.awt.*;

public class ABCPrinter extends JFrame {
    private static ABC abc = new ABC();

    public ABCPrinter() {
        setTitle("Alphabet Printer");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ABCPrinter abcPrinter = new ABCPrinter();
        abcPrinter.setLayout(new FlowLayout());
        PrinterUI panel = new PrinterUI(abc);
        abcPrinter.add(panel);
        abcPrinter.setVisible(true);
        System.out.println();
    }

}