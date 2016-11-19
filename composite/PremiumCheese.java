
/**
 * Write a description of class PremiumCheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumCheese extends IBurger
{
    // instance variables - replace the example below with your own
    private String description = "";
    private Double price = 0.00;
    private IBurger burger;
    private String[] options = {
        "Danish Blue Cheese",
        "Fresh Mozzarella",
        "Gruyere",
        "Soft-Ripened Brie",
        "Vegan Cheddar",
        "Manchego",
        "Herbed Goat Cheese",
        "Spread"
    };
    private String[] selected;

    /**
     * Constructor for objects of class PremiumCheese
     */
    public PremiumCheese(IBurger b, String[] strs)
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
                for(String option: options)
                {
                    if(str.equals(option))
                    {
                        count += 1;
                    }
                }
            }
            if(count != selected.length)
        {
            System.out.println("No Such Order");
        }
            this.price = burger.getPrice() + count * 1.50;
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
