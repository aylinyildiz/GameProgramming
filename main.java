public class TestMain {
    public static void main(String[] args){
        
        Enemy enemy = new Enemy("Enemy 1 ", 140);
        Player player = new Player("Player 1",220);
        
       
            do{
                player.attack(enemy);
                enemy.defense();
                player.fireAttack(enemy);
                enemy.defense();
                enemy.attack(player);
                player.defense();
                enemy.IceAttack(player);
            }while(enemy.health > 0 || player.health > 0);
        }
}
    
