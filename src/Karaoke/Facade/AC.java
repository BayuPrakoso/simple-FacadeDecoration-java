/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karaoke.Facade;

/**
 *
 * @author BayuPrakoso
 */
public class AC {
    String deskripsi;

    public AC(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void on() {
        System.out.println(deskripsi + " on");
    }

    public void off() {
        System.out.println(deskripsi + " off");
    }

    public void aturSuhu(int level) {
        System.out.println(deskripsi + " suhu " + level + "℃");
    }

    public String toString() {
        return deskripsi;
    }
}
