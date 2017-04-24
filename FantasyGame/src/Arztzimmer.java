import java.util.ArrayList;

public class Arztzimmer extends Gebaude
{
  private int fplaetze;
  private ArrayList<Mensch> wartezimmer;
  public boolean istBesetzt()
  {
    if (fplaetze >= 4)
        return true;
    else
        return false;
  }
  public boolean istgeschlossen()
  {
      return false;
  }
  public boolean addpatient(Mensch amensch)
  {
    if (istBesetzt())  
        return false;
    else
    {
        System.out.println("patient setzt sich hin");
        wartezimmer.add(amensch);
        fplaetze++;
        return true;
    }
  }
  
  public void behnadelpatient()
  {
      for (int i = 0; i < wartezimmer.size(); i++) 
      {
        wartezimmer.get(i).setverletzung("");
        wartezimmer.get(i).setheldenkraft("");
        wartezimmer.remove(i);
        fplaetze--;
        break;
      }
  }
}
