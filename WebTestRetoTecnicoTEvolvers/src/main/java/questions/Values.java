package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import userinterfaces.cart;


public class Values {

    public static Question<Integer> value1() {
        return actor -> TextContent.of(cart.PRICE_PRODUCT1).viewedBy(actor).asInteger();
    }
    public static Question<Integer> value2() {
        return actor -> TextContent.of(cart.PRICE_PRODUCT2).viewedBy(actor).asInteger();
    }
    public static Question<Integer> value3() {
        return actor -> TextContent.of(cart.PRICE_PRODUCT3).viewedBy(actor).asInteger();
    }
    public static Question<Integer> value4() {
        return actor -> TextContent.of(cart.PRICE_TOTAL).viewedBy(actor).asInteger();
    }

}
