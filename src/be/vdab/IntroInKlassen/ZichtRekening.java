/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.IntroInKlassen;

/**
 *
 * @author Andy.mertens
 */
public class ZichtRekening extends Rekening {
       
    private double maxKrediet;
    
    public double getMaximumKrediet(){return maxKrediet;}
    
    public ZichtRekening(String rekeningNr){
        super(rekeningNr);
        maxKrediet = 0;
    }
    
    public ZichtRekening(String rekeningNr, double MaximumKrediet){
        super(rekeningNr);
        maxKrediet = MaximumKrediet;
    }
     
    @Override public void Afhalen(double Bedrag){
        double testSaldo = saldo - Bedrag + maxKrediet;
        if(testSaldo>0) saldo-=Bedrag;
    }
    
     @Override public String toString(){
         return ("Zichtrekening - " + super.toString());
    }
     
     @Override public double geefSaldo(){
         return (saldo-=0.05D);
     }
    
}
