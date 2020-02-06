public class Round{
    private int[][] map;
    private int[][] players;
    public Round(int[][] m, int[][] p){
        map = m;
        players = p;
    }
    public int[][] getMap(){
        return map;
    }
    public int[][] getPlayers(){
        return players;
    }
}