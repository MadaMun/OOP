import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1,m2,m3, ms1;;
    private JMenuItem mi2, mi3, mi4, msi1, msi2;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    
    public MDIFromGUI() {
    desktopPane = new JDesktopPane();
    desktopPane.setBackground(Color.BLACK);
    frame1 = new JInternalFrame("Application 01", true, true, true , true);
    frame1.setBounds(1000, 600, 300, 300);
    frame1.setVisible(true);
    
    
    frame2 = new JInternalFrame("Application 02", true, true, true ,true);
    frame2.setBounds(500, 100, 400, 200);
    frame2.setVisible(true);
    
    
    frame3 = new JInternalFrame("Application 03", true, true, true ,true);
    frame3.setBounds(100, 300, 300, 500);
    frame3.setVisible(true);
    
    
    fr = new JFrame("SubMenuItem Demo");
    mb = new JMenuBar();
    m1 = new JMenu("File");
    m2 = new JMenu("Edit");
    m3 = new JMenu("View");
    ms1 = new JMenu("New");
    mi2 = new JMenuItem("Open");
    mi3 = new JMenuItem("Save");
    mi4 = new JMenuItem("Exit");
    msi1 = new JMenuItem("Window");
    msi2 = new JMenuItem("Message");
    
    
    fr.add(desktopPane);
    desktopPane.add(frame1);
    desktopPane.add(frame2);
    desktopPane.add(frame3);
    fr.setJMenuBar(mb);
    mb.add(m1); mb.add(m2); mb.add(m3);
    m1.add(ms1);
    m1.add(mi2);
    m1.addSeparator();
    m1.add(mi3);
    m1.addSeparator();
    m1.add(mi4);
    ms1.add(msi1);
    ms1.addSeparator();
    ms1.add(msi2);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fr.setSize(1500, 1000);
    fr.setVisible(true);
    }
public static void main(String[] args) {try {                 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());             } catch (Exception e){                 e.printStackTrace();             } new MDIFromGUI();
    }
}
