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
public class AirMineral extends CondimentDecorator {
    Bill bill;
    double cost = 0.5;
    double tempCost = 0;
    int jumlah = 0;
    
    public AirMineral(Bill bill) {
        this.bill = bill;
    }

    public String getDescription() {
        return bill.getDescription() + "Air Mineral ($0.5) x "+jumlah+"jam\t\t\t :  $"+tempCost+"\n";
    }

    public double cost() {
	return tempCost + bill.cost();
    }
        
    public void setCost(int jumlah){
        this.jumlah = jumlah;
        tempCost = cost*jumlah;
    }
}
