package tugasPraktikum;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Praktikum PBO - Tugas Praktikum Polimorfisme
 */
public class Zombie implements Destroyable{
    protected int health;
    protected int level;
    
    public void heal(){
        
    }
    
    @Override
    public void destroyed(){
        
    }
    
    public String getZombieInfo(){
        String info = "\nHealth " + health + "\nLevel = " + level;
        return info;
    }
}