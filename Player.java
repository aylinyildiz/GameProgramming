public class Player extends Character implements FireAttack{

     public Player(String name, int id){
       super(name, id);
    }
    
    void attack(Character c){ 
        c.health-=10;
        c.score+=5;
        System.out.println("Player health : " +c.health + " Player Score: " +  c.score);
    }
    
    public void defense(){
        System.out.println("Player is defending...");
    }
    
   public void fireAttack(Character c) {
         c.health-=20;
         c.score+=15;
        System.out.println("Player health : " +c.health + " Player Score: " +  c.score);
    }

}
