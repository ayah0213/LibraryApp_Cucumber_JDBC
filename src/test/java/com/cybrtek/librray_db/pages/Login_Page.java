package com.cybrtek.librray_db.pages;

import com.cybrtek.librray_db.utilities.ConfigurationReader;
import com.cybrtek.librray_db.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

public Login_Page(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(id = "inputEmail")
    public WebElement userInputName;


    @FindBy(id ="inputPassword")
    public WebElement passwordInput;


    @FindBy(xpath = "//button")
    public WebElement signUpBtn;


    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement dashboardTxt;

    @FindBy(id = "navbarDropdown")
    public WebElement logOutBtn;

    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement logoutClick;

    public void loginMethod(){
        userInputName.sendKeys(ConfigurationReader.getProperty("librarian1.username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("librarian1.password"));
        signUpBtn.click();
    }

    public void loginWithParam(String user, String psw) {

        userInputName.sendKeys(user);
        passwordInput.sendKeys(psw);
    }



}
