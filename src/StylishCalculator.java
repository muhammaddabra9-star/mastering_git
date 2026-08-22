    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JButton;
    import javax.swing.JTextField;
    import javax.swing.JLabel;
    import javax.swing.BorderFactory;

    import java.awt.BorderLayout;
    import java.awt.Color;
    import java.awt.Font;
    import java.awt.GridLayout;

    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;



    public class StylishCalculator implements ActionListener {

    // ================= TEXT FIELD =================

    JTextField textField;



    // ================= VARIABLES =================

    double num1 = 0;
    double result = 0;

    char operator;



    // ================= FRAME =================

    JFrame frame;




    // ================= BUTTONS =================

    JButton[] numberButtons = new JButton[10];

    JButton addButton;
    JButton subButton;
    JButton mulButton;
    JButton divButton;
    JButton equalButton;
    JButton clearButton;
    JButton decimalButton;



    // ================= PANELS =================

    JPanel mainPanel;

    JPanel topPanel;

    JPanel buttonPanel;



    // ================= CONSTRUCTOR =================

    public StylishCalculator() {

        // ================= MAIN WINDOW =================

        frame = new JFrame("LUXURY CALCULATOR");

        frame.setSize(500, 750);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());



        // Background color of whole frame
        frame.getContentPane().setBackground(new Color(15, 15, 35));



        // ================= TOP PANEL =================

        topPanel = new JPanel();

        topPanel.setLayout(new BorderLayout());

        topPanel.setBackground(new Color(20, 20, 45));



        // ================= TITLE =================

        JLabel title = new JLabel("SMART CALCULATOR", JLabel.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 32));

        title.setForeground(new Color(0, 255, 170));

        topPanel.add(title, BorderLayout.NORTH);



        // ================= TEXT FIELD =================

        textField = new JTextField();

        textField.setEditable(false);

        textField.setFont(new Font("Consolas", Font.BOLD, 40));

        textField.setBackground(Color.BLACK);

        textField.setForeground(Color.GREEN);

        textField.setCaretColor(Color.WHITE);

        textField.setBorder(
                BorderFactory.createLineBorder(
                        new Color(0, 255, 170),
                        4
                )
        );



        topPanel.add(textField, BorderLayout.CENTER);



        // Add top panel to frame
        frame.add(topPanel, BorderLayout.NORTH);



        // ================= BUTTON PANEL =================

        buttonPanel = new JPanel();

        buttonPanel.setLayout(new GridLayout(5, 4, 15, 15));

        buttonPanel.setBackground(new Color(25, 25, 55));



        // ================= NUMBER BUTTONS =================

        for (int i = 0; i < 10; i++) {

            numberButtons[i] = new JButton(String.valueOf(i));

            numberButtons[i].setFont(new Font("Arial", Font.BOLD, 28));

            numberButtons[i].setFocusable(false);

            numberButtons[i].setBackground(new Color(240, 240, 240));

            numberButtons[i].setForeground(Color.BLACK);

            numberButtons[i].setBorder(
                    BorderFactory.createLineBorder(
                            Color.WHITE,
                            2
                    )
            );

            numberButtons[i].addActionListener(this);
        }



        // ================= OPERATOR BUTTONS =================

        addButton = createOperatorButton("+");

        subButton = createOperatorButton("-");

        mulButton = createOperatorButton("×");

        divButton = createOperatorButton("÷");

        equalButton = createOperatorButton("=");

        clearButton = createOperatorButton("C");

        decimalButton = createOperatorButton(".");



        // ================= ADD BUTTONS =================

        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[9]);
        buttonPanel.add(divButton);

        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[6]);
        buttonPanel.add(mulButton);

        buttonPanel.add(numberButtons[1]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(subButton);

        buttonPanel.add(decimalButton);
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(equalButton);
        buttonPanel.add(addButton);

        buttonPanel.add(clearButton);



        // Add button panel to frame
        frame.add(buttonPanel, BorderLayout.CENTER);



        // Makes window visible
        frame.setVisible(true);
    }



    // ================= CUSTOM BUTTON METHOD =================

    public JButton createOperatorButton(String text) {

        JButton button = new JButton(text);

        button.setFont(new Font("Arial", Font.BOLD, 28));

        button.setFocusable(false);

        button.setBackground(new Color(255, 80, 80));

        button.setForeground(Color.WHITE);

        button.setBorder(
                BorderFactory.createLineBorder(
                        Color.WHITE,
                        2
                )
        );

        button.addActionListener(this);

        return button;
    }



    // ================= BUTTON ACTIONS =================

    @Override
    public void actionPerformed(ActionEvent e) {

        // Number buttons
        for (int i = 0; i < 10; i++) {

            if (e.getSource() == numberButtons[i]) {

                textField.setText(
                        textField.getText().concat(String.valueOf(i))
                );
            }
        }



        // Decimal button
        if (e.getSource() == decimalButton) {

            textField.setText(
                    textField.getText().concat(".")
            );
        }



        // Addition
        if (e.getSource() == addButton) {

            num1 = Double.parseDouble(textField.getText());

            operator = '+';

            textField.setText("");
        }



        // Subtraction
        if (e.getSource() == subButton) {

            num1 = Double.parseDouble(textField.getText());

            operator = '-';

            textField.setText("");
        }



        // Multiplication
        if (e.getSource() == mulButton) {

            num1 = Double.parseDouble(textField.getText());

            operator = '*';

            textField.setText("");
        }



        // Division
        if (e.getSource() == divButton) {

            num1 = Double.parseDouble(textField.getText());

            operator = '/';

            textField.setText("");
        }



        // Equal button
        if (e.getSource() == equalButton) {

            double num2 = Double.parseDouble(textField.getText());



            switch (operator) {

                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;
            }



            // Displays result
            textField.setText(String.valueOf(result));
        }



        // Clear button
        if (e.getSource() == clearButton) {

            textField.setText("");
        }
    }



    // ================= MAIN METHOD =================

    public static void main(String[] args) {

        new StylishCalculator();
    }
}

