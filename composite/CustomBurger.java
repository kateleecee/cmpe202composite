import java.util.ArrayList;
import java.text.DecimalFormat;
/**
 * Write a description of class CustomBurger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CustomBurger extends IBurger
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
        System.out.println( description + " " + fmt.format(price) ) ;
        String str = "";
        for (IBurger obj  : components)
        {
            if(!str.contains(obj.getDescription())){
            str += obj.getDescription();}
            for(int i = 0; i<components.size(); i++)
            {
                if(obj.getClass().getSimpleName().toString().equals(getChild(i).getClass().getSimpleName().toString()))
                {
                    if(!str.contains(getChild(i).getDescription()))
                    {
                        str += " + " + getChild(i).getDescription();
                        
                    }
                }
            }
            if(!str.endsWith("\n"))
            {
                str+="\n";
            }
        } 
        System.out.println(str) ;
    }
    
    public Double getPrice()
    {
        return this.price;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setPrice(IBurger c)
    {
        price = c.getPrice();
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
