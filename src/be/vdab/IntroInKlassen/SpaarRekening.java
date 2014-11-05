package be.vdab.IntroInKlassen;

/*
 * SpaarRekening.java
 */
 
import java.util.*;
/**
 *
 * @author Andy.Mertens
 */
public class SpaarRekening extends Rekening implements Cloneable  {
   
    private double interest;
    
    public SpaarRekening(String rekeningNr){
        super(rekeningNr);
        interest = 0;
    }
    
    public SpaarRekening(String rekeningNr, double Interest){
        super(rekeningNr);
        interest = Interest;
    }
    
    @Override public double geefSaldo(){
        super.Storten(berekenRente());
        return super.geefSaldo(); 
    }
      
   private double berekenRente(){
       return super.geefSaldo() * interest/100;
   }
   
   @Override public String toString(){
        return ("Spaarrekening - " + super.toString() + " , "+ interest);
    }
   
   @Override public SpaarRekening clone()throws CloneNotSupportedException{
       return (SpaarRekening)super.clone();
    }
}
