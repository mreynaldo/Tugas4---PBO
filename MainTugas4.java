/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

/**
 *
 * @author Reynaldo
 */
public class MainTugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Volume v1 = new Volume(9);
        Volume v2 = new Volume(5, 3, 6);
        LuasBalok lb = new LuasBalok(5, 3, 6);
        LuasKubus lk = new LuasKubus(9);

        System.out.println("========= Menghitung Volume =========");
        v1.tampilanKubus();
        v2.tampilanBalok();
        System.out.println("");
        System.out.println("================ Menghitung Luas Permukaan ================");
        lk.hasilLuasKubus();
        lb.hasilLuasBalok();
    }

}
