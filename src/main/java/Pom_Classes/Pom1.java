package Pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {

	// step 1-  Declaration
	
	@FindBy(xpath = "//input[@id='userid']")private WebElement UN ;
	@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement LOGINBTN;
	
	// step 2 -   Initialization
	
	public Pom1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	// step 3 -  Utilization
	
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	
	public void clickLOGINBTN() {
		LOGINBTN.click();
	}
}
