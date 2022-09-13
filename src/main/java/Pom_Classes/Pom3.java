package Pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {

	// step1 - Declarataion
	
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;
	
	// step2 -  Initilization
	
	public Pom3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// step3 -  Utilization
	
	public String verifyuserID() {
		String actID=userID.getText();
		return actID;
	}
}
