import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p;
    private JButton btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9 , btn_0, btn_c, btn_equ, btn_div, btn_mul, btn_plus, btn_minus;
    private JTextField txt;
    
    public CalculatorTwoGUI(){
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
public static void main(String[] args) { new CalculatorTwoGUI(); }
    }
