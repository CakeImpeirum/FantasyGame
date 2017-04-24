
import java.util.Random;

public class Held extends Mensch 
{
    private boolean fsaubereWaesche = true;
    
    //getter
    public boolean getsaubereWaesche()
    {
      return fsaubereWaesche;            
    }
    
    //setter
    public void setsaubereWaesche(boolean asauberewaesche)
    {
      fsaubereWaesche = asauberewaesche;
    }
    
    //konstruktor
    public Held(String ahaarfarbe, String averletzung, String aheldenkraft, double agroesse) 
    {
        super(ahaarfarbe, averletzung, aheldenkraft, agroesse);
    }
    
    //Eigenschaften
    public void fliegen()
    {
        
    }
    public void verteidigen(Mensch aMensch)
    {
                
    }
    public void autofahren()
    {
        
    }  
}
