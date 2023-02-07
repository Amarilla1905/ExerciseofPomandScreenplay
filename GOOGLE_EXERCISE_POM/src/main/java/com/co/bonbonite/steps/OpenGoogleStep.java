package com.co.bonbonite.steps;

import com.co.bonbonite.page.OpenGooglePage;
import net.thucydides.core.annotations.Step;

public class OpenGoogleStep {

    OpenGooglePage openGooglePage;

    @Step
    public void openPage(){
       openGooglePage.open();
    }



}
