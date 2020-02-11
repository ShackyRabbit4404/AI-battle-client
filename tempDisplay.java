import javax.swing.*;
import java.awt.*;
public class tempDisplay extends JPanel{
    int[][] map;
    public tempDisplay(){
        map = new int[10][10];
    }
    public void randomizeMap(){
        
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int x = 0; x < map.length;x++){
            for(int y = 0; y < map[0].length; y++){
                if(map[x][y] == 0){
                    g.setColor(Color.BLUE);
                    g.fillRect(x*20,y*20,20,20);
                }
                else{
                    g.setColor(Color.RED);
                    g.fillRect(x*20,y*20,20,20);
                }
            }
        }
    }
}