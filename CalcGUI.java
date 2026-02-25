import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcGUI extends JFrame implements ActionListener {

    JTextField tfs;
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    JButton btnAdd, btnSub, btnMul, btnDiv, btnEqual, btnClear;

    double num1 = 0, num2 = 0, result = 0;
    String operator = "";

    public CalcGUI() {
        setTitle("Calculator");
        setSize(400, 500);
        setLayout(null);

        tfs = new JTextField();
        tfs.setBounds(50, 30, 280, 40);
        tfs.setEditable(false);
        add(tfs);

        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");

        btnAdd = new JButton("+");
        btnSub = new JButton("-");
        btnMul = new JButton("*");
        btnDiv = new JButton("/");
        btnEqual = new JButton("=");
        btnClear = new JButton("C");

        btn7.setBounds(50, 100, 60, 40);
        btn8.setBounds(120, 100, 60, 40);
        btn9.setBounds(190, 100, 60, 40);
        btnDiv.setBounds(260, 100, 60, 40);

        btn4.setBounds(50, 160, 60, 40);
        btn5.setBounds(120, 160, 60, 40);
        btn6.setBounds(190, 160, 60, 40);
        btnMul.setBounds(260, 160, 60, 40);

        btn1.setBounds(50, 220, 60, 40);
        btn2.setBounds(120, 220, 60, 40);
        btn3.setBounds(190, 220, 60, 40);
        btnSub.setBounds(260, 220, 60, 40);

        btn0.setBounds(50, 280, 60, 40);
        btnClear.setBounds(120, 280, 60, 40);
        btnEqual.setBounds(190, 280, 60, 40);
        btnAdd.setBounds(260, 280, 60, 40);

        add(btn0); add(btn1); add(btn2); add(btn3);
        add(btn4); add(btn5); add(btn6);
        add(btn7); add(btn8); add(btn9);
        add(btnAdd); add(btnSub); add(btnMul); add(btnDiv);
        add(btnEqual); add(btnClear);

        JButton[] buttons = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
                             btnAdd, btnSub, btnMul, btnDiv, btnEqual, btnClear};

        for (JButton b : buttons) {
            b.addActionListener(this);
        }

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            tfs.setText(tfs.getText() + command);
        }

        else if (command.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(tfs.getText());
            operator = command;
            tfs.setText("");
        }

        else if (command.equals("=")) {
            num2 = Double.parseDouble(tfs.getText());

            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            tfs.setText(String.valueOf(result));
        }

        else if (command.equals("C")) {
            tfs.setText("");
            num1 = num2 = result = 0;
            operator = "";
        }
    }

    public static void main(String[] args) {
        new CalcGUI();
    }
}