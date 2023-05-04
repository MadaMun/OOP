import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class StudentView implements ActionListener {
    private JFrame fr;
    private JPanel p;
    private JLabel lbl1, lbl2, lbl3;
    private JTextField txt1, txt2, txt3;
    private JButton btb1, btb2;
    private File logs;
    private Student std;
    
    public StudentView() {
        fr = new JFrame();
        p = new JPanel();
        lbl1 = new JLabel("ID :");
        lbl2 = new JLabel("Name :");
        lbl3 = new JLabel("Money :");
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField("0");
        btb1 = new JButton("Deposit");
        btb2 = new JButton("Withdraw");
        
        txt1.setEditable(true);
        txt2.setEditable(true);
        txt3.setEditable(false);
        btb1.addActionListener(this);
        btb2.addActionListener(this);
        
        fr.setLayout(new GridLayout(4, 2));
        fr.add(lbl1);
        fr.add(txt1);
        fr.add(lbl2);
        fr.add(txt2);
        fr.add(lbl3);
        fr.add(txt3);
        fr.add(btb1);
        fr.add(btb2);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new StudentView();
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource().equals(btb1)){
        double result = 
        }
    }
}
