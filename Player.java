import java.util.*;

public class Player{
  private String name;
  private ArrayList<Player> team;
  private int height;
  private int weight;
  
  public Player(String n, int h, int w){
    name=n;
    height=h;
    weight=w;
  }


  private final class Playerstats{
      private String name;
      private int height;
      private int weight;
  
    public void Player(String n, int h, int w){
        name=n;
        height=h;
        weight=w;
        }
    
    public String toString(){
      return name+" is "+height+" inches tall and weighs "+weight+" pounds.";
    }
    
  }
  public Player addPlayer(String name, int height, int weight){
    Player p1=new Player(name, height, weight);
    team.add(p1);
    return p1;
  }
  
  private final class Dumbell{
    private int weight;
    private boolean adjustable;
    
    public Dumbell(int w, boolean a){
      weight=w;
      adjustable=a;
    }
  }
}