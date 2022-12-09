package tugasTeori2;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * PBO Teori - Tugas Polimorfisme
 */
public class TelevisiJadul extends Elektronik{
    private String modeInput;
    
    TelevisiJadul(){
    }
    
    String getModeInput(){
        this.modeInput = "DUI";
        return modeInput;  
    }
}