public class Enemy extends Character implements IceAttack {

    public Enemy(String name, int id) {
        super(name, id);
    }

    void attack(Character c){
        c.health-=10;
        c.score+=5;
        System.out.println("Enemy health : " +c.health + " Enemy Score: " +  c.score);
    }

    public void IceAttack(Character c) {
        c.health-=15;
        c.score+=10;
        System.out.println("Enemy health : " +c.health + " Enemy Score: " + c.score);
        
    }

    void defense(){
        System.out.println("Defence");
    }  
}
