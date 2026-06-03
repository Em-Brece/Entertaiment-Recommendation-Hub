public class MainFrame extends jFrame {

    public MainFrame() {
        setTitle("Entertainment Recommendation Hub");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create and add components to the frame
        // For example, you can add a welcome label
        JLabel welcomeLabel = new JLabel(
            "Welcome to the Entertainment Recommendation Hub!",
            SwingConstants.CENTER
        );
        add(welcomeLabel);

        // You can also add buttons or other components here
    }
}

void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    });
}
