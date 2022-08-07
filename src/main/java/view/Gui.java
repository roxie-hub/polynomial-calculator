package view;

import model.Operations;
import model.Polynomial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener,MouseListener{
    private boolean clk=false;
    JLabel label = new JLabel();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JPanel panel = new JPanel();
    JButton button1 = new JButton("Multiplicate");
    JButton button2 = new JButton("Subtract");
    JButton button3 = new JButton("Divide");
    JButton button5 = new JButton("Derivative");
    JButton button6 = new JButton("Integral");
    JButton button7 = new JButton("Add");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton s1 = new JButton("+");
    JButton s2 = new JButton("-");
    JButton s3 = new JButton("/");
    JButton s4 = new JButton("*");
    JButton s5 = new JButton("^");
    JButton s6 = new JButton(".");
    JButton s7 = new JButton("x");
    JButton s8 = new JButton("<x");

    private JTextField text1 = new JTextField();
    private JTextField text2 = new JTextField();

    public JTextField getText1() {
        return text1;
    }

    public JTextField getText2() {
        return text2;
    }

    public Gui(){
        panel.setBackground(new Color(220,205,255));
        panel.setBounds(0,0,350,100);

        label.setFont(new Font("", Font.BOLD, 20));
        label.setText("       Polynomial Calculator            ");
        label.setForeground(Color.gray);

        label1.setText("First Polynomial         = ");
        label1.setForeground(Color.gray);
        label1.setBounds(30,50,150,30);

        label2.setText("Second Polynomial   =  ");
        label2.setForeground(Color.gray);

        text1.setPreferredSize(new Dimension(170,22));
        text2.setPreferredSize(new Dimension(170,22));
        text2.addMouseListener(this);

        this.setSize(350,430);
        this.setLocationRelativeTo(null);
        this.setTitle("Polynom Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(220,205,255));

        button1.setBounds(15,100,150,35);
        button2.setBounds(170,100,155,35);
        button1.setFocusable(false);
        button2.setFocusable(false);

        button3.setBounds(15,140,150,35);
        button3.setFocusable(false);

        button5.setBounds(15,180,150,35);
        button6.setBounds(170,180,155,35);
        button5.setFocusable(false);
        button6.setFocusable(false);

        button7.setBounds(170,140,155,35);
        button7.setFocusable(false);

        b1.setBounds(15,240,50,40);
        b2.setBounds(65,240,50,40);
        b3.setBounds(115,240,50,40);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);

        b4.setBounds(15,280,50,40);
        b5.setBounds(65,280,50,40);
        b6.setBounds(115,280,50,40);
        b4.setFocusable(false);
        b5.setFocusable(false);
        b6.setFocusable(false);

        b7.setBounds(15,320,50,40);
        b8.setBounds(65,320,50,40);
        b9.setBounds(115,320,50,40);
        b7.setFocusable(false);
        b8.setFocusable(false);
        b9.setFocusable(false);

        b0.setBounds(170,240,50,40);
        s1.setBounds(220,240,50,40);
        s2.setBounds(270,240,55,40);
        b0.setFocusable(false);
        s1.setFocusable(false);
        s2.setFocusable(false);

        s3.setBounds(170,280,50,40);
        s4.setBounds(220,280,50,40);
        s5.setBounds(270,280,55,40);
        s3.setFocusable(false);
        s4.setFocusable(false);
        s5.setFocusable(false);

        s6.setBounds(170,320,50,40);
        s7.setBounds(220,320,50,40);
        s8.setBounds(270,320,55,40);
        s6.setFocusable(false);
        s7.setFocusable(false);
        s8.setFocusable(false);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);

        b1.addActionListener(this);
        b0.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        s4.addActionListener(this);
        s5.addActionListener(this);
        s6.addActionListener(this);
        s7.addActionListener(this);
        s8.addActionListener(this);

        panel.add(label);
        panel.add(label1);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);
        this.add(panel);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(b0);
        this.add(s1);
        this.add(s2);
        this.add(s3);
        this.add(s4);
        this.add(s5);
        this.add(s6);
        this.add(s7);
        this.add(s8);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(clk==false) {
            if(e.getSource() == b0) text1.setText(text1.getText().concat(String.valueOf(b0.getText())));
            else if(e.getSource() == b1) text1.setText(text1.getText().concat(String.valueOf(b1.getText())));
            else if(e.getSource() == b2) text1.setText(text1.getText().concat(String.valueOf(b2.getText())));
            else if(e.getSource() == b3) text1.setText(text1.getText().concat(String.valueOf(b3.getText())));
            else if(e.getSource() == b4) text1.setText(text1.getText().concat(String.valueOf(b4.getText())));
            else if(e.getSource() == b5) text1.setText(text1.getText().concat(String.valueOf(b5.getText())));
            else if(e.getSource() == b6) text1.setText(text1.getText().concat(String.valueOf(b6.getText())));
            else if(e.getSource() == b7) text1.setText(text1.getText().concat(String.valueOf(b7.getText())));
            else if(e.getSource() == b8) text1.setText(text1.getText().concat(String.valueOf(b8.getText())));
            else if(e.getSource() == b9) text1.setText(text1.getText().concat(String.valueOf(b9.getText())));

            else if(e.getSource() == s1) text1.setText(text1.getText().concat(String.valueOf(s1.getText())));
            else if(e.getSource() == s2) text1.setText(text1.getText().concat(String.valueOf(s2.getText())));
            else if(e.getSource() == s3) text1.setText(text1.getText().concat(String.valueOf(s3.getText())));
            else if(e.getSource() == s4) text1.setText(text1.getText().concat(String.valueOf(s4.getText())));
            else if(e.getSource() == s5) text1.setText(text1.getText().concat(String.valueOf(s5.getText())));
            else if(e.getSource() == s6) text1.setText(text1.getText().concat(String.valueOf(s6.getText())));
            else if(e.getSource() == s7) text1.setText(text1.getText().concat(String.valueOf(s7.getText())));

            if(e.getSource()==s8) {
                String string = text1.getText();
                text1.setText("");
                for(int i=0;i<string.length()-1;i++) {
                    text1.setText(text1.getText()+string.charAt(i));
                }
            }
        }

        if(clk==true) {
            if(e.getSource() == b0) text2.setText(text2.getText().concat(String.valueOf(b0.getText())));
            else if(e.getSource() == b1) text2.setText(text2.getText().concat(String.valueOf(b1.getText())));
            else if(e.getSource() == b2) text2.setText(text2.getText().concat(String.valueOf(b2.getText())));
            else if(e.getSource() == b3) text2.setText(text2.getText().concat(String.valueOf(b3.getText())));
            else if(e.getSource() == b4) text2.setText(text2.getText().concat(String.valueOf(b4.getText())));
            else if(e.getSource() == b5) text2.setText(text2.getText().concat(String.valueOf(b5.getText())));
            else if(e.getSource() == b6) text2.setText(text2.getText().concat(String.valueOf(b6.getText())));
            else if(e.getSource() == b7) text2.setText(text2.getText().concat(String.valueOf(b7.getText())));
            else if(e.getSource() == b8) text2.setText(text2.getText().concat(String.valueOf(b8.getText())));
            else if(e.getSource() == b9) text2.setText(text2.getText().concat(String.valueOf(b9.getText())));

            else if(e.getSource() == s1) text2.setText(text2.getText().concat(String.valueOf(s1.getText())));
            else if(e.getSource() == s2) text2.setText(text2.getText().concat(String.valueOf(s2.getText())));
            else if(e.getSource() == s3) text2.setText(text2.getText().concat(String.valueOf(s3.getText())));
            else if(e.getSource() == s4) text2.setText(text2.getText().concat(String.valueOf(s4.getText())));
            else if(e.getSource() == s5) text2.setText(text2.getText().concat(String.valueOf(s5.getText())));
            else if(e.getSource() == s6) text2.setText(text2.getText().concat(String.valueOf(s6.getText())));
            else if(e.getSource() == s7) text2.setText(text2.getText().concat(String.valueOf(s7.getText())));

            if(e.getSource()==s8) {
                String string = text2.getText();
                text2.setText("");
                for(int i=0;i<string.length()-1;i++) {
                    text2.setText(text2.getText()+string.charAt(i));
                }
            }
        }
    }
    public void AddListener(ActionListener add) {
        button7.addActionListener(add);
    }

   public void SubListener(ActionListener sub) {
        button2.addActionListener(sub);
    }

    public void MulListener(ActionListener mul) {

        button1.addActionListener(mul);
    }
    public void DerListener(ActionListener der) {

        button5.addActionListener(der);
    }
    public void IntegListener(ActionListener integ) {

        button6.addActionListener(integ);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        text2.setText("");
        clk=true;
    }
}