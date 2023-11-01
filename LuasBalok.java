/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author Reynaldo
 */
public class LuasBalok extends LuasPermukaan {

    public LuasBalok(int p, int l, int t) {
        super(p, l, t);
    }

    int Luas() {
        return 2 * ((p * l) + (p * t) + (l * t));
    }

    void hasilLuasBalok() {
        System.out.println("Luas Permukaan Balok (p : 5cm, l : 3cm, t : 6cm)   = " + Luas()+ " cm^2");
    }
}