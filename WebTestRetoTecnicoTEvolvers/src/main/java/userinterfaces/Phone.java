package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Phone {

    public static final Target ADDPHONE = Target.the("phone").
            locatedBy("//a[normalize-space()='Add to cart']");

    public static final Target BACKHOME = Target.the("Back Home").
            locatedBy("//li[@class='nav-item active']//a[@class='nav-link']");

}
