

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyGui {
    public static void main(String[] args) {
        // 1. Create and display a standard window
        JFrame window = new JFrame("My Application");
        window.setSize(400, 300);
        window.setVisible(true);

        // 2. Pop up a graphical dialog box
        JOptionPane.showMessageDialog(window, "Welcome to Java UI!");
    }
}
