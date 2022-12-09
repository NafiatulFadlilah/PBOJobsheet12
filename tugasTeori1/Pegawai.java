package tugasTeori1;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * PBO Teori - Latihan Polimorfisme
 */
public class Pegawai {
    protected String nama;
    protected int gaji;
    
    Pegawai(){
    }
    
    Pegawai(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }
    
    int getGaji(){
        return gaji;
    }
}