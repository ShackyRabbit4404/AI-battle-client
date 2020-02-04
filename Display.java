import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Display extends JComponent{
    Game game;
    int screenWidth;
    int screenHeight;
    ArrayList<Image> textures;
    public Display(Game g){
        super();
        game = g;
        textures = game.getTextures();
        
        System.out.println("Width: "+screenWidth+" Height: "+screenHeight);
    }
    public void draw(){
        super.repaint();
    }
    public void paintComponent(Graphics g){
        screenWidth = this.getSize().width;
        screenHeight = this.getSize().height;
        super.paintComponent(g);
        int map[][] = game.getMap();
        int mapWidth = game.getMapWidth();
        int mapHeight = game.getMapHeight();
        int[][] players = game.getChars();
        double scaledWidth = screenWidth/mapWidth;
        double scaledHeight = screenHeight/mapHeight;
        if(map != null){
            for(int[] block: map){
                g.drawImage(textures.get(block[2]),(int)(block[0]*scaledWidth),(int)(block[1]*scaledHeight),this);
            }
        }
        else{
            System.out.println("Null error, no map found");
        }
        if(players != null){
            for(int[] player: players){
                g.drawImage(textures.get(player[2]).getScaledInstance((int)scaledWidth,(int)scaledHeight,0),(int)(player[0]*scaledWidth),(int)(player[1]*scaledHeight),this);
            }
        }
        else{
            System.out.println("Null error, no players found");
        }
    }
}