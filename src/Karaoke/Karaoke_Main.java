/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karaoke;

import Karaoke.Facade.ScreenMenu;
import Karaoke.Facade.Lampu;
import Karaoke.Facade.AC;
import Karaoke.Facade.TV;
import Karaoke.Facade.Amplifier;
import Karaoke.Facade.Microphone;
import Karaoke.Facade.LampuDisco;
import Karaoke.Facade.Sound;
import java.util.Scanner;

/**
 *
 * @author BayuPrakoso
 */
public class Karaoke_Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Amplifier amp = new Amplifier("Yap Yap Amplifier");
	Sound sound = new Sound("Dolby Sound", amp);
	Microphone mic = new Microphone("Tama Mic", amp);
	AC ac = new AC("LG AC");
	TV tv = new TV("Welcome to Bayu Fiesta");
        ScreenMenu comp = new ScreenMenu("Screen Menu is ");
	Lampu lamp = new Lampu("Lampu Philips");
	LampuDisco Disco = new LampuDisco("Tiger Disco");
	
	KaraokeFacade karaoke = new KaraokeFacade(amp,ac,lamp,Disco,mic,tv, sound, comp);
        
        karaoke.PesanRuangan();
	karaoke.MasukRuangan(karaoke.getTipeRuang());
        karaoke.KeluarRuangan();
    }
}
