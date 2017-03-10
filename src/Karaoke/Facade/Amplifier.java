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
public class Amplifier {
	String description;
	
	public Amplifier(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}
 
	public void setSound() {
		System.out.println(description + " stereo mode on");
	}
        
	public void setVolume(int level) {
		System.out.println(description + " setting volume to " + level);
	}
        public void setMicrophone(){
            System.out.println(description+" Microphone on");
        }
	public String toString() {
		return description;
	}
}
