package com.sofkau.tasks.automationexcercise;

import com.github.javafaker.Faker;
import com.sofkau.ui.automationexcercise.ProcesoCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import static com.sofkau.tasks.automationexcercise.Refrescar.thePage;

public class RealizarCompra implements Task {

    private String cardname;
    private String cardnumber;
    private String cvc;
    private String expirationmonth;
    private String expirationyear;
    private String usuario;
    private String contrasenna;

    public RealizarCompra conElUsuario(String usuario){
        this.usuario=usuario;
        return this;
    }
    public RealizarCompra yConLaContrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }
    public RealizarCompra conCardname(String cardname) {
        this.cardname = cardname;
        return this;
    }

    public RealizarCompra conCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
        return this;
    }

    public RealizarCompra conCvc(String cvc) {
        this.cvc = cvc;
        return this;
    }

    public RealizarCompra conExpirationmonth(String expirationmonth) {
        this.expirationmonth = expirationmonth;
        return this;
    }

    public RealizarCompra conExpirationyear(String expirationyear) {
        this.expirationyear = expirationyear;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker();

        actor.attemptsTo(
                // Iniciar sesión
                // Agregar productos al carrito
                Click.on(ProcesoCompra.PRODUCTS),
                thePage(),
                Click.on(ProcesoCompra.WOMEN),
                Click.on(ProcesoCompra.DRESS),
                Click.on(ProcesoCompra.ADD_CART),
                Click.on(ProcesoCompra.CONTINUE_SHOP),
                Click.on(ProcesoCompra.MEN),
                Click.on(ProcesoCompra.T_SHIRTS),
                Click.on(ProcesoCompra.ADD_CART),
                Click.on(ProcesoCompra.CONTINUE_SHOP),
                Click.on(ProcesoCompra.KIDS),
                Click.on(ProcesoCompra.DRESSES),
                Click.on(ProcesoCompra.ADD_CART),
                Click.on(ProcesoCompra.VIEW_CART),
                Click.on(ProcesoCompra.CHECKOUT),
                Scroll.to(ProcesoCompra.PLACE_ORDER),
                Click.on(ProcesoCompra.PLACE_ORDER),
                Enter.theValue(faker.name().fullName()).into(ProcesoCompra.CARD_NAME),
                Enter.theValue(faker.finance().creditCard()).into(ProcesoCompra.CARD_NUMBER),
                Enter.theValue(faker.number().digits(3)).into(ProcesoCompra.CVC),
                Enter.theValue(String.valueOf(faker.number().numberBetween(1, 12))).into(ProcesoCompra.EXPIRATION_MONTH),
                Enter.theValue(String.valueOf(faker.number().numberBetween(2024, 2030))).into(ProcesoCompra.EXPIRATION_YEAR),
                Click.on(ProcesoCompra.PAY)
        );
    }
    public static RealizarCompra realizarCompra() {
        return new RealizarCompra();
    }
}
