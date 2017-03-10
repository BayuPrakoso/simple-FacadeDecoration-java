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
public class ScreenMenu {
    String deskripsi;
	
	public ScreenMenu(String deskripsi) {
		this.deskripsi = deskripsi;
	}
 
	public void on() {
		System.out.println(deskripsi + "ready");
	}
 
	public void off() {
		System.out.println(deskripsi + "shut down");
	}
 
  
        public String toString() {
                return deskripsi;
        }
}
