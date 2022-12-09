package tugasTeori2;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * PBO Teori - Tugas Polimorfisme
 */
public class Manusia {
    void nyalakanPerangkat(Elektronik perangkat){
        if(perangkat instanceof TelevisiJadul){
            System.out.println("Nyalakan televisi jadul dengan input: " + ((TelevisiJadul)perangkat).getModeInput());
            System.out.println("Voltase televisi: " + perangkat.getVoltase());
        }else if(perangkat instanceof TelevisiModern){
            System.out.println("Nyalakan televisi modern dengan input: "+ ((TelevisiModern)perangkat).getModeInput());
            System.out.println("Voltase televisi: " +  perangkat.getVoltase());
        }
    }
}