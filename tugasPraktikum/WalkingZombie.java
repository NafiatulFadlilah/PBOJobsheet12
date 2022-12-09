package tugasPraktikum;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Praktikum PBO - Tugas Praktikum Polimorfisme
 */
public class WalkingZombie extends Zombie{
    WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    
    @Override
    public void heal(){
        switch(level){
            case 1: 
                this.health += 10;
                break;
            case 2: 
                this.health += 30;
                break;
            case 3:
                this.health += 40;
                break;
        }
    }
    
    @Override
    public void destroyed(){
        health -= 2;
    }
    
    @Override
    public String getZombieInfo(){
        String info = "Walking Zombie Data = " + super.getZombieInfo();
        return info;
    }
}