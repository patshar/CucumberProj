package stepDefinition;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class stepdefinitionLogin {
	WebDriver driver;
	WebDriverWait wait;


	@SuppressWarnings("deprecation")
	@Given("^user is on gmail page$")
	public void user_is_on_login_page()  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratima Sharma\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();



		driver.get("https://www.google.com/");
		// click on One Way
		driver.manage().window().maximize();
	}

	@When ("^user sign in$")
	public void	user_sign_in() {


		driver.findElement(By.linkText("Gmail")).click();
		String title=driver.getTitle();
		

		Assert.assertEquals("Gmail - Email from Google", title);

	}

	//@When("^user enters user \"(.*)\" and pass \"(.*)\"$") 
	@SuppressWarnings("deprecation")
	@Then("^user enters username and password") 
	public void user_enters_user_and_pass(DataTable pswd) {
    	 wait = new WebDriverWait(driver,30);
	//	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")));

		driver.findElement(By.linkText("Sign in")).click();
		
		 //Get all window handles
	    Set<String> allHandles = driver.getWindowHandles();

	    //count the handles Here count is=2
	    System.out.println("Count of windows:"+allHandles.size());      

	    //Get current handle or default handle
	    String currentWindowHandle = allHandles.iterator().next();
	    System.out.println("currentWindow Handle"+currentWindowHandle);

	    //Remove first/default Handle
	   allHandles.remove(allHandles.iterator().next());

	    //get the last Window Handle
	   String lastHandle = allHandles.iterator().next();
	   System.out.println("last window handle"+lastHandle);

	    //switch to second/last window, because we know there are only two windows 1-parent window 2-other window(ad window)
	    driver.switchTo().window(lastHandle);
	    
		//wait = new WebDriverWait(driver,10);
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='idntifierId' and @name='identifier']"))).click();
		List<List<String>> da = pswd.raw();
		driver.findElement(By.xpath("//*[@id='identifierId' and @name='identifier']")).sendKeys(da.get(0).get(0));
		
		
		driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='VfPpkd-RLmnJb']")));
		
		driver.findElement(By.xpath("//*[@id='identifierId' and @name='identifier']")).sendKeys(da.get(0).get(1));
		
		System.out.println("password");
		
	}

	@Then("^clicks on login button$")
	public void clicks_on_login_button(){
		System.out.println("button click");
	}

	@Then("^user is navigated to gmail$")
	public void user_is_navigated_to_gmail() {
		System.out.println("gmail");
	}



}
