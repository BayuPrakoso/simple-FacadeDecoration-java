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
public class LampuDisco {

    String deskripsi;

    public LampuDisco(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void on() {
        System.out.println(deskripsi + " set on");
    }

    public void off() {
        System.out.println(deskripsi + " set off");
    }

    public void putarOn() {
        System.out.println("memutar lampu disko");
    }

    public void putarOff() {
        System.out.println(deskripsi + " berhenti memutar");
    }

}
