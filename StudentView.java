import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class StudentView implements ActionListener, WindowListener {
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel lbl1, lbl2, lbl3;
    private JTextField txt1, txt2, txt3;
    private JButton btb1, btb2;
    private File logs;
    private Student std;
    
    public StudentView() {
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        lbl1 = new JLabel("ID :");
        lbl2 = new JLabel("Name :");
        lbl3 = new JLabel("Money :");
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField("0");
        btb1 = new JButton("Deposit");
        btb2 = new JButton("Withdraw");
        std = new Student("", 0, 0);
        
        txt1.setEditable(true);
        txt2.setEditable(true);
        txt3.setEditable(false);
        btb1.addActionListener(this);
        btb2.addActionListener(this);
        logs = new File("StudentM.dat");
        
        
        try {
            logs.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        p1.setLayout(new GridLayout(3, 2));
        p2.setLayout(new FlowLayout());
        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.CENTER);
        fr.add(p2, BorderLayout.SOUTH);
        p1.add(lbl1);
        p1.add(txt1);
        p1.add(lbl2);
        p1.add(txt2);
        p1.add(lbl3);
        p1.add(txt3);
        p2.add(btb1);
        p2.add(btb2);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public static void main(String[] args) { new StudentView(); }
    
        public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btb1)) {
                std.setMoney(std.getMoney() + 100);
                txt3.setText(Integer.toString(std.getMoney()));
                std.setName(txt1.getText());
        std.setID(Integer.parseInt(txt2.getText()));
          } else if (ae.getSource().equals(btb2)) {
                std.setMoney(std.getMoney() - 100);
                txt3.setText(Integer.toString(std.getMoney()));
                std.setName(txt1.getText());
        std.setID(Integer.parseInt(txt2.getText()));
        }
        }
        
    public void windowClosing(WindowEvent we) {
        try {
            FileOutputStream stream = new FileOutputStream(logs);
            ObjectOutputStream ops = new ObjectOutputStream(stream);
            ops.writeObject(std);
        } catch (IOException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }
    }
    
    public void windowOpened(WindowEvent we) {
        if (logs.exists()) {
            try {
                FileInputStream stream = new FileInputStream(logs);
                ObjectInputStream ips = new ObjectInputStream(stream);
                std = (Student) ips.readObject();
                if (std == null) {
                    std = new Student();
                }
                txt2.setText(String.valueOf(std.getID()));
                txt1.setText(std.getName());
                txt3.setText(String.valueOf(std.getMoney()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }
}
