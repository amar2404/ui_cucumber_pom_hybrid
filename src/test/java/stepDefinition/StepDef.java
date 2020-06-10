package stepDefinition;


import base.ConfigBrowser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SignupPage; 
import page.SearchPage;
public class StepDef extends SignupPage {
	
	
	/*@Given("^Consumer has the required details to create a User$")
		public static void test1() throws InterruptedException
		{
			driver = ConfigBrowser.initBrowser();
			base.UserActions.launchweb(driver,"https://www.walmart.ca/create-account" );
			SignupPage.createUser(driver, "test11111@gmail.com", "testUser", "testLastName", "test@11111", "2345452343");
			driver.close();
			driver.quit();
	}*/	
	
	@Given("^User is at homepage of walmart (.*) website$")
	public void launch(String url) throws Throwable {
		driver = ConfigBrowser.initBrowser();
		base.UserActions.launchweb(driver,url);
	}

	@When("^User search for \"([^\"]*)\"$")
	public void search(String search) throws Throwable {
	     SearchPage.search(driver, search);
		
	}

	@Then("^Apples should display on product list page\\(PLP\\) with various sorting options$")
	public void sortOption() throws Throwable {
		SearchPage.displayProductPrice(driver);
	  
	}

	@Then("^User sorts the list by price$")
	public void sortPrice() throws Throwable {
       SearchPage.sortPrice(driver);
	}

	@Then("^The list get sorted as per price$")
	public void validateSortPrice() throws Throwable {
		SearchPage.validatePriceSorting(driver);
		
		

	}
	
	}
