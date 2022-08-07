package view;

import model.Polynomial;

import java.awt.*;
import javax.swing.*;

public class MiniGui extends JFrame{
    JLabel label = new JLabel();
    JLabel label1 = new JLabel();
    JTextField text = new JTextField();
    JPanel panel = new JPanel();
    ImageIcon image;
    public MiniGui() {
        panel.setBackground(new Color(150,220,225));
        panel.setBounds(0,0,370,210);

        label.setFont(new Font("", Font.ITALIC, 20));
        label.setText("Rezultatul = ");
        label.setForeground(Color.black);

        text.setPreferredSize(new Dimension(200,30));
        text.setEditable(false);
        image = new ImageIcon(this.getClass().getResource("/Imagine.jpeg"));
        label1.setIcon(image);

        this.setSize(370,210);
        this.setTitle("Polynom Calculator");
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(120,225,225));

        this.add(panel);
        panel.add(label);
        panel.add(text);
        panel.add(label1);

    }

    public void setRezultat(String makeString) {
        this.text.setText(makeString);
    }
}