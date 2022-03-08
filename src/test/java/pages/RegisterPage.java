package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);



    }
    @FindBy(xpath = "//a[@href='/login']")

   public WebElement signUpButonu;

    @FindBy(xpath ="(//input[@type='email'])[2]")
    public WebElement signupEmailAdressBox;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement nameBox;

    @FindBy(xpath = "//button[text()='Signup']")
    public  WebElement signupButtonText;

    @FindBy(xpath = "(//h2[@class='title text-center'])[1]")
    public WebElement enteraccountinformationText;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement mrbox;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement mrsBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(id="days")
    public WebElement dateOfBirthBox;

    @FindBy(id="month")
    public WebElement MonthBox;

    @FindBy(id="years")
    public WebElement YearBox;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newLesterbutton;

    @FindBy(id="optin")
    public WebElement patnersButton;
}
