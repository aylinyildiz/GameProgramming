# GameProgramming :computer:
Game programming with _Java_  


![alt text](https://www.jrebel.com/sites/rebel/files/image/2020-05/image-blog-revel-top-java-tools.jpg)





***In the main method, create one enemy and one player. 
While any of their health is greater than zero. 
Let, player attack to Enemy and enemy will defense, 
and Enemy attack to player and player will defense.***

  --Interface
|   IceAttack   |
| ------------- |
| ~ Character IceAttack(Character c)     | 

  --Interface
|   FireAttack   |
| ------------- |
| ~ Character IceAttack(Character c)     | 



| Enemy       |                                                          
| ------------- |
| + Enemy(String name, int id)    | 
| ~ Character attack(Character c)  | 
| ~ void defense() | 
| ~ Character IceAttack(Character c)|

| Player      |                                                          
| ------------- |
| + Player(String name, int id)    | 
| ~ Character attack(Character c)  | 
| ~ void defense() | 
| ~ Character fireAttack(Character c)|

| Character      |                                                          
| ------------- |
| ~ String name  | 
| ~ int id     | 
| ~ int score     | 
| ~ int health   | 
|----------------|
| + Character(String name, int id)|
| ~ Character attack(Character c)  | 
| ~ void defense() | 
