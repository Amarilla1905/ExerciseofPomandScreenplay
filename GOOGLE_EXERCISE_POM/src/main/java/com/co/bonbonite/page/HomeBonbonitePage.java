package com.co.bonbonite.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.bon-bonite.com/")
public class HomeBonbonitePage extends PageObject {

    By BTN_ACCOUNT = By.xpath("//div[@class='myaccount']//a");

    public By getBTN_ACCOUNT() {
        return BTN_ACCOUNT;
    }

}
