
/**
 * Write a description of class Sauce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sauce extends IBurger
{
    private String[] selected;
    private String description = "";
    private Double price = 0.00;
    private IBurger burger;
    private String[] options = {
        "Red Relish",
        "Horseradish Aioli",
        "Smoky Chipotle Aioli",
        "Roasted Garlic Aioli",
        "Housemode Tzatziki Sauce",
        "House Mustard",
        "Spicy Worcestershire",
        "Apricot Sauce",
        "Hot Wing Sauce",
        "Signature Steak Sauce",
        "Spicy Sour Cream",
        "Tangy Thousand Island",
        "Hickory BBQ Sauce",
        "Mayonnaise",
        "Thai Peanut Sauce",
        "Sweet Sriracha",
        "Habanero Salsa",
        "Basil Pesto",
        "Creamy Caesar",
        "Country Buttermilk Ranch",
        "Honey Dijon",
        "Lemon Vinaigrette",
        "Dijon Balsamic Dressing",
        "Sesame Ginger Dressing",
        "Sun-Dried Tomato Vinaigrette",
        "Nori-soy Sauce"
    };

    /**
     * Constructor for objects of class Cheese
     */
    public Sauce(IBurger b, String[] strs)
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
                this.price = burger.getPrice() + (count - 1)*0.50;
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
