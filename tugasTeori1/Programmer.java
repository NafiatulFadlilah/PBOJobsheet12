package tugasTeori1;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * PBO Teori - Latihan Polimorfisme
 */
public class Programmer extends Pegawai{
    private int bonus;
    
    Programmer(String nama, int gaji, int bonus){
        super(nama, gaji);
        this.bonus = bonus;
    }
    
    @Override
    int getGaji(){
        return gaji;
    }
    
    int getBonus(){
        return bonus;
    }
}