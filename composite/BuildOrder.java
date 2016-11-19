 

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        //order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        //order.addChild(new Leaf("The Purist", 8.00 ));
        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        IBurger b = new Burger(new String[]{
            "Organic Bison*",
            "1/2lb.",
            "On A Bun"
        });
        customBurger.addChild(b); // base price for 1/3 lb
        b = new Cheese(b, new String[]{
            "Yellow American",
            "Spicy Jalapeno Jack"
        });
        customBurger.addChild(b); 
        b = new PremiumCheese(b, new String[]{"Danish Blue Cheese"});
        customBurger.addChild(b); 
        b = new Sauce(b, new String[]{"Mayonnaise","Thai Peanut Sauce"});
        customBurger.addChild(b); 
        b = new Topping(b, new String[]{
            "Dill Pickle Chips",
            "Black Olives",
            "Spicy Pickles"
        });
        customBurger.addChild(b); 
        b = new PremiumTopping(b, new String[]{"Marinated Tomatoes"});
        customBurger.addChild(b); 
        b = new Bun(b, new String[]{"Ciabatta (Vegan)"});
        customBurger.addChild(b); 
        b = new Side(b, new String[]{"Shoestring Fries"});
        customBurger.addChild(b); 
        order.addChild( customBurger );
        
        //Second
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        IBurger b2 = new Burger(new String[]{
            "Hormone & Antibiotic Free Beef*",
            "1/3lb.",
            "On A Bun"
        });
        customBurger2.addChild(b2); // base price for 1/3 lb
        b2 = new Cheese(b2, new String[]{
            "Smoked Gouda",
            "Greek Feta"
        });
        customBurger2.addChild(b2); 
        b2 = new PremiumCheese(b2, new String[]{"Fresh Mozzarella"});
        customBurger2.addChild(b2); 
        b2 = new Sauce(b2, new String[]{"Habanero Salsa"});
        customBurger2.addChild(b2); 
        b2 = new Topping(b2, new String[]{
            "Crushed Peanuts"
        });
        customBurger2.addChild(b2); 
        b2 = new PremiumTopping(b2, new String[]{"Sunny Side Up Egg*", "Marinated Tomatoes"});
        customBurger2.addChild(b2); 
        b2 = new Bun(b2, new String[]{"Gluten-Free Bun"});
        customBurger2.addChild(b2); 
        b2 = new Side(b2, new String[]{"Shoestring Fries"});
        customBurger2.addChild(b2); 
        order.addChild( customBurger2 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/