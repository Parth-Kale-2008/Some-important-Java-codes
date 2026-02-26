import java.awt.event.*;
import javax.swing.*;

class CircleAreaSwing extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1;

    CircleAreaSwing() {

        l1 = new JLabel("Enter radius:");
        l1.setBounds(50, 50, 120, 30);

        l2 = new JLabel("Area:");
        l2.setBounds(50, 100, 120, 30);

        t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);

        t2 = new JTextField();
        t2.setBounds(150, 100, 150, 30);
        t2.setEditable(false);

        b1 = new JButton("Calculate");
        b1.setBounds(120, 150, 120, 30);

        b1.addActionListener(this);

        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);

        setTitle("Circle Area Calculator");
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        double radius = Double.parseDouble(t1.getText());
        double area = Math.PI * radius * radius;

        t2.setText(String.valueOf(area));
    }

    public static void main(String[] args) {
        new CircleAreaSwing();
    }
}
