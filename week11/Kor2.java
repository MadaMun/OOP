import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
public class Kor2 implements ActionListener {
    private JFrame fr;
    private JPanel p;
    private JButton btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9 , btn_0, btn_c, btn_equ, btn_div, btn_mul, btn_plus, btn_minus;
    private JTextField txt;
    public int num1;
    public int num2;
    public int result;
    public String operator = "";
    
    
    public Kor2(){
        fr = new JFrame("My Calculator");
        p = new JPanel();
        fr.setLayout(new BorderLayout());
        btn_7 = new JButton("7");
        btn_8 = new JButton("8");
        btn_9 = new JButton("9");
        btn_plus = new JButton("+");
        btn_4 = new JButton("4");
        btn_5 = new JButton("5");
        btn_6 = new JButton("6");
        btn_minus = new JButton("-");
        btn_1 = new JButton("1");
        btn_2 = new JButton("2");
        btn_3 = new JButton("3");
        btn_mul = new JButton("*");
        btn_0 = new JButton("0");
        btn_equ = new JButton("=");
        btn_div = new JButton("/");
        btn_c = new JButton("c");
        
        btn_0.addActionListener(this);
        btn_1.addActionListener(this);
        btn_2.addActionListener(this);
        btn_3.addActionListener(this);
        btn_4.addActionListener(this);
        btn_5.addActionListener(this);
        btn_6.addActionListener(this);
        btn_7.addActionListener(this);
        btn_8.addActionListener(this);
        btn_9.addActionListener(this);
        btn_plus.addActionListener(this);
        btn_minus.addActionListener(this);
        btn_mul.addActionListener(this);
        btn_div.addActionListener(this);
        btn_c.addActionListener(this);
        btn_equ.addActionListener(this);
        
        txt = new JTextField();
        p.setLayout(new GridLayout(4,4));
        p.add(btn_7); p.add(btn_8); p.add(btn_9); p.add(btn_plus);
        p.add(btn_4); p.add(btn_5); p.add(btn_6); p.add(btn_minus);
        p.add(btn_1); p.add(btn_2); p.add(btn_3); p.add(btn_mul);
        p.add(btn_0); p.add(btn_c); p.add(btn_equ); p.add(btn_div);
        fr.add(txt,  BorderLayout.NORTH);
        fr.add(p);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
public static void main(String[] args) { new Kor2(); }
    @Override
    public void actionPerformed(ActionEvent event){
        ArrayList op = new ArrayList();
        op.add("+");
        op.add("x");
        op.add("/");
        op.add("-");
        op.add("=");
        op.add("c");
        
        if (!op.contains(event.getActionCommand())){
            txt.setText(txt.getText()+event.getActionCommand());
            }
        
        //operators session
        else {
            if (event.getSource().equals(btn_plus)) {
                num1 = Integer.parseInt(txt.getText());
                operator = "+";
                txt.setText("");
            }
            
            else if (event.getSource().equals(btn_minus)) {
                num1 = Integer.parseInt(txt.getText());
                operator = "-";
                txt.setText("");
            }
            else if (event.getSource().equals(btn_mul)) {
                num1 = Integer.parseInt(txt.getText());
                operator = "*";
                txt.setText("");
            }
            else if (event.getSource().equals(btn_div)) {
                num1 = Integer.parseInt(txt.getText());
                operator = "/";
                txt.setText("");
            }
            else if (event.getSource().equals(btn_c)) {
                txt.setText("");
            }
            else if (event.getSource().equals(btn_equ)) {
                num2 = Integer.parseInt(txt.getText());
                if (operator.equals("+")){
                    result = num1 + num2;
                }
                else if (operator.equals("*")){
                    result = num1 * num2;
                }
                else if (operator.equals("-")){
                    result = num1 - num2;
                }
                else if (operator.equals("/")){
                    result = num1 / num2;
                }
                txt.setText(result+"");
            }
            
        }
    }    
}


