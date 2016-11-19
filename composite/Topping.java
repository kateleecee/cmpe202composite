
/**
 * Write a description of class Topping here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Topping extends IBurger
{
    // instance variables - replace the example below with your own
    private String description = "";
    private Double price = 0.00;
    private IBurger burger;
    private String[] options = {
        "Dill Pickle Chips",
        "Organic Mixed Greens",
        "Sliced Cucumbers",
        "Spicy Pepperoncinis",
        "Black Olives",
        "Spicy Pickles",
        "Seasonal Lettuce Blend",
        "Carrot Strings",
        "Pickled Carrots and Daikon",
        "Fresh Jalapenos",
        "Scallions",
        "Sliced Red Onion",
        "Baby Spinach",
        "Ripened Red Tomatoes",
        "Alfalfa Sprouts",
        "Jicama",
        "Grilled Pineapple",
        "Coleslaw",
        "Dried Cranberries",
        "Hard Boiled Eggs",
        "Roasted Green Chiles",
        "Onion Confit",
        "Kale",
        "Roasted Corn & Black Bean Salsa",
        "Roasted Red Peppers",
        "Quinoa",
        "Housemade Garlic Croutons",
        "Crushed Peanuts"
    };
    private String[] selected;

    /**
     * Constructor for objects of class Cheese
     */
    public Topping(IBurger b, String[] strs)
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

    public void printDescription()
    {
        System.out.println(this.description);
    }
    
    public Double getPrice()
    {
        int count = 0;
        for(String str: selected)
            {
                for(String option: options)
                {
                    if(str.equals(option)){
                        count += 1;
                    }
                }
            }
        if(count != selected.length)
        {
            System.out.println("No Such Order");
        }
        return burger.getPrice();
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
