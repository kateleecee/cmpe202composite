
/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger extends IBurger
{
    // instance variables - replace the example below with your own
    private String description = "";
    private Double price = 0.00;
    private String[] options;

    /**
     * Constructor for objects of class Burger
     */
    public Burger( String[] strs)
    {
        this.options = strs;
        for(String str: strs)
        {
            this.description += " + " + str;
        }
        this.description = description.substring(3);
        this.price = getPrice();
    }
    
    public void printDescription()
    {
        System.out.println(this.description);
    }
    
    public Double getPrice()
    {
        Double lb_price = 0.00;
        Double f_price = 0.00;
        Double bun_price = 0.00;
        switch(options[0])
        {
            case "Hormone & Antibiotic Free Beef*":
            case "100% Natural Chicken Breast":
            case "100% Natural Ground Turkey":
            case "Housemade Vegan Veggie":f_price = 0.00;break;
            case "Organic Bison*":
            case "Ahi Tuna":f_price = 4.00;break;
            default: System.out.println("No such Order");
            break;
        }
        switch(options[1])
        {
            case "1/3lb.": lb_price = 9.00;
                        break;
            case "1/2lb.": lb_price = 12.00;
                        break;
            case "1lb.": lb_price = 18.00;
                        break;
            default: System.out.println("No such Order");
            break;
        }
        switch(options[2]){
            case "On A Bun":bun_price = 0.00;break;
            case "Seasonal Lettuce Blend":
            case "Baby Spinach":
            case "Kale":
            case "Quinoa":
            case "Organic Mixed Greens": bun_price = 1.00;
                        break;
            default: System.out.println("No such Order");
            break;
        }
        return bun_price + lb_price + f_price;
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
