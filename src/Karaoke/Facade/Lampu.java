/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karaoke.Facade;

/**
 *
 * @author HeruCS
 */
public class Lampu {
    String deskripsi;
	
	public Lampu(String deskripsi) {
		this.deskripsi = deskripsi;
	}
  
	public void on() {
		System.out.println(deskripsi + " on");
	}
  
	public void off() {
		System.out.println(deskripsi + " off");
	}
     
        public String toString() {
                return deskripsi;
        }
}
