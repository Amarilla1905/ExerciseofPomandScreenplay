package com.co.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MainPage {

    public static final Target LBL_NAME_PRODUCT = Target.the("save the label product ")
            .locatedBy("//*[text()='Sauce Labs Backpack']");
}

