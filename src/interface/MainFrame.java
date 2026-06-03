import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Entertainment Recommendation Hub");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create and add components to the frame
        JLabel welcomeLabel = new JLabel(
            "Welcome to the Entertainment Recommendation Hub!",
            SwingConstants.CENTER
        );
        add(welcomeLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}
