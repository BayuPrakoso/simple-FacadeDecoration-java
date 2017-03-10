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
public class LuarBiasa extends Bill{
    double cost = 10.0;
    double tempCost = 0;
    
    public LuarBiasa() {
        description = "- Ruangan Luar Biasa ($10.0) ";
    }
    
    public double cost() {
	return tempCost;
    }
        
    public void setCost(int durasi){
        description += "x "+durasi+"jam\t\t\t :  $"+(durasi*cost)+"\n";
        tempCost+=durasi*cost;
    }
}
