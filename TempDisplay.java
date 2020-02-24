import javax.swing.*;
import java.awt.*;
import java.util.*;
public class TempDisplay extends JPanel{
    Game game;
    ArrayList<Image> textures;
    int imgWidth;
    int imgHeight;
    public TempDisplay(Game g,int screenWidth, int screenHeight){
        System.out.println("Screen Width: "+screenWidth+" Screen Height: "+screenHeight);
        game = g;
        imgWidth = (int)(screenWidth/game.getMapWidth());
        imgHeight = (int)(screenHeight/game.getMapHeight());
        System.out.println("Block size should be Width: "+imgWidth+" Height: "+imgHeight);
        textures = new ArrayList<Image>();
        scaleTextures(game.getTextures(),imgWidth,imgHeight);
    }
    public void scaleTextures(ArrayList<Image> images,int scaledWidth, int scaledHeight){
        for(Image i: images){
            textures.add(i.getScaledInstance(scaledWidth,scaledHeight,0));
        }
    }
    public void draw(){
        game.runRound();
        this.repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int a = 0; a < game.getMap().length; a++){
            g.drawImage(textures.get(game.getMap()[a]),(a%game.getMapWidth())*imgWidth,(int)(a/game.getMapWidth())*imgHeight,this);
        }
        g.setColor(Color.RED);
        g.fillRect(0,0,64,54);
    }
}