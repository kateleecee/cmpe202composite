 

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));
        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        IBurger b = new Burger("Beef","1/3lb.","On A Bun");
        customBurger.addChild(b); // base price for 1/3 lb
        b = new Cheese(b,"Danish Blue Cheese", 0.00 );
        customBurger.addChild(b); // 1 cheese free, extra cheese +1.00
        b = new Cheese(b, "Horseradish Cheddar", 1.00);
        customBurger.addChild(b); // extra cheese +1.00
        b = new Topping(b, "Bermuda Red Onion", 0.00);
        customBurger.addChild(b); // 4 toppings free, extra +.75
        b = new Topping(b, "Black Olives", 0.00);
        customBurger.addChild(b); // 4 toppings free, extra +.75
        b = new Topping(b, "Carrot Strings", 0.00);
        customBurger.addChild(b); // 4 toppings free, extra +.75
        b = new Topping(b, "Coleslaw", 0.00);
        customBurger.addChild(b); // 4 toppings free, extra +.75
        b = new PremiumTopping(b, "Applewood Smoked Bacon", 1.50);
        customBurger.addChild(b); // premium topping +1.50
        b = new Sauce(b, "Appricot Sauce", 0.00);
        customBurger.addChild(b); // 1 sauce free, extra +.75
        customBurger.setPrice(b);
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/