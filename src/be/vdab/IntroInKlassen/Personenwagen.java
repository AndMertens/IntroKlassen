/*
 *PersonenWagen.java
 */
package be.vdab.IntroInKlassen;

/**
 *
 * @author Andy.mertens
 */
public class Personenwagen extends Voertuig {
    public final int STANDAARD_AANTAL_DEUREN = 4;
    public final int STANDAARD_AANTAL_PASSAGIERS = 4;
    
    private int aantalDeuren;
    private int aantalPassagiers;

    /**
     * @return the aantalDeuren
     */
    public int getAantalDeuren() {
        return aantalDeuren;
    }

    /**
     * @param aantalDeuren the aantalDeuren to set
     */
    public void setAantalDeuren(int aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }

    /**
     * @return the aantalPassagiers
     */
    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    /**
     * @param aantalPassagiers the aantalPassagiers to set
     */
    public void setAantalPassagiers(int aantalPassagiers) {
        this.aantalPassagiers = aantalPassagiers;
    }
    
    public Personenwagen(){
        super();
        aantalDeuren = STANDAARD_AANTAL_DEUREN;
        aantalPassagiers=STANDAARD_AANTAL_PASSAGIERS;
    }
    
    public Personenwagen(String naamHouder, float prijsVoertuig, int vermogen,
                                float verbruik, String nummerPlaat, int deurenAantal, int passagiersAantal){
       super(naamHouder,prijsVoertuig,vermogen,verbruik,nummerPlaat);
       if(deurenAantal >= STANDAARD_AANTAL_DEUREN) aantalDeuren = deurenAantal;
       else aantalDeuren = STANDAARD_AANTAL_DEUREN;
       if(passagiersAantal>=STANDAARD_AANTAL_PASSAGIERS) aantalPassagiers = passagiersAantal;
       else aantalPassagiers = STANDAARD_AANTAL_PASSAGIERS;
    }
    
     @Override public void Toon(){
        super.Toon();
        System.out.println("Aantal passagiers : " + aantalPassagiers);
        System.out.println("Aantal Deuren : " + aantalDeuren);
     }
    
    @Override public String toString(){
        return (super.toString() + super.PROPERTY_SEPERATOR + aantalDeuren 
                + super.PROPERTY_SEPERATOR + aantalPassagiers);
    }
  
    @Override public double getKyotoScore(){
      return ( (gemiddeldVerbruik * pk) / aantalPassagiers);  
    }
}
