package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Laptop {
    public static final Target ADDLAPTOP = Target.the("laptop").
            locatedBy("//a[normalize-space()='Add to cart']");
    //ENTER
    public static final Target BACKHOME = Target.the("Back Home").
            locatedBy("//li[@class='nav-item active']//a[@class='nav-link']");
}
