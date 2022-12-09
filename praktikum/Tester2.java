package praktikum;

/*
 * @author Nafiaaeluv
 * NIM: 2141762030
 * Nama: Nafiatul Fadlilah
 * Praktikum PBO - Polimorfisme
 */
public class Tester2 {
    public static void main(String[] args){
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        Employee e;
        e = pEmp;
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("-----------------------");
        System.out.println("" + pEmp.getEmployeeInfo());
    }
}