import java.text.DecimalFormat;
/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger extends IBurger
{
    // instance variables - replace the example below with your own
    private String description;
    private Double price;
    private String d1;
    private String d2;

    /**
     * Constructor for objects of class Burger
     */
    public Burger( String d, String _d1, String _d2)
    {
        this.description = d+" + "+_d1+" + "+_d2;
        d1 = _d1;
        d2 = _d2;
    }
    
    public void printDescription()
    {
        System.out.println(this.description);
    }
    
    public Double getPrice()
    {
        
        switch(d1)
        {
            case "1/3lb.": this.price = 9.50;
                        break;
            case "2/3lb.": this.price = 11.50;
                        break;
            case "1lb.": this.price = 15.50;
                        break;
        }
        switch(d2){
            case "On A Bun":break;
            case "Lettuce Blend":
            case "Organic Mixed Greens": this.price = price + 1.00;
                        break;
        }
        return this.price;
    }
    public String getDescription(){
        return this.description;
    }

     public void addChild(Component c) {
	    // no implementation
	}

	public void removeChild(Component c) {
        // no implementation
	}

	public Component getChild(int i) {
        // no implementation
        return null ;
	}
}
