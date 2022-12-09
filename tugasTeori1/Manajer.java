package tugasTeori1;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * PBO Teori - Latihan Polimorfisme
 */
public class Manajer extends Pegawai{
    private int tunjangan;
    
    Manajer(String nama, int gaji, int tunjangan){
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }
    
    @Override
    int getGaji(){
        return gaji;
    }
    
    int getTunjangan(){
        return tunjangan;
    }
}