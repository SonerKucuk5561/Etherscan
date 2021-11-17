package com.Etherscan.pages;

import com.Etherscan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void waitElement(WebElement element){
        WebDriverWait wait =new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementIsClikable(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
