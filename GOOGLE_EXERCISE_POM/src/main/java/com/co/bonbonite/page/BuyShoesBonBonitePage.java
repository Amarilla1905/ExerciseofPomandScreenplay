package com.co.bonbonite.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.bon-bonite.com/")
public class BuyShoesBonBonitePage extends PageObject {

    By BTN_SHOES = By.xpath("//a[@href='https://www.bon-bonite.com/categoria-producto/zapatos-mujer/']");
    By BTN_SANDALS = By.xpath("//a[@href='https://www.bon-bonite.com/categoria-producto/zapatos-mujer/']");
    By SELECT_SIZE = By.xpath("//select[@id = 'pa_talla']");
    By TXT_SIZE = By.xpath("//option[@value = '38']");

    public By getBTN_SHOES() {
        return BTN_SHOES;
    }

    public By getBTN_SANDALS() {
        return BTN_SANDALS;
    }

    public By getSELECT_SIZE() {
        return SELECT_SIZE;
    }

    public By getTXT_SIZE() {
        return TXT_SIZE;
    }
}
