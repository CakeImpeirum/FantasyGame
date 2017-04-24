public class Tyran extends Mensch {

    private boolean fVernarbtesGesicht = false;
    private boolean fFehlendeGliedmassen = false;

    //konstruktor
    public Tyran(String ahaarfarbe, String averletzung, String aheldenkraft, double agroesse) 
    {
        super(ahaarfarbe, averletzung, aheldenkraft, agroesse);
    }
    
    //setter
    public void setverletzung(String averletzung, boolean agesicht, boolean agliedmassen)
    {
      super.setverletzung(averletzung);
      if (agesicht)                 
        fVernarbtesGesicht = true;
      if (agliedmassen)
        fFehlendeGliedmassen = true;
    }
    
    //getter
    public boolean getVernarbtesGesicht()
    {
        return fVernarbtesGesicht;
    }
    public boolean getFehlendeGliedmassen()
    {
        return fFehlendeGliedmassen;
    }
    
    //eigneschafften
    public void Streiten() 
    {
    }
    public void Pluendern() 
    {
    }
    public void Autofahren() 
    {
    }
}
