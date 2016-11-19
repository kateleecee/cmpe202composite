
/**
 * Write a description of class Side here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Side extends IBurger
{
    private String description = "";
    private Double price = 0.00;
    private IBurger burger;
    private String[] selected;
    private String[] options = {
        "Shoestring Fries",
        "Grilled Vegetable Skewers 2pcs",
        "Lettuce Blend Side Salad",
        "Coleslaw",
        "Sweet Potato Fries",
        "Onion Strings"
    };

    /**
     * Constructor for objects of class Side
     */
    public Side(IBurger b, String[] strs)
    {
        burger = b;
        this.selected = strs;
        for(String str: strs)
        {
            this.description += " + " + str;
        }
        this.description = description.substring(3);
        this.price = getPrice();
    }

    public Double getPrice()
    {
        int count = 0;
            for(String str: selected)
            {
                if(str.equals("No Side"))
                {
                    return burger.getPrice();
                }
                for(String option: options)
                {
                    if(str.equals(option))
                    {
                        count += 1;
                    }
                }
            }
            if((count) != selected.length)
        {
            System.out.println("No Such Order");
        }
                this.price = burger.getPrice() + count * 3.00;
        return this.price;
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
