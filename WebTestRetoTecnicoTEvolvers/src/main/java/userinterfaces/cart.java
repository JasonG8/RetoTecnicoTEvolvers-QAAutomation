package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class cart {
    public static final Target CART = Target.the("cart").
            locatedBy("//a[normalize-space()='Cart']");

    public static final By PRICE_PRODUCT1 = By.xpath("//td[normalize-space()='1100']");
    public static final By PRICE_PRODUCT2 = By.xpath("//td[normalize-space()='230']");
    public static final By PRICE_PRODUCT3 = By.xpath("//td[normalize-space()='790']");
    public static final By PRICE_TOTAL = By.xpath("//h3[normalize-space()='2120']");
}
