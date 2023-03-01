package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import userinterfaces.Cart;


public class Prices {

    public static Question<Integer> priceProductLaptop() {
        return actor -> TextContent.of(Cart.PRICE_PRODUCT_LAPTOP).viewedBy(actor).asInteger();
    }
    public static Question<Integer> priceProductMonitor() {
        return actor -> TextContent.of(Cart.PRICE_PRODUCT_MONITOR).viewedBy(actor).asInteger();
    }
    public static Question<Integer> priceProductPhone() {
        return actor -> TextContent.of(Cart.PRICE_PRODUCT_PHONE).viewedBy(actor).asInteger();
    }
    public static Question<Integer> priceTotal() {
        return actor -> TextContent.of(Cart.PRICE_TOTAL).viewedBy(actor).asInteger();
    }

}
