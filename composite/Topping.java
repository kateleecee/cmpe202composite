
/**
 * Write a description of class Topping here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Topping extends IBurger
{
    // instance variables - replace the example below with your own
    private String description;
    private Double price;
    private IBurger burger;

    /**
     * Constructor for objects of class Cheese
     */
    public Topping(IBurger b, String d, Double p)
    {
        burger = b;
        this.description = d;
        this.price = burger.getPrice() + p;
    }
    
    public String getDescription(){
        return this.description;
    }

    public void printDescription()
    {
        System.out.println(this.description);
    }
    
    public Double getPrice()
    {
        return price;
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
