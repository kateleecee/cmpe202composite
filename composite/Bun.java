
/**
 * Write a description of class Bun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bun extends IBurger
{
    private String description = "";
    private Double price = 0.00;
    private IBurger burger;
    private String[] selected;
    private String[] options = {
        "Brioche Style Bun",
        "Ciabatta (Vegan)",
        "Multigrain Bun",
        "English Muffin"
    };
    private String[] specialOptions_1 = {
        "Pretzel Bun"
    };
    private String[] specialOptions_2 = {
        "Gluten-Free Bun",
        "Hawaiian Bun"
    };

    /**
     * Constructor for objects of class Bun
     */
    public Bun(IBurger b, String[] strs)
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
        int spe_count_1 = 0;
        int spe_count_2 = 0;
            for(String str: selected)
            {
                for(String option: options)
                {
                    if(str.equals(option))
                    {
                        count += 1;
                    }
                }
                for(String option: specialOptions_1)
                {
                    if(str.equals(option))
                    {
                        spe_count_1 += 1;
                    }
                }
                for(String option: specialOptions_2)
                {
                    if(str.equals(option))
                    {
                        spe_count_2 += 1;
                    }
                }
            }
            if((count+spe_count_1+spe_count_2) != selected.length)
        {
            System.out.println("No Such Order");
        }
                this.price = burger.getPrice() + spe_count_1 * 0.50 + spe_count_2 * 1.00;
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
