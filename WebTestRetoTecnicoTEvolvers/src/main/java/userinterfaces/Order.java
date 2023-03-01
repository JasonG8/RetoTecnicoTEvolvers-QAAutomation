package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class order {

    public static final Target PLACE_ORDER_BTN = Target.the("Place Order").
            locatedBy("//button[normalize-space()='Place Order']");
    public static final Target NAME = Target.the("name").
            locatedBy("//input[@id='name']");
    public static final Target COUNTRY = Target.the("country").
            locatedBy("//input[@id='country']");
    public static final Target CITY = Target.the("city").
            locatedBy("//input[@id='city']");
    public static final Target CARD = Target.the("card").
            locatedBy("//input[@id='card']");
    public static final Target MONTH = Target.the("month").
            locatedBy("//input[@id='month']");
    public static final Target YEAR = Target.the("year").
            locatedBy("//input[@id='year']");
    public static final Target PURCHASE_BTN = Target.the("purchase").
            locatedBy("//button[normalize-space()='Purchase']");
    public static final Target OK_BTN = Target.the("OK Button").
            locatedBy("//button[normalize-space()='OK']");

}
