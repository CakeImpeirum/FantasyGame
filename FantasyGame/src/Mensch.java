public class Mensch {

    private String fhaarfarbe;
    private String fheldenkraft;
    private double fgroesse;
    private String fverletzung;
    
    //getter
    public String gethaarfarbe()
    {
       return fhaarfarbe;
    }    
    public String getheldenkraft()
    {
        return fheldenkraft;
    }
    public double getGroesse()
    {
        return fgroesse;
    }
    public String getverletzung()
    {
        return fverletzung;
    }
    
    //setter
    public void sethaarfarbe(String ahaarfarbe)
    {
        fhaarfarbe = ahaarfarbe;
    }
    public void setheldenkraft(String aheldenkraft)
    {
        fheldenkraft = aheldenkraft;
    }
    public void setgroesse(double agroesse)
    {
        fgroesse = agroesse;
    }
    public void setverletzung(String averletzung)
    {
        fverletzung = averletzung;
    } 
    //konstruktor
    
    public Mensch(String ahaarfarbe, String averletzung, String aheldenkraft, double agroesse)
    {
      fhaarfarbe = ahaarfarbe;
      fheldenkraft = aheldenkraft;
      fverletzung = averletzung;
      fgroesse = agroesse;
    }
    
    //eigenschaften
    public void sprechen() 
    {
    }
    public void laufen() 
    {       
    }
    
    public void Kriechen() 
    {       
    }
}
