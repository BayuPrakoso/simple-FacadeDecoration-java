/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karaoke.Decorator;

/**
 *
 * @author BayuPrakoso
 */
public class VIP extends Bill{
    double cost = 15.0;
    double tempCost = 0;
    
    public VIP() {
        description = "- Ruangan VIP ($15.0) ";
    }
    
    public double cost() {
	return tempCost;
    }
        
    public void setCost(int durasi){
        description += "x "+durasi+"jam\t\t\t :  $"+(durasi*cost)+"\n";
        tempCost+=durasi*cost;
    }
}
