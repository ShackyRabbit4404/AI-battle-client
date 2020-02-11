import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Display extends JPanel{
    Game game;
    int screenWidth;
    int screenHeight;
    ArrayList<Image> textures;
    ArrayList<Round> rounds;
    int[][] map;
    int[][] players;
    public Display(Game g){
        super();
        game = g;
        textures = game.getTextures();
        System.out.println("Width: "+screenWidth+" Height: "+screenHeight);
    }
    public void draw(){
        this.repaint();
    }
    boolean temp = true;
    public void setRounds(ArrayList<Round> rds){
        rounds = rds;
        System.out.println("Set the rounds: "+rds.size());
        for(Round r: rounds ){
            System.out.println(temp);
            map = r.getMap();
            players = r.getPlayers();
            this.repaint();
            System.out.println("Width: "+this.getSize().getWidth());
            System.out.println("Height: "+this.getSize().getHeight());
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        temp = false;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(temp){
            System.out.println("Should be drawing map");
        }
        screenWidth = this.getSize().width;
        screenHeight = this.getSize().height;
        int mapWidth = game.getMapWidth();
        int mapHeight = game.getMapHeight();
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