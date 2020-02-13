import javax.swing.*;
import java.util.*;
import java.awt.*;
public class tempMain{
    public static void main(String[] args){
        JFrame frame = new JFrame("AI Battle Client");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(0,0,screenSize.width,screenSize.height);
        TempGame game = new TempGame();
        TempDisplay dis = new TempDisplay(game,screenSize.width,screenSize.height);
        frame.add(dis);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        int count = 0;
        while(count < 30){
            dis.draw();
            count++;
            try{
                Thread.sleep(400);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}