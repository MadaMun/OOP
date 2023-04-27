import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Kor3 implements ActionListener {
    private JFrame fr;
    private JPanel p_1, p_2, p_3;
    private JLabel lbl_1, lbl_2;
    private JTextField txt_1, txt_2;
    private JButton btn_1, btn_2, btn_3;
    private Account account;
    
    
    public Kor3(){
            fr = new JFrame("Teller GUI");
            account = new Account(2000, "earth");
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
            txt_1.setEditable(false);
            txt_2.setEditable(true);
            
            btn_1.addActionListener(this);
            btn_2.addActionListener(this);
            btn_3.addActionListener(this);
            
            fr.setLayout(new GridLayout(4, 1));
            p_1.setLayout(new GridLayout(1, 2));
            p_2.setLayout(new GridLayout(1, 2));
            txt_1 = new JTextField(""+account.getBalance());
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
public static void main(String[] args) { new Kor3(); }
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource().equals(btn_1)){
            if((Double.parseDouble(txt_1.getText())) >= 0){
                account.setBalance(account.getBalance() + Double.parseDouble(txt_2.getText()));
                txt_1.setText("" + account.getBalance());
            }    
        }
        else if(event.getSource().equals(btn_2)){
            if((account.getBalance() - Double.parseDouble(txt_2.getText())) >= 0)
                account.setBalance(account.getBalance() - Double.parseDouble(txt_2.getText()));
                    txt_1.setText("" + account.getBalance());
            }
        }
    }
