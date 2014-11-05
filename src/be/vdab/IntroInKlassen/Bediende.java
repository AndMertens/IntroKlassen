package be.vdab.IntroInKlassen;

/*
 * Bediende.java (Main class)
 */
import java.util.*;
import java.text.*;
/**
 *
 * @author Andy.Mertens
 */
public class Bediende {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat formatBedrag = new DecimalFormat("#,##0.00");
        
        /*
        EXAMPLE OF POLYMORPHISM
        Rekening [] rekeningen = new Rekening[100];
        rekeningen[0] = new SpaarRekening("BE13 7441 7409 9852",2.0);
        rekeningen[1] = new ZichtRekening("BE25 1375 5175 0108",1250);
        rekeningen[0].Storten(100.0);
        rekeningen[1].Storten(200.0);
        rekeningen[1].Afhalen(25.0);
        rekeningen[0].Overschrijven(rekeningen[1],80.0);
        for(Rekening r : rekeningen)
        {
            if(r!=null)
               System.out.println("Saldo van rekening " + r.toString() + " :" + formatBedrag.format(r.geefSaldo()));
        }
        */
        /*
        EXAMPLE OF CLONE
            try{
            SpaarRekening spaar2 = spaar1.clone();
            System.out.println(spaar2);
            }
            catch (CloneNotSupportedException ex){
                System.out.println(ex.toString());
            }
        */
        
        Voertuig [] fleet = new Voertuig[10];
        fleet[0] = new Vrachtwagen();
        fleet[1] = new Personenwagen();
        fleet[0] = new Vrachtwagen("Andy",2500000,450,18,"1-avz-512",5000);
        fleet[2] = new Personenwagen("Ingrid", 25000, 110, 5.5F,"1-avo-066",5,4);
        
        for(Voertuig v : fleet)
        {
            System.out.println(v.toString());
            v.Toon();
        }
    }
    
}
