import javax.swing.*;

public class Frame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login");

        JLabel user = new JLabel("Username:");
        JLabel pass = new JLabel("Password:");

        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();

        user.setBounds(150,150,80,30);
        username.setBounds(240,150,120,30);

        pass.setBounds(150,200,80,30);
        password.setBounds(240,200,120,30);

        frame.add(user);
        frame.add(username);
        frame.add(pass);
        frame.add(password);

        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}