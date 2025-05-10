import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

class operator {
    public static int count(int num1, char opr, int num2) {
        switch (opr) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;

            case '*':
                return num1 * num2;

            case '/':
                return num1 / num2;
            default:
                break;
        }
        return 0;
    }
}

class myframe extends JFrame {
    private Container c;
    private JTextField t1, t2;
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btm, bta, bts, btd, bte, btas;
    int num1, num2, ans;
    boolean opr_pressed = false;
    char opr;

    public myframe() {
        c = getContentPane();
        c.setLayout(null);

        Font font = new Font("arial", Font.BOLD, 28);
        Font font1 = new Font("arial", Font.BOLD, 35);
        t1 = new JTextField();
        t1.setHorizontalAlignment(JTextField.RIGHT);
        t1.setBounds(0, 25, 398, 100);

        Border border1 = BorderFactory.createLoweredBevelBorder();
        t1.setBorder(border1);
        t1.setFont(font1);
        t1.setEditable(false);
        c.add(t1);

        t2 = new JTextField();
        t2.setHorizontalAlignment(JTextField.RIGHT);
        t2.setBounds(0, 130, 398, 100);
        t2.setBorder(border1);
        t2.setBackground(Color.white);
        t2.setFont(font1);
        t2.setEditable(false);
        c.add(t2);

        bt7 = new JButton("7");
        bt7.setBounds(0, 250, 100, 100);
        bt7.setBackground(Color.LIGHT_GRAY);
        bt7.setFont(font1);
        c.add(bt7);

        bt8 = new JButton("8");
        bt8.setBounds(105, 250, 100, 100);
        bt8.setBackground(Color.LIGHT_GRAY);
        bt8.setFont(font);
        c.add(bt8);

        bt9 = new JButton("9");
        bt9.setBounds(210, 250, 100, 100);
        bt9.setBackground(Color.LIGHT_GRAY);
        bt9.setFont(font);
        c.add(bt9);

        bt4 = new JButton("4");
        bt4.setBounds(0, 355, 100, 100);
        bt4.setBackground(Color.LIGHT_GRAY);
        bt4.setFont(font);
        c.add(bt4);

        bt5 = new JButton("5");
        bt5.setBounds(105, 355, 100, 100);
        bt5.setBackground(Color.LIGHT_GRAY);
        bt5.setFont(font);
        c.add(bt5);

        bt6 = new JButton("6");
        bt6.setBounds(210, 355, 100, 100);
        bt6.setBackground(Color.LIGHT_GRAY);
        bt6.setFont(font);
        c.add(bt6);

        bt1 = new JButton("1");
        bt1.setBounds(0, 460, 100, 100);
        bt1.setBackground(Color.LIGHT_GRAY);
        bt1.setFont(font);
        c.add(bt1);

        bt2 = new JButton("2");
        bt2.setBounds(105, 460, 100, 100);
        bt2.setBackground(Color.LIGHT_GRAY);
        bt2.setFont(font);
        c.add(bt2);

        bt3 = new JButton("3");
        bt3.setBounds(210, 460, 100, 100);
        bt3.setBackground(Color.LIGHT_GRAY);
        bt3.setFont(font);
        c.add(bt3);

        bt0 = new JButton("0");
        bt0.setBounds(105, 565, 100, 100);
        bt0.setBackground(Color.LIGHT_GRAY);
        bt0.setFont(font);
        c.add(bt0);

        btm = new JButton("X");
        btm.setBounds(315, 250, 75, 100);
        btm.setBackground(Color.LIGHT_GRAY);
        btm.setFont(font);
        c.add(btm);

        bts = new JButton("-");
        bts.setBounds(315, 355, 75, 100);
        bts.setBackground(Color.LIGHT_GRAY);
        bts.setFont(font);
        c.add(bts);

        bta = new JButton("+");
        bta.setBounds(315, 460, 75, 100);
        bta.setBackground(Color.LIGHT_GRAY);
        bta.setFont(font);
        c.add(bta);

        btas = new JButton("+/-");
        btas.setBounds(0, 565, 100, 100);
        btas.setBackground(Color.LIGHT_GRAY);
        btas.setFont(font);
        c.add(btas);

        btd = new JButton("/");
        btd.setBounds(210, 565, 100, 100);
        btd.setBackground(Color.LIGHT_GRAY);
        btd.setFont(font);
        c.add(btd);

        bte = new JButton("=");
        bte.setBounds(315, 565, 75, 100);
        bte.setBackground(Color.BLUE);
        bte.setFont(font);
        c.add(bte);

        bt0.addActionListener(btnlis);
        bt1.addActionListener(btnlis);
        bt2.addActionListener(btnlis);
        bt3.addActionListener(btnlis);
        bt4.addActionListener(btnlis);
        bt5.addActionListener(btnlis);
        bt6.addActionListener(btnlis);
        bt7.addActionListener(btnlis);
        bt8.addActionListener(btnlis);
        bt9.addActionListener(btnlis);
        bta.addActionListener(btnlis);
        bts.addActionListener(btnlis);
        btd.addActionListener(btnlis);
        btm.addActionListener(btnlis);
        bte.addActionListener(btnlis);

    }

    ActionListener btnlis = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            if (o == bta || o == bts || o == btd || o == btm) {
                if (o == bta)
                    opr = '+';
                else if (o == bts)
                    opr = '-';
                else if (o == btm)
                    opr = '*';
                else if (o == btd)
                    opr = '/';

                num1 = Integer.parseInt(t2.getText());
                // ans = operator.count(num1, opr, num2);
                t1.setText(num1 + " " + opr);
                // t2.setText(Integer.toString(ans));
                t1.setText(Integer.toString(num1));
                t2.setText("");
                opr_pressed = true;
            } else if (o == bte) {
                num2 = Integer.parseInt(t2.getText());
                ans = operator.count(num1, opr, num2);
                t1.setText(num1 + " " + opr + " " + num2+" = "+ans);
                t2.setText(Integer.toString(ans));
                num1 = ans;
                num2 = 0;
            } else {
                // if (opr_pressed) {

                // }
                if (o == bt0)
                    t2.setText(t2.getText() + "0");
                else if (o == bt1)
                    t2.setText(t2.getText() + "1");
                else if (o == bt2)
                    t2.setText(t2.getText() + "2");
                else if (o == bt3)
                    t2.setText(t2.getText() + "3");
                else if (o == bt4)
                    t2.setText(t2.getText() + "4");
                else if (o == bt5)
                    t2.setText(t2.getText() + "5");
                else if (o == bt6)
                    t2.setText(t2.getText() + "6");
                else if (o == bt7)
                    t2.setText(t2.getText() + "7");
                else if (o == bt8)
                    t2.setText(t2.getText() + "8");
                else if (o == bt9)
                    t2.setText(t2.getText() + "9");
            }
            c.add(t2);
        }
    };
}

class calculator1 {
    public static void main(String args[]) {
        myframe frame = new myframe();
        frame.setTitle("Calculator");
        frame.setSize(412, 705);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(myframe.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ImageIcon icon = new ImageIcon("cicon.jpg");
        frame.setIconImage(icon.getImage());

        frame.setResizable(false);

    }
}