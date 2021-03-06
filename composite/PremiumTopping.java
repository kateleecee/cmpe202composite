
/**
 * Write a description of class PremiumTopping here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumTopping extends IBurger
{
    private String description = "";
    private Double price = 0.00;
    private IBurger burger;
    private String[] selected;
    private String[] options = {
        "Sunny Side Up Egg*",
        "Marinated Artichokes",
        "Olive Tapenade",
        "Fried Pickle Chips",
        "Black Forest Ham",
        "Grilled Anaheim Peppers",
        "Crispy Onion Strings",
        "Sauteed Mushrooms",
        "Housemade Turkey Chili",
        "Grilled Red Onion",
        "Housemade Guacamole",
        "Applewood Smoked Bacon",
        "Oven Roasted Tomatoes",
        "Sliced Avocado",
        "Sun-Dried Tomatoes",
        "Smoked Pickled Jalapenos",
        "Housemade Chili"
    };
    private String[] specialOptions = {
        "Marinated Tomatoes"
    };

    /**
     * Constructor for objects of class Cheese
     */
    public PremiumTopping(IBurger b, String[] strs)
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
        int spe_count = 0;
            for(String str: selected)
            {
                for(String option: options)
                {
                    if(str.equals(option))
                    {
                        count += 1;
                    }
                }
                for(String option: specialOptions)
                {
                    if(str.equals(option))
                    {
                        spe_count += 1;
                    }
                }
            }
            if((count+spe_count) != selected.length)
        {
            System.out.println("No Such Order");
        }
                this.price = burger.getPrice() + count + spe_count * 2.00;
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
