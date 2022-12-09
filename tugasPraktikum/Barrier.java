package tugasPraktikum;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Praktikum PBO - Tugas Praktikum Polimorfisme
 */
public class Barrier implements Destroyable{
    private int strength;
    
    Barrier(int strength){
        this.strength = strength;
    }
    
    public void setStrength(int strength){
        this.strength = strength;
    }
    
    public int getStrength(){
        return strength;
    }
    
    @Override
    public void destroyed(){
        strength -= 9;
    }
    
    public String getBarrierInfo(){
        String info = "\nBarrier Strength = " + this.strength;
        return info;
    }
}