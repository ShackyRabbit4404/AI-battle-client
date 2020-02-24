import javax.swing.*;
import java.util.*;
import java.awt.*;
public class tempMain{
    public static void main(String[] args){
        String[] jarFiles = new String[]{"TESTGAME.jar","TempGame"};
        JFrame frame = new JFrame("AI Battle Client");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(0,0,screenSize.width,screenSize.height);
        JarClassLoader jarLoader = new JarClassLoader (jarFiles[0]);
        Class c = null;
        TempGame o = null;
        try{
            c = jarLoader.loadClass (jarFiles[1], true);
            o = (TempGame)(c.newInstance());
            System.out.print("Object to string: "+o.toString());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(o);
        TempDisplay dis = new TempDisplay((Game)o,screenSize.width,screenSize.height);
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