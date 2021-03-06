
/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends IBurger
{
    // instance variables - replace the example below with your own
    private String description = "";
    private Double price = 0.00;
    private IBurger burger;
    private String[] options = {
        "Yellow American",
        "Sharp Provolone",
        "Horseradish Cheddar",
        "Spicy Jalapeno Jack",
        "Savory Swiss",
        "Smoked Gouda",
        "Greek Feta",
        "Tillamook Cheddar"
    };
    private String[] selected;

    /**
     * Constructor for objects of class Cheese
     */
    public Cheese(IBurger b, String[] strs)
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
            if(count >= 1)
            {
                this.price = burger.getPrice() + count - 1;
            }
            else{
                this.price = burger.getPrice();
            }
            if(count != selected.length)
            {
            System.out.println("No Such Order");
        }
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
