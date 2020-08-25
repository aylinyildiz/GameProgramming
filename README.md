# GameProgramming :computer:
Game programming with _Java_  


![alt text](https://img-a.udemycdn.com/course/750x422/2669808_fcbe.jpg)





***In the main method, create one enemy and one player. 
While any of their health is greater than zero. 
Let, player attack to Enemy and enemy will defense, 
and Enemy attack to player and player will defense.***


|   IceAttack   |
| ------------- |
| ~ Character IceAttack(Character c)     | 

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
