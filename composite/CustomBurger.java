import java.util.ArrayList;
import java.text.DecimalFormat;
/**
 * Write a description of class CustomBurger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CustomBurger implements Component
{
    ArrayList<IBurger> components = new ArrayList<IBurger>() ;
    String description;
    Double price;
    public CustomBurger ( String d )
    {
        description = d ;
    }
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( description + " " + fmt.format(getPrice()) ) ;
        String str = "";
        for (IBurger obj  : components)
        {
            obj.printDescription();
        } 
    }
    
    public Double getPrice()
    {
        if(!components.isEmpty())
        {
            return components.get(components.size() - 1).getPrice();
        }
        return 0.00;
    }
    
    public void addChild(IBurger c) {
        components.add( c ) ;
	}
	 
	public void removeChild(IBurger c) {
        components.remove(c) ;
	}
	 
	public IBurger getChild(int i) {
	    return components.get( i ) ;
	}
}
