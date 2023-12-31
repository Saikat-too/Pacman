import javax.swing.*;
public class Game extends JFrame {
    public Game() {
        add(new Model());
    }

    public static void main(String[] args) {
        Game pac = new Game();
        pac.setVisible(true);
        pac.setTitle("Pacman");
        pac.setSize(380, 420);
        pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pac.setLocationRelativeTo(null);
        // Load the icon image
        ImageIcon icon = new ImageIcon("Pacman2/src/Image/packman.png");
        pac.setIconImage(icon.getImage());
    }
}