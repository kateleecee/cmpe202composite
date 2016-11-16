
/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends IBurger
{
    // instance variables - replace the example below with your own
    private String description;
    private Double price;
    private IBurger burger;

    /**
     * Constructor for objects of class Cheese
     */
    public Cheese(IBurger b, String d, Double p)
    {
        burger = b;
        this.description = d;
        this.price = burger.getPrice() + p;
    }
    
    public Double getPrice()
    {
        return price;
    }
    public String getDescription(){
        return this.description;
    }
    

    public void printDescription()
    {
        System.out.println(this.description);
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
