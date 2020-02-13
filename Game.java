import java.awt.*;
import java.util.*;
public interface Game{
    //Type should be the same as index in the array of textures
    //{x,y,type}
    public int[] getMap();
    //{x,y,type}
    public int[][] getChars();
    public int getMapWidth();
    public int getMapHeight();
    public ArrayList<Image> getTextures();
    public void runRound();
    public boolean isOver();
}