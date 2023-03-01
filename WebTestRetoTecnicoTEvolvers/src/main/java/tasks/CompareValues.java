package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.Prices;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompareValues implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        int value1, value2,value3,value5;
        value1 = Prices.priceProductPhone().answeredBy(theActorInTheSpotlight());
        value2 = Prices.priceProductMonitor().answeredBy(theActorInTheSpotlight());
        value3 = Prices.priceProductLaptop().answeredBy(theActorInTheSpotlight());
        value5 = value1 + value2 + value3;
        System.out.println("********" + "\n"
                + "El valor del producto 1 es: " + value1 + "\n"
                + "El valor del producto 2 es: " + value2 + "\n"
                + "El valor del producto 3 es: " + value3 + "\n"
                + "El valor Total esperado de la compra es de: " + value5 + "\n" + "*******"
        );
        System.out.println(
                "El Valor Total de la compra es :"
                        + Prices.priceTotal().answeredBy(theActorInTheSpotlight())
        );
    }
    public static CompareValues validatePrice(){
        return instrumented(CompareValues.class);

    }

}

