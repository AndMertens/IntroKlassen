package be.vdab.IntroInKlassen;

/*
 * Bediende.java (Main class)
 */
import java.util.*;
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
        double stand;
        SpaarRekening spaar1 = new SpaarRekening("BE13 7441 7409 9852",2.0);
        ZichtRekening zicht1 = new ZichtRekening("BE25 1375 5175 0108",1250);
        spaar1.Storten(100.0);
        stand=spaar1.geefSaldo();
        System.out.println("Saldo van spaarrekening na storting : " + stand);
        spaar1.Overschrijven(zicht1,80.0);
        stand=spaar1.geefSaldo();
        System.out.println("Saldo van spaarrekening na overschrijving : " + stand);
        stand=zicht1.geefSaldo();
        zicht1.Afhalen(2000);
        System.out.println("Saldo van zichtrekening (na poging tot afhalen 2000) " + zicht1.geefSaldo());
        System.out.println(spaar1);
        System.out.println(zicht1);
        try{
        SpaarRekening spaar2 = spaar1.clone();
        System.out.println(spaar2);
        }
        catch (CloneNotSupportedException ex){
            System.out.println(ex.toString());
        }
    }
    
}
