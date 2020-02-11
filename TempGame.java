import java.awt.*;
import java.util.*;
public class TempGame implements Game{
    int mapW;
    int mapH;
    int[][] map;
    boolean gameOngoing;
    int count;
    public TempGame(){
        mapW = 30;
        mapH = 20;
        gameOngoing = true;
        map = new int[mapW*mapH][3];
        count = 0;
        randomizeMap();
    }
    public void randomizeMap(){
        for(int i = 0; i < map.length;i++){
            map[i][0] = i%mapW;
            map[i][1] = (int)(i/mapW);
            if(Math.random() <= 0.5){
                map[i][2] = 0;
            }
            else{
                map[i][2] = 1;
            }
        }
    }
    public boolean isOver(){
        return !gameOngoing;
    }
    public int[][] getMap(){
        return map;
    }
    public int[][] getChars(){
        return null;
    }
    public int getMapWidth(){
        return mapW;
    }
    public int getMapHeight(){
        return mapH;
    }
    public void runRound(){
        System.out.println("Running round");
        count++;
        if(count == 20)
            gameOngoing = false;
        randomizeMap();
    }
    public ArrayList<Image> getTextures(){
        Toolkit tool = Toolkit.getDefaultToolkit();  
        ArrayList<Image> textures = new ArrayList<Image>();
        textures.add(tool.getImage("grass.png"));
        textures.add(tool.getImage("dirt.png"));
        return textures;
    }
}