import java.awt.*;
import javax.swing.*;
public class TellerGUI {
  private JFrame fr;
        private JPanel p_1, p_2, p_3;
        private JLabel lbl_1, lbl_2;
        private JTextField txt_1, txt_2;
        private JButton btn_1, btn_2, btn_3;
        public TellerGUI() {
            fr = new JFrame("Teller GUI");
            p_2 = new JPanel();
            p_1 = new JPanel();
            p_3 = new JPanel();
            lbl_1 = new JLabel("Balance");
            lbl_2 = new JLabel("Amount");
            btn_1 = new JButton("Deposit");
            btn_2 = new JButton("Withdraw");
            btn_3 = new JButton("Exit");
            txt_1 = new JTextField();
            txt_2 = new JTextField();
            txt_1.setEditable(true);
            txt_2.setEditable(true);
            fr.setLayout(new GridLayout(4, 1));
            p_1.setLayout(new GridLayout(1, 2));
            p_2.setLayout(new GridLayout(1, 2));
            p_1.add(lbl_1);
            p_1.add(txt_1);    
            p_2.add(lbl_2);
            p_2.add(txt_2);
            p_3.add(btn_1);
            p_3.add(btn_2);
            p_3.add(btn_3);
            fr.add(p_1);
            fr.add(p_2);
            fr.add(p_3);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.pack();
            fr.setVisible(true);
    }
public static void main(String[] args) { new TellerGUI(); }
    }
