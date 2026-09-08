// These imports allow us to create GUI windows, buttons, labels, etc.
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;



public class MadlibsgameGUI {
    public static void main(String[] args) {


            // MAD LIBS GAME


// Main application window
            JFrame frame = new JFrame("Mad Libs Game");

// Window size
            frame.setSize(900, 600);

// Allows full close when pressing X
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Uses BorderLayout so title stays visible
            frame.setLayout(new BorderLayout());


// ================= TITLE =================

// Creates title label
            JLabel title = new JLabel("MAD LIBS GAME", JLabel.CENTER);

// Title font
            title.setFont(new Font("Arial", Font.BOLD, 32));

// Title color
            title.setForeground(Color.RED);

// Adds title to TOP of window
            frame.add(title, BorderLayout.NORTH);


// ================= INPUT PANEL =================

// Panel for inputs
            JPanel inputPanel = new JPanel();

// Grid layout: rows, columns, spacing
            inputPanel.setLayout(new GridLayout(6, 2, 10, 10));

// Background color
            inputPanel.setBackground(Color.CYAN);


// Input fields
            JTextField adjective1Field = new JTextField();
            JTextField noun1Field = new JTextField();
            JTextField adjective2Field = new JTextField();
            JTextField verb1Field = new JTextField();
            JTextField adjective3Field = new JTextField();


// Labels + text fields
            inputPanel.add(new JLabel("Enter adjective:"));
            inputPanel.add(adjective1Field);

            inputPanel.add(new JLabel("Enter noun:"));
            inputPanel.add(noun1Field);

            inputPanel.add(new JLabel("Enter adjective:"));
            inputPanel.add(adjective2Field);

            inputPanel.add(new JLabel("Enter verb ending with ing:"));
            inputPanel.add(verb1Field);

            inputPanel.add(new JLabel("Enter adjective:"));
            inputPanel.add(adjective3Field);


// Generate button
            JButton generateButton = new JButton("Generate Story");

// Button color
            generateButton.setBackground(Color.GREEN);

// Button text color
            generateButton.setForeground(Color.BLACK);

// Adds button
            inputPanel.add(generateButton);


// Adds input panel to LEFT side
            frame.add(inputPanel, BorderLayout.WEST);


// ================= STORY AREA =================

// Story display area
            JTextArea storyArea = new JTextArea();

// Makes text wrap automatically
            storyArea.setLineWrap(true);

// Wraps words properly
            storyArea.setWrapStyleWord(true);

// Story font
            storyArea.setFont(new Font("Arial", Font.PLAIN, 20));

// Background color
            storyArea.setBackground(Color.BLACK);

// Text color
            storyArea.setForeground(Color.GREEN);

// Cannot edit story
            storyArea.setEditable(false);


// Scroll pane for story
            JScrollPane scrollPane = new JScrollPane(storyArea);

// Adds story area to CENTER
            frame.add(scrollPane, BorderLayout.CENTER);


// ================= BUTTON LOGIC =================

            generateButton.addActionListener(e -> {

                    // Gets user inputs
                    String adjective1 = adjective1Field.getText();

                    String noun1 = noun1Field.getText();

                    String adjective2 = adjective2Field.getText();

                    String verb1 = verb1Field.getText();

                    String adjective3 = adjective3Field.getText();


                    // Creates story
                    String story =
                            "Today I went to a " + adjective1 + " zoo.\n\n" +

                                    "In an exhibit, I saw a " + noun1 + ".\n\n" +

                                    noun1 + " was " + adjective2 + " and " + verb1 + "!\n\n" +

                                    "I was " + adjective3 + "!";


                    // Displays story inside GUI
                    storyArea.setText(story);


                    // Popup message
                    JOptionPane.showMessageDialog(
                            frame,
                            "Story Generated Successfully!"
                    );

            });


// Makes window visible
            frame.setVisible(true);
    }
}



