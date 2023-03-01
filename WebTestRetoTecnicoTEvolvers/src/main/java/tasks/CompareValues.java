package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import questions.Values;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompareValues implements Task {

    /*private int value1, value2,value3,value5;
    public CompareValues(){
        this.value1 = questions.CompareValues.value1().answeredBy(theActorInTheSpotlight());
        this.value2 = questions.CompareValues.value1().answeredBy(theActorInTheSpotlight());
        this.value3 = questions.CompareValues.value1().answeredBy(theActorInTheSpotlight());
        this.value5 = value1 + value2 + value3;

        System.out.println("********" + value5);
        System.out.println("El Valor total de la compra es de :" + questions.CompareValues.value4().answeredBy(theActorInTheSpotlight()));

    } */

    @Override
    public <T extends Actor> void performAs(T actor) {

        /*actor.attemptsTo(



                Int value1, value2,value3,value5;
        value1 = questions.CompareValues.value1().answeredBy(theActorInTheSpotlight());
        value2 = questions.CompareValues.value2().answeredBy(theActorInTheSpotlight());
        value3 = questions.CompareValues.value3().answeredBy(theActorInTheSpotlight());
        value5 = value1 + value2 + value3;
        System.out.println("********" + value5); */

        int value1, value2,value3,value5;
        value1 = Values.value1().answeredBy(theActorInTheSpotlight());
        value2 = Values.value2().answeredBy(theActorInTheSpotlight());
        value3 = Values.value3().answeredBy(theActorInTheSpotlight());
        value5 = value1 + value2 + value3;
        System.out.println("********" + "\n"
                + "El valor del producto 1 es: " + value1 + "\n"
                + "El valor del producto 2 es: " + value2 + "\n"
                + "El valor del producto 3 es: " + value3 + "\n"
                + "El valor Total esperado de la compra es de: " + value5 + "\n" + "*******"
        );
        System.out.println(
                "El Valor Total de la compra es :"
                        + Values.value4().answeredBy(theActorInTheSpotlight())
        );
    }
    public static CompareValues validatePrice(){
        return instrumented(CompareValues.class);

    }

}

