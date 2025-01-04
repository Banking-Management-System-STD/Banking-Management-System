import javax.swing.*;
import java.awt.*;

public class LoginPage {

    public static void main(String[] args) {
        // Create the main JFrame
        JFrame frame = new JFrame("Responsive Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Start maximized
        frame.setLayout(new BorderLayout());

        JPanel leftPanel = new JPanel():
        leftPanel.setBackground(Color.WHITE);
        leftPanel.setLayout(new GridBagLayout());
        frame.add(leftPanel, BorderLayout.WEST);

        // Right panel for promotional content
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(new Color(0, 52, 89)); // Teal blue color
        rightPanel.setLayout(new GridBagLayout());
        frame.add(rightPanel, BorderLayout.EAST);

        // JSplitPane for dynamic resizing
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setResizeWeight(0.5); // Divide space equally
        frame.add(splitPane, BorderLayout.CENTER);

        // Left Panel Content
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel welcomeLabel = new JLabel("Hi, Welcome Back");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 28));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        leftPanel.add(welcomeLabel, gbc);

        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;

        JLabel emailLabel = new JLabel("Email or username");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 1;
        leftPanel.add(emailLabel, gbc);

        JTextField emailField = new JTextField(20);
        emailField.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        leftPanel.add(emailField, gbc);

        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 3;
        leftPanel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        leftPanel.add(passwordField, gbc);

        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;

        JLabel forgotPassword = new JLabel("Forgot Password?");
        forgotPassword.setFont(new Font("Arial", Font.PLAIN, 14));
        forgotPassword.setForeground(new Color(255, 153, 0)); // Orange color
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.EAST;
        leftPanel.add(forgotPassword, gbc);

        JButton loginButton = new JButton("Sign In");
        loginButton.setFont(new Font("Arial", Font.BOLD, 18));
        loginButton.setBackground(new Color(255, 153, 0)); // Orange color
        loginButton.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        leftPanel.add(loginButton, gbc);

        JLabel signUpLabel = new JLabel("Don't Have an Account?");
        signUpLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        leftPanel.add(signUpLabel, gbc);

        JLabel signUpLink = new JLabel("Sign Up");
        signUpLink.setFont(new Font("Arial", Font.BOLD, 14));
        signUpLink.setForeground(new Color(255, 153, 0)); // Orange color
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.WEST;
        leftPanel.add(signUpLink, gbc);

        // Right Panel Content
        JLabel promoText1 = new JLabel("Getting Easier");
        promoText1.setFont(new Font("Arial", Font.BOLD, 24));
        promoText1.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        rightPanel.add(promoText1, gbc);

        JLabel promoText2 = new JLabel("Pay for Any Transfer");
        promoText2.setFont(new Font("Arial", Font.BOLD, 24));
        promoText2.setForeground(new Color(255, 153, 0)); // Orange color
        gbc.gridx = 0;
        gbc.gridy = 1;
        rightPanel.add(promoText2, gbc);

        JLabel promoText3 = new JLabel("with Nbank");
        promoText3.setFont(new Font("Arial", Font.BOLD, 24));
        promoText3.setForeground(new Color(255, 153, 0)); // Orange color
        gbc.gridx = 0;
        gbc.gridy = 2;
        rightPanel.add(promoText3, gbc);

        JLabel imagePlaceholder = new JLabel("Image Placeholder");
        imagePlaceholder.setHorizontalAlignment(SwingConstants.CENTER);
        imagePlaceholder.setForeground(Color.WHITE);
        imagePlaceholder.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        rightPanel.add(imagePlaceholder, gbc);

        // Set frame visibility
        frame.setVisible(true);
    }
}
