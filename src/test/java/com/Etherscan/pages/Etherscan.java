package com.Etherscan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Etherscan extends BasePage {

    @FindBy(id = "txtSearchInput")
    public WebElement searchbox;

    @FindBy(xpath ="//button[@class='btn btn-primary']")
    public WebElement searchboxbutton;

    @FindBy(id = "ContentPlaceHolder1_txtUserName")
    public WebElement Username;

    @FindBy(id = "ContentPlaceHolder1_txtEmail")
    public WebElement EmailAddress;

    @FindBy(id = "ContentPlaceHolder1_txtPassword")
    public WebElement Password;

    @FindBy(id = "ContentPlaceHolder1_txtPassword2")
    public WebElement ConfirmPassword;

    @FindBy(xpath = "//*[text()='I agree to the ']")
    public WebElement checkbox;

    @FindBy(id = "ContentPlaceHolder1_btnRegister")
    public WebElement createAccount;

    @FindBy(xpath = "//*[text()='Error! Invalid captcha response. ']")
    public WebElement message;

}