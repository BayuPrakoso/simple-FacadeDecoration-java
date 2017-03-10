package Karaoke;

import Karaoke.Decorator.LuarBiasa;
import Karaoke.Decorator.MieInstan;
import Karaoke.Decorator.NasGor;
import Karaoke.Decorator.IceCream;
import Karaoke.Decorator.Softdrink;
import Karaoke.Decorator.Snack;
import Karaoke.Decorator.Biasa;
import Karaoke.Decorator.Bill;
import Karaoke.Decorator.AirMineral;
import Karaoke.Decorator.VIP;
import Karaoke.Facade.ScreenMenu;
import Karaoke.Facade.Lampu;
import Karaoke.Facade.AC;
import Karaoke.Facade.TV;
import Karaoke.Facade.Amplifier;
import Karaoke.Facade.Microphone;
import Karaoke.Facade.LampuDisco;
import Karaoke.Facade.Sound;
import com.sun.org.apache.xerces.internal.util.FeatureState;
import java.util.Scanner;

public class KaraokeFacade {

    Amplifier amp;
    AC ac;
    Lampu lamp;
    LampuDisco Disco;
    Microphone mic;
    TV tv;
    Sound sound;
    ScreenMenu comp;

    Bill bill;
    String rincian = "Rincian Harga:\n";

    public KaraokeFacade(Amplifier amp, AC ac,
            Lampu lamp, LampuDisco Disco, Microphone mic,
            TV tv, Sound sound, ScreenMenu comp) {

        this.amp = amp;
        this.ac = ac;
        this.Disco = Disco;
        this.lamp = lamp;
        this.comp = comp;
        this.mic = mic;
        this.tv = tv;
        this.sound = sound;

    }

    public void MasukRuangan(String tipe) {
        System.out.println("Memesan ruangan " + tipe);
        lamp.on();
        Disco.on();
        Disco.putarOn();
        ac.on();
        ac.aturSuhu(18);
        amp.on();
        amp.setMicrophone();
        amp.setSound();
        amp.setVolume(5);
        tv.on();
        comp.on();
    }

    public void KeluarRuangan() {

        lamp.off();
        Disco.off();
        Disco.putarOff();
        ac.off();
        amp.off();
        mic.off();
        sound.off();
        comp.off();
        tv.off();
        System.out.println("\n~~~~~~~~~~~~Melakukan pembayaran dengan rincian~~~~~~~~~~~");
        System.out.println(bill.getDescription() + "-----------------------------------------------------------"
                + "\n\t\t\t\tTotal Harga\t :  $" + bill.cost());

    }

    public void PesanRuangan() {

        Scanner input = new Scanner(System.in);
        int tempTipeRuang = 0;
        while (tempTipeRuang != 1 & tempTipeRuang != 2 & tempTipeRuang != 3) {
            System.out.println("List ruang:");
            System.out.println("1. VIP\t\t\t$15.0/jam");
            System.out.println("2. Luar Biasa\t\t$10.0/jam");
            System.out.println("3. Biasa\t\t$5.0/jam");
            System.out.println("Pilih yang mana?");
            tempTipeRuang = input.nextInt();
        }
        setTipeRuang(tempTipeRuang);

        int durasi = 0;
        while (durasi <= 0) {
            System.out.println("Durasi?");
            durasi = input.nextInt();
        }
        bill.setCost(durasi);

        String tambahMakan = null;
        while (!"N".equals(tambahMakan)) {
            System.out.println("Tambah makanan/minum? (Y/N)");
            tambahMakan = input.next().toUpperCase();
            if ("Y".equals(tambahMakan)) {
                int tempTambahan = 0;
                int tempJumlahMakan = 0;

                while (tempTambahan < 1 | tempTambahan > 6) {
                    System.out.println("~ Menu ~");
                    System.out.println("1. Nasi Goreng");
                    System.out.println("2. Mie Instan");
                    System.out.println("3. Snack");
                    System.out.println("---------------");
                    System.out.println("4. Air Mineral");
                    System.out.println("5. Ice Cream");
                    System.out.println("6. Softdrink");
                    System.out.println("---------------");
                    System.out.println("Pilih makan/minum!");
                    tempTambahan = input.nextInt();
                }
                setTambahan(tempTambahan);

                System.out.println("Jumlah?");
                tempJumlahMakan = input.nextInt();
                bill.setCost(tempJumlahMakan);
            }
        }

    }

    public void setTipeRuang(int pilihan) {
        switch (pilihan) {
            case 1:
                bill = new VIP();
                break;
            case 2:
                bill = new LuarBiasa();
                break;
            default:
                bill = new Biasa();
                break;
        }
    }

    public String getTipeRuang() {
        return bill.getDescription();
    }

    public void setTambahan(int tipeMakan) {
        switch (tipeMakan) {
            case 1:
                bill = new NasGor(bill);
                break;
            case 2:
                bill = new MieInstan(bill);
                break;
            case 3:
                bill = new Snack(bill);
                break;
            case 4:
                bill = new AirMineral(bill);
                break;
            case 5:
                bill = new IceCream(bill);
                break;
            default:
                bill = new Softdrink(bill);
                break;
        }
    }
}
