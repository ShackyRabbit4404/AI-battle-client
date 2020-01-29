import javax.swing.*;
import java.awt.*;
public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame("Battle Client");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(0,0,screenSize.width,screenSize.height);
        JPanel panel = new JPanel(new BorderLayout());
        JPanel control = new JPanel();
        JButton test = new JButton("TEST");
        control.add(test);
        panel.add(control,BorderLayout.WEST);
        
        
        Display display = new Display();
        panel.add(display, BorderLayout.CENTER);
        frame.add(panel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);
        frame.show();
    }
}