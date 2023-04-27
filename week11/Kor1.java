import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Kor1 implements ActionListener {
    private JFrame fr;
    private JPanel p;
    private JTextField txt_1, txt_2, txt_3;
    private JButton btn_1, btn_2, btn_3, btn_4;
    
    
    public Kor1(){
        fr = new JFrame("เครื่องคิดเลข");
        p = new JPanel();
        txt_1 = new JTextField();
        txt_2 = new JTextField();
        txt_3 = new JTextField();
        btn_1 = new JButton("บวก");
        btn_2 = new JButton("ลบ");
        btn_3 = new JButton("คูณ");
        btn_4 = new JButton("หาร");
        
        txt_3.setEditable(false);
        btn_1.addActionListener(this);
        btn_2.addActionListener(this);
        btn_3.addActionListener(this);
        btn_4.addActionListener(this);
        
        fr.setLayout(new GridLayout(4,1));
        fr.add(txt_1); fr.add(txt_2); fr.add(p); fr.add(txt_3);
        p.add(btn_1);
        p.add(btn_2);
        p.add(btn_3);
        p.add(btn_4);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
public static void main(String[] args) { new Kor1(); }

    @Override
    public void actionPerformed(ActionEvent ae) {
    if(ae.getSource().equals(btn_1)){
        double result = (double)(Double.parseDouble(txt_1.getText())) + (double)(Double.parseDouble(txt_2.getText()));
        txt_3.setText(result+"");
    }
    else if(ae.getSource().equals(btn_2)){
        double result = (double)(Double.parseDouble(txt_1.getText())) - (double)(Double.parseDouble(txt_2.getText()));
        txt_3.setText(result+"");
    }
    else if(ae.getSource().equals(btn_3)){
        double result = (double)(Double.parseDouble(txt_1.getText()))*(double)(Double.parseDouble(txt_2.getText()));
        txt_3.setText(result+"");
    }   
    else if(ae.getSource().equals(btn_4)){
        double result = (double)(Double.parseDouble(txt_1.getText()))/(double)(Double.parseDouble(txt_2.getText()));
        txt_3.setText(result+"");
    }
}
}
