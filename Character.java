public abstract class Character {
    String name;
    int id;
    int score;
    int health=100;
    
    public Character(String name, int id){
        this.name=name;
        this.id=id;
    }
    
    abstract void defense();

}
