package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class monitor {
    public static final Target ADDMONITOR = Target.the("monitor").
            locatedBy("//a[normalize-space()='Add to cart']");
    public static final Target BACKHOME = Target.the("Back Home").
            locatedBy("//li[@class='nav-item active']//a[@class='nav-link']");
}
