/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karaoke.Decorator;

/**
 *
 * @author Bayu Prakoso
 */
public abstract class Bill {
    String description = "Unknown Room";
  
	public String getDescription() {
		return description;
	}
        
        public abstract double cost();
	public abstract void setCost(int durasi);
}
