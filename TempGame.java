import java.awt.*;
import java.util.*;
public class TempGame implements Game{
    int mapW;
    int mapH;
    int[] map;
    boolean gameOngoing;
    int count;
    public TempGame(){
        mapW = 30;
        mapH = 20;
        gameOngoing = true;
        map = new int[mapW*mapH];
        count = 0;
        randomizeMap();
    }
    public void randomizeMap(){
        for(int i = 0; i < map.length;i++){
            if(Math.random() <= 0.5){
                map[i] = 0;
            }
            else{
                map[i] = 1;
            }
        }
    }
    public boolean isOver(){
        return !gameOngoing;
    }
    public int[] getMap(){
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