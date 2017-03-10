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
public class Microphone {

    String description;
    Amplifier amplifier;

    public Microphone(String description, Amplifier amp) {
        this.description = description;
        this.amplifier = amp;
    }

    public void on() {
        System.out.println("ready to use");
    }

    public void off() {
        System.out.println("microphone is off");
    }
}
