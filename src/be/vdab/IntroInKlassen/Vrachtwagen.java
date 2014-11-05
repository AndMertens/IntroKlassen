/*
 * Vrachtwagen.java
 */
package be.vdab.IntroInKlassen;

/**
 *
 * @author Andy.mertens
 */
public class Vrachtwagen extends Voertuig {
    public final float STANDAARD_MAXIMUM_LADING= 10000;
    private float maximumLading;

    /**
     * @return the maximumLading
     */
    public float getMaximumLading() {
        return maximumLading;
    }

    /**
     * @param maximumLading the maximumLading to set
     */
    public void setMaximumLading(float maximumLading) {
        this.maximumLading = maximumLading;
    }
    
   public Vrachtwagen(){
        super();
        maximumLading = STANDAARD_MAXIMUM_LADING;
    }
    
    public Vrachtwagen(String naamHouder, float prijsVoertuig, int vermogen,
                                float verbruik, String nummerPlaat, float maxLading){
        super(naamHouder,prijsVoertuig,vermogen,verbruik,nummerPlaat);
       if(maxLading>0) maximumLading = maxLading;
       else maximumLading = STANDAARD_MAXIMUM_LADING;
    }
    
    @Override public void Toon(){
        super.Toon();
        System.out.println("Maximum lading (kg): " + maximumLading);
    }
    
    @Override public String toString(){
        return (super.toString() + super.PROPERTY_SEPERATOR + maximumLading);
    }
    
     @Override public double getKyotoScore(){
      return ( (gemiddeldVerbruik * pk) / maximumLading);  
    }
}
