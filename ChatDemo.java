import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
import java.io.File;

public class ChatDemo implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel p;
    private JTextField txt1, txt2;
    private JButton btb1, btb2;
    private JTextArea tta;
    private File logs;
    
    public ChatDemo() {
        fr = new JFrame();
        p = new JPanel();
        txt1 = new JTextField();
        btb1 = new JButton("Submit");
        btb2 = new JButton("Reset");
        tta = new JTextArea(20, 45);
        logs = new File("ChatDemo.dat");
        
        try {
            logs.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();;
        }
        
        tta.setEditable(false);
        btb1.addActionListener(this);
        btb2.addActionListener(this);
        fr.addWindowListener(this);
        
        p.setLayout(new FlowLayout());
        fr.setLayout(new BorderLayout());
        fr.add(tta, BorderLayout.NORTH);
        fr.add(txt1, BorderLayout.CENTER);
        fr.add(p, BorderLayout.SOUTH);
        p.add(btb1);
        p.add(btb2);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
}
    public static void main(String[] arg) {new ChatDemo();}

    public String loadText() {
        String text = "";
        try (FileReader fileReader = new FileReader(logs)) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                text += (char) ch;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return text;
    }

    public void saveText(String text) {
        try (FileWriter fw = new FileWriter(logs)) {
            for (int i = 0; i < text.length(); i++) {
                fw.write(text.charAt(i));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btb1)) {
           DateTimeFormatter date = DateTimeFormatter.BASIC_ISO_DATE.ofPattern("yyyy/MM/dd HH:mm:ss");
           tta.setText(tta.getText() + date.format(LocalDateTime.now()) + ": " + txt1.getText() + "\n");
           txt1.setText("");
        } else if (ae.getSource().equals(btb2)) {
           tta.setText("");
        }    
    }

    @Override
    public void windowOpened(WindowEvent e) {
        String message = loadText();
        tta.setText(message);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        String message = tta.getText();
        saveText(message);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}