/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.IntroInKlassen;

import java.util.Date;

/**
 *
 * @author Andy.mertens
 */
public class Rekening {
    
    protected String rekeningNummer;
    private double saldo;
        
    protected Rekening(String rekeningNr){
        rekeningNummer = rekeningNr;
        saldo = 0;
    }
    
    protected void Storten(double bedrag){
        saldo+=bedrag;
    }
    
    protected void Afhalen(double bedrag){
        if(saldo>bedrag) 
           saldo-=bedrag;
        else
            System.out.println("Saldo ontoereikend : " + geefSaldo());
    }
    
    protected void Overschrijven(Rekening naarRekening, double bedrag){
        if(saldo>bedrag) {
           saldo-=bedrag;
           naarRekening.Storten(bedrag);
        }
        else
            System.out.println("Saldo ontoereikend : " + geefSaldo());
    }
    
    protected double geefSaldo(){
        return saldo;
    }
    
    @Override public String toString(){
        return (rekeningNummer + " , " + saldo);
    }
    
     
          
}