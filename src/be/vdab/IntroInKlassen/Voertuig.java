/*
 * Voertuig.java
 */
package be.vdab.IntroInKlassen;

/**
 *
 * @author Andy.mertens
 */
abstract class Voertuig {
    
    public final char PROPERTY_SEPERATOR = '-';
    
    protected String polishouder;
    protected float kostprijs;
    protected int pk;
    protected float gemiddeldVerbruik;
    protected String nummerplaat;

    public Voertuig(){
        polishouder=null;
        kostprijs=0.0F;
        pk=0;
        gemiddeldVerbruik=0.0F;
        nummerplaat=null;
    }
    
    public Voertuig(String naamHouder, float prijsVoertuig, int vermogen,float verbruik, String nummerPlaat){
        polishouder=naamHouder;
        kostprijs=prijsVoertuig;
        pk=vermogen;
        gemiddeldVerbruik=verbruik;
        nummerplaat=nummerPlaat;
    }
    
    /**
     * @return the polishouder
     */
    public String getPolishouder() {
        return polishouder;
    }

    /**
     * @param polishouder the polishouder to set
     */
    public void setPolishouder(String polishouder) {
        this.polishouder = polishouder;
    }

    /**
     * @return the kostprijs
     */
    public float getKostprijs() {
        return kostprijs;
    }

    /**
     * @param kostprijs the kostprijs to set
     */
    public void setKostprijs(float kostprijs) {
        this.kostprijs = kostprijs;
    }

    /**
     * @return the pk
     */
    public int getPk() {
        return pk;
    }

    /**
     * @param pk the pk to set
     */
    public void setPk(int pk) {
        this.pk = pk;
    }

    /**
     * @return the gemiddeldVerbuik
     */
    public float getGemiddeldVerbuik() {
        return gemiddeldVerbruik;
    }

    /**
     * @param gemiddeldVerbuik the gemiddeldVerbuik to set
     */
    public void setGemiddeldVerbuik(float gemiddeldVerbuik) {
        this.gemiddeldVerbruik = gemiddeldVerbuik;
    }

    /**
     * @return the nummerplaat
     */
    public String getNummerplaat() {
        return nummerplaat;
    }

    /**
     * @param nummerplaat the nummerplaat to set
     */
    public void setNummerplaat(String nummerplaat) {
        this.nummerplaat = nummerplaat;
    }
    
    @Override
    public String toString(){
        return (polishouder + PROPERTY_SEPERATOR + kostprijs + PROPERTY_SEPERATOR + pk + 
                PROPERTY_SEPERATOR + gemiddeldVerbruik + PROPERTY_SEPERATOR + nummerplaat);
    }
    
    public void Toon(){
        System.out.println("Houder : " + polishouder);
        System.out.println("Kostprijs (euro) : " + kostprijs);
        System.out.println("Vermogen (pk) : " + pk);
        System.out.println("Gemideld verbruik (l/100km) : " + gemiddeldVerbruik);
        System.out.println("Nummerplaat : " + nummerplaat);
    }
    
    protected abstract double getKyotoScore();
        
}
