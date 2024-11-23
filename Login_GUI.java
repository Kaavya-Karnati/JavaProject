import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_GUI {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Login_GUI() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create a panel to hold the labels and fields
        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10)); // 2 rows, 2 columns, with padding

        // Create username and password fields
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);

        // Add username label and field to the panel
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);

        // Add password label and field to the panel
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);

        // Create login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Authenticate user credentials here
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Call authentication method
                authenticateUser(username, password);
            }
        });

        // Add components to the frame
        frame.add(panel, BorderLayout.CENTER); // Add the panel in the center
        frame.add(loginButton, BorderLayout.SOUTH); // Add the login button at the bottom

        frame.pack();
        frame.setVisible(true);
    }

    private void authenticateUser(String username, String password) {
        // Implement your authentication logic here
        // For demonstration purposes, we'll use a simple hardcoded check
        if (username.equals("admin") && password.equals("password")) {
            JOptionPane.showMessageDialog(frame, "Login successful!");
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid username or password");
        }
    }

    public static void main(String[] args) {
        new Login_GUI();
    }
}
