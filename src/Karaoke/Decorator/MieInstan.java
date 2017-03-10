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
public class MieInstan extends CondimentDecorator{
    Bill bill;
    double cost = 1.2;
    double tempCost = 0;
        int jumlah = 0;
            
	public MieInstan(Bill bill) {
		this.bill = bill;
	}

	public String getDescription() {
		return bill.getDescription() + "- Mie Instan ($1.2) x "+jumlah+"jam\t\t\t :  $"+tempCost+"\n";
	}

	public double cost() {
            return tempCost + bill.cost();
        }

        public void setCost(int jumlah){
            this.jumlah = jumlah;
            tempCost = cost*jumlah;
        }
}
