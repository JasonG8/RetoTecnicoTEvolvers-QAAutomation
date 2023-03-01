package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import userinterfaces.order;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PlaceOrder implements Task  {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(order.PLACE_ORDER_BTN),
                SendKeys.of("Jason").into(order.NAME),
                SendKeys.of("Colombia").into(order.COUNTRY),
                SendKeys.of("Medellin").into(order.CITY),
                SendKeys.of("10098723").into(order.CARD),
                SendKeys.of("FEBRERO").into(order.MONTH),
                SendKeys.of("2023").into(order.YEAR),
                Click.on(order.PURCHASE_BTN)
        );

    }
    public static PlaceOrder completePurchase() {
        return instrumented(PlaceOrder.class);

    }



}
