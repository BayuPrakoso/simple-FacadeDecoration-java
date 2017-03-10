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
public class TV {
    String deskripsi;
	
	public TV(String deskripsi) {
		this.deskripsi = deskripsi;
	}
 
	public void on() {
		System.out.println(deskripsi);
	}
 
	public void off() {
		System.out.println(deskripsi + " shut down");
	}
   
        public String toString() {
                return deskripsi;
        }
}
