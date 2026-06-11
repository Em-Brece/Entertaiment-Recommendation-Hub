import java.awt.*;
import javax.swing.*;

public class MainGUI extends JFrame {

    //Login Page
    private JPanel loginPanel;
    private JButton loginButton;
    private JFormattedTextField usernameField;
    private JPasswordField passwordField;

    //Main Page
    private JPanel mainMenu;

    public MainGUI() {
        // Frame Config
        setTitle("Entertainment Recommendation Hub");
        setSize(800, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainGUI mainGUI = new MainGUI();
            mainGUI.setVisible(true);
        });
    }
}
