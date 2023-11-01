/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author Reynaldo
 */
public class LuasKubus extends LuasPermukaan {

    public LuasKubus(int p) {
        super(p);
    }

    int luas() {
        return (6 * (p * p));
    }

    void hasilLuasKubus() {
        System.out.println("Luas Permukaan Kubus (9cm)                          = " + luas()+ " cm^2");
    }
}