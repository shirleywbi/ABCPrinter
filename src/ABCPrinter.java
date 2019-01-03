import javax.swing.*;
import java.awt.*;

public class ABCPrinter extends JFrame {

    public ABCPrinter() {
        setTitle("Alphabet Printer");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ABCPrinter abcPrinter = new ABCPrinter();
        abcPrinter.setLayout(new FlowLayout());
        ABCUI panel = new ABCUI();
        abcPrinter.add(panel);
        abcPrinter.setVisible(true);
    }

}