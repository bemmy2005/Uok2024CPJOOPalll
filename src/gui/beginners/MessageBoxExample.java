package gui.beginners;

import javax.swing.JOptionPane;

public class MessageBoxExample {
    public static void main(String[] args) {
        // Show a simple information message
        JOptionPane.showMessageDialog(null, "This is an information message.");

        // Show a warning message
        JOptionPane.showMessageDialog(null, "This is a warning message.", "Warning", JOptionPane.WARNING_MESSAGE);

        // Show an error message
        JOptionPane.showMessageDialog(null, "This is an error message.", "Error", JOptionPane.ERROR_MESSAGE);

        // Show a question message and get user input
        int result = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Question", JOptionPane.YES_NO_OPTION);
        
        // Check the user's choice
        if (result == JOptionPane.YES_OPTION) {
            System.out.println("User clicked Yes");
        } else {
            System.out.println("User clicked No");
        }

        // Show an input dialog and get user input
        String userInput = JOptionPane.showInputDialog(null, "Enter something:");
        System.out.println("User entered: " + userInput);
    }
}
