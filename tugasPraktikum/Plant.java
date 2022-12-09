package tugasPraktikum;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Praktikum PBO - Tugas Praktikum Polimorfisme
 */
public class Plant {
    public void doDestroy(Destroyable d){
        if(d instanceof WalkingZombie){
            WalkingZombie wz = (WalkingZombie) d;
            wz.destroyed();
        }else if(d instanceof JumpingZombie){
            JumpingZombie jz = (JumpingZombie) d;
            jz.destroyed();
        }else if(d instanceof Barrier){
            Barrier b = (Barrier) d;
            b.destroyed();
        }
    }
}