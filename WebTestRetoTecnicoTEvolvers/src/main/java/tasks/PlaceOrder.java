package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import userinterfaces.Order;
import static utils.constantes.ConstantManage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PlaceOrder implements Task  {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(Order.PLACE_ORDER_BTN),
                SendKeys.of(NAME).into(Order.NAME),
                SendKeys.of(COUNTRY).into(Order.COUNTRY),
                SendKeys.of(CITY).into(Order.CITY),
                SendKeys.of(CARD).into(Order.CARD),
                SendKeys.of(MONTH).into(Order.MONTH),
                SendKeys.of(YEAR).into(Order.YEAR),
                Click.on(Order.PURCHASE_BTN)
        );

    }
    public static PlaceOrder completePurchase() {
        return instrumented(PlaceOrder.class);

    }



}
