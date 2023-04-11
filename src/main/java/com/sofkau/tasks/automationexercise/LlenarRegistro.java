package com.sofkau.tasks.automationexercise;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.sofkau.ui.automationexercise.PaginaFormularioRegistro.*;

public class LlenarRegistro implements Task {
    private String gender;
    private String password;
    private String day;
    private String month;
    private String year;
    private String firstName;
    private String lastName;
    private String company;
    private String address;
    private String address2;
    private String country;
    private String state;
    private String city;
    private String zipcode;
    private String mobileNumber;

    public LlenarRegistro conElGenero(String gender){
        this.gender=gender;
        return this;
    }
    public LlenarRegistro laContrasenna(String password){
        this.password=password;
        return this;
    }
    public LlenarRegistro elDia(String day){
        this.day=day;
        return this;
    }
    public LlenarRegistro elMonth(String month){
        this.month=month;
        return this;
    }
    public LlenarRegistro elYear(String year){
        this.year=year;
        return this;
    }
    public LlenarRegistro elFirstName(String firstName){
        this.firstName=firstName;
        return this;
    }
    public LlenarRegistro elLastName(String lastName){
        this.lastName=lastName;
        return this;
    }
    public LlenarRegistro laCompany(String company){
        this.company=company;
        return this;
    }
    public LlenarRegistro laAddress(String address){
        this.address=address;
        return this;
    }
    public LlenarRegistro laAddress2(String address2){
        this.address2=address2;
        return this;
    }
    public LlenarRegistro elPais(String pais){
        this.country=pais;
        return this;
    }
    public LlenarRegistro elEstado(String state){
        this.state=state;
        return this;
    }
    public LlenarRegistro laciudad(String city){
        this.city=city;
        return this;
    }
    public LlenarRegistro elZipCode(String code){
        this.zipcode=code;
        return this;
    }
    public LlenarRegistro yElNumeroCelular(String number){
        this.mobileNumber=number;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (gender) {
            case "Hombre":
                actor.attemptsTo(
                        Click.on(SELECTOR_MALE));
                break;
            case "Mujer":
                actor.attemptsTo(
                        Click.on(SELECTOR_FEMALE));
                break;
        }
        actor.attemptsTo(
                Enter.theValue(password).into(CAMPO_CREATE_PASSWORD),
                Scroll.to(SELECTOR_DAYS),
                SelectFromOptions.byValue(day).from(SELECTOR_DAYS),
                SelectFromOptions.byValue(month).from(SELECTOR_MONTHS),
                SelectFromOptions.byValue(year).from(SELECTOR_YEARS),
                Scroll.to(CAMPO_FIRST_NAME),
                Enter.theValue(firstName).into(CAMPO_FIRST_NAME),
                Enter.theValue(lastName).into(CAMPO_LAST_NAME),
                Enter.theValue(company).into(CAMPO_COMPANY),
                Enter.theValue(address).into(CAMPO_ADDRESS),
                Enter.theValue(address2).into(CAMPO_ADDRESS2),
                SelectFromOptions.byValue(country).from(CAMPO_COUNTRY),
                Scroll.to(CAMPO_STATE),
                Enter.theValue(state).into(CAMPO_STATE),
                Enter.theValue(city).into(CAMPO_CITY),
                Enter.theValue(zipcode).into(CAMPO_ZIPCODE),
                Enter.theValue(mobileNumber).into(CAMPO_MOBILE_NUMBER),
                Click.on(BOTON_CREAR_CUENTA)
        );
    }

    public static LlenarRegistro llenarRegistro(){
        return new LlenarRegistro();
    }
}
