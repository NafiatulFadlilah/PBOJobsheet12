package tugasTeori2;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * PBO Teori - Tugas Polimorfisme
 */
public class TelevisiModern extends Elektronik{
    private String modeInput;
    
    TelevisiModern(){
    }
    
    String getModeInput(){
        this.modeInput = "HDMI";
        return modeInput;
    }
}