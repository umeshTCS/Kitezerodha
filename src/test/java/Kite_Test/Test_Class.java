package Kite_Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_Class;
import Pom_Classes.Pom1;
import Pom_Classes.Pom2;
import Pom_Classes.Pom3;
import Utility.Utility_Class;

public class Test_Class extends Base_Class  {

	// Declar all useful members as global
	Pom1 login1;
	Pom2 login2;
	Pom3 home;
	
	@BeforeClass
	
	public void openBrowser() {
		initilizeBrowser();
		
	// all objects of pom class
		login1=new Pom1(driver);
		login2=new Pom2(driver);
		home=new Pom3(driver);
	}
	
	@BeforeMethod
	
	public void loginToApp() throws Throwable {
		
	// enter un
		login1.enterUN(Utility_Class.getTD(0, 0));
		//System.out.println(Utility_Class.getTD(0, 0));
		
	//enter pwd
		login1.enterPWD(Utility_Class.getTD(0, 1));
		//System.out.println(Utility_Class.getTD(0, 1));
		
	// click on login btn
		login1.clickLOGINBTN();
		
	// enter pin
		login2.enterPIN(Utility_Class.getTD(0, 2));
		//System.out.println(Utility_Class.getTD(0, 2));
		
	// click on continue btn
		login2.clickcntBtn();
		
	}	
		
	@Test
	public void verifyuserID() throws Throwable {
		Reporter.log("running verify userID",true);
		String actID=home.verifyuserID();
		String expID=Utility_Class.getTD(0, 0);
		Assert.assertEquals(expID, actID,"Both are different TC is failed");
		
	}
	
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout the application",true);
	}	
		
	@AfterClass
	public void closeBrowser() {
	    Reporter.log("close the application",true);
				
	}
}
