import java.awt.*;
import java.util.*;
public class TempGame implements Game{
    int mapW;
    int mapH;
    int[][] map;
    public TempGame(){
        mapW = 30;
        mapH = 20;
        map = new int[mapW*mapH][3];
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
        
    }
    public ArrayList<Image> getTextures(){
        Toolkit tool = Toolkit.getDefaultToolkit();  
        ArrayList<Image> textures = new ArrayList<Image>();
        textures.add(tool.getImage("grass.png"));
        textures.add(tool.getImage("dirt.png"));
        return textures;
    }
}