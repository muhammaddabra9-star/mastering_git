
//Code from Java for dummies

    import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

    public class MainGui {

        public static void main(String[] args) {
            JFrame frame = new JFrame();
            JLabel label = new JLabel("You'll love Java!", SwingConstants.CENTER);
            frame.setSize(200,200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(label);
            frame.setVisible(true);
        }
    }

 
