package userinterfaces;

import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;

import utils.drivers.MyChromeDriver;

public class phone {

    public static final Target ADDPHONE = Target.the("phone").
            locatedBy("//a[normalize-space()='Add to cart']");

    public static final Target BACKHOME = Target.the("Back Home").
            locatedBy("//li[@class='nav-item active']//a[@class='nav-link']");

}
