package contohPolimorfisme;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Teori - Contoh Polimorfisme
 */
public class TestBuah {
    public static void main(String[] b){
        Manusia ilham = new Manusia();
        
        Apel myApel = new Apel();
        Pisang myPisang = new Pisang();
        
        ilham.makanBuah(myPisang);
    }
}