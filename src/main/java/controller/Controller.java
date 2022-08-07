package controller;
import view.Gui;
import view.MiniGui;
import model.Polynomial;
import model.Operations;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controller {

    private Gui v;
    private MiniGui v1;

    public Controller(Gui view) {
        v = view;

        v.AddListener(new actionAdd());
        v.SubListener(new actionSub());
        v.MulListener(new actionMul());
        v.DerListener(new actionDer());
        v.IntegListener(new actionInteg());
    }
    private class actionAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String x = v.getText1().getText();
                String y = v.getText2().getText();
                Polynomial x1 = new Polynomial(x);
                Polynomial y1 = new Polynomial(y);
                Polynomial r = Operations.add(x1, y1);
                v1 = new MiniGui();
                v1.setRezultat(r.toString());

            }catch(Exception i) {
                JOptionPane.showMessageDialog(v, i.getMessage(), "Error Message:", 0);

            }
        }
    }

    private class actionSub implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try { String x = v.getText1().getText();
                String y = v.getText2().getText();
                Polynomial x1 = new Polynomial(x);
                Polynomial y1 = new Polynomial(y);
                Polynomial r = Operations.sub(x1, y1);
                v1 = new MiniGui();
                v1.setRezultat(r.toString());
            }catch(Exception i) {
                JOptionPane.showMessageDialog(v, i.getMessage(), "Error Message:", 0);

            }
        }
    }

    private class actionMul implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try { String x = v.getText1().getText();
                String y = v.getText2().getText();
                Polynomial x1 = new Polynomial(x);
                Polynomial y1 = new Polynomial(y);
                Polynomial r = Operations.mul(x1, y1);
                v1 = new MiniGui();
                v1.setRezultat(r.toString());
            }catch(Exception i) {
                JOptionPane.showMessageDialog(v, i.getMessage(), "Error Message:", 0);

            }
        }
    }
    private class actionDer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try { String x = v.getText1().getText();
                Polynomial x1 = new Polynomial(x);
                Polynomial r = Operations.der(x1);
                v1 = new MiniGui();
                v1.setRezultat(r.toString());
            }catch(Exception i) {
                JOptionPane.showMessageDialog(v, i.getMessage(), "Error Message:", 0);
            }
        }
    }
    private class actionInteg implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try { String x = v.getText1().getText();
                Polynomial x1 = new Polynomial(x);
                Polynomial r = Operations.integ(x1);
                v1 = new MiniGui();
                v1.setRezultat(r.toString());
            }catch(Exception i) {
                JOptionPane.showMessageDialog(v, i.getMessage(), "Error Message:", 0);
            }
        }
    }
}