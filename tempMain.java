import javax.swing.*;
import java.util.*;
import java.awt.*;
public class tempMain{
    public static void main(String[] args){
        JFrame frame = new JFrame("AI Battle Client");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(0,0,screenSize.width,screenSize.height);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        ArrayList<Round> rounds = new ArrayList<Round>();
       
    }
    public static void displayMatch(Display d,ArrayList<Round> rds){
        for(Round r: rds){
            d.draw();
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void simulate(ArrayList<Round> rds, Game g){
        while(!g.isOver()){
            g.runRound();
            int[][] map = g.getMap().clone();
            int[][] chars = g.getChars();
            rds.add(new Round(map,chars));
        }
        rds.add(new Round(g.getMap().clone(),g.getChars()));
    }
}