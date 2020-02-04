import javax.swing.*;
import java.awt.*;
public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame("AI Battle Client");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(0,0,screenSize.width,screenSize.height);
        JPanel panel = new JPanel(new BorderLayout());
        String[] ais = new String[]{"Bob","Jeff","Steve","Martin"};
        
        JPanel control = new JPanel();
        control.setBackground(Color.GRAY);
        JPanel row1 = new JPanel();
        JLabel hello = new JLabel("AI BATTLE CLIENT");
        row1.add(hello);
        row1.setBackground(Color.WHITE);
        
        JPanel row2 = new JPanel();
        JLabel gameName = new JLabel("Select Game File: ");
        String[] gameTypes = new String[]{"Chess","Checkers","Battleship","Tic-Tac-Toe"};
        JComboBox games = new JComboBox(gameTypes);
        row2.add(gameName);
        row2.add(games);
        row2.setBackground(Color.WHITE);
        
        JPanel row3 = new JPanel();
        JLabel aiOneLabel = new JLabel("Player 1: ");
        JComboBox aiOneChoice = new JComboBox(ais);
        row3.add(aiOneLabel);
        row3.add(aiOneChoice);
        row3.setBackground(Color.WHITE);
        
        JPanel row4 = new JPanel();
        JLabel aiTwoLabel = new JLabel("Player 2: ");
        JComboBox aiTwoChoice = new JComboBox(ais);
        row4.add(aiTwoLabel);
        row4.add(aiTwoChoice);
        row4.setBackground(Color.WHITE);
        
        JPanel row5 = new JPanel();
        JButton run = new JButton("Run Game");
        row5.add(run);
        row5.setBackground(Color.WHITE);
        
        control.add(row1);
        control.add(row2);
        control.add(row3);
        control.add(row4);
        control.add(row5);
        
        panel.add(control,BorderLayout.NORTH);
        
        TempGame tempGame = new TempGame();
        Display display = new Display(tempGame);
        panel.add(display, BorderLayout.CENTER);
        frame.add(panel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);
        frame.show();
    }
}