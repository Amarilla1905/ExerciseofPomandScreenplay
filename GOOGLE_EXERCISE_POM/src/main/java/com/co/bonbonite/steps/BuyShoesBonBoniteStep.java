package com.co.bonbonite.steps;

import com.co.bonbonite.page.BuyShoesBonBonitePage;
import com.co.bonbonite.page.HomeBonbonitePage;
import com.co.bonbonite.page.LoginBonBonitePage;
import net.thucydides.core.annotations.Step;

public class BuyShoesBonBoniteStep {
    HomeBonbonitePage homeBonbonitePage;
    LoginBonBonitePage loginBonBonitePage;
    BuyShoesBonBonitePage buyShoesBonBonitePage;

    @Step
    public void openPage(){
        buyShoesBonBonitePage.open();
    }

    @Step
    public void selectAProduct(){
        buyShoesBonBonitePage.getDriver().findElement()
    }


}
