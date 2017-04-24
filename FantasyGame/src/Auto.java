public class Auto 
{
    private String fFarbe, fhersteller;
    private Mensch fFahrer;
    private double fGeschwindigkeit, fpferdestaerken;
    
    //setter
    public void setFarbe(String aFarbe)
    {
      fFarbe = aFarbe;    
    }
    public boolean setFahrer(Mensch aFahrer)
    {
    if (aFahrer.getClass() == Held.class)
    {  
        fFahrer = aFahrer;
        return true;
    }
    else
      return false;
    }
    public void setGeschwindigkeit(double aGeschwindigkeit)
    {
      fGeschwindigkeit = aGeschwindigkeit;    
    }
    
    //getter
    public String getFarbe()
    {
      return fFarbe;    
    }
    public String getHersteller()
    {
      return fhersteller;    
    }
    public Mensch getFahrer()
    {
      return fFahrer;    
    }
    public double getGeschwindigkeit()
    {
      return fGeschwindigkeit;   
    }
    public double getPferdesaerken()
    {
      return fpferdestaerken;    
    }
    
    public Auto(String aFarbe, String aHersteller, double aPferdestaerken)
    {
        fFarbe = aFarbe;
        fhersteller = aHersteller;
        fpferdestaerken = aPferdestaerken;
    }
    
    public void abbiegen()
    {
        
    }
    public void bremsen()
    {
        setGeschwindigkeit(0);
    }
    public void beschleunigen(double ageschw)
    {
        setGeschwindigkeit(ageschw);
    }
    public void streckenzuwachs()
    {
        
    }
}
