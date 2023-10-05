package stepdefination;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefination {

	WebDriver driver;
	@Given("launch the browser")
	public void launch_the_browser() {
	   ChromeOptions options=new ChromeOptions();
	   options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);   
	}

	@Given("trigger the url")
	public void trigger_the_url() {
	   driver.manage().window().maximize();
	   driver.get("https://demo.actitime.com/login.do");
	}
	
	@Given("enter the userName as {string} and password as {string}")
	 public void enter_the_user_name_as_and_password_as(String string, String string2) throws Throwable {
		 driver.findElement(By.id("username")).sendKeys(string);
		 Thread.sleep(500);
		 driver.findElement(By.name("pwd")).sendKeys(string2);
		 Thread.sleep(500);
	 }
	
	@Given("enter the userName and password")
	public void enter_the_user_name_and_password() throws InterruptedException {
		   driver.findElement(By.id("username")).sendKeys("admin");
		   Thread.sleep(500);
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   Thread.sleep(500);
	}
	
	@Given("enter the username and password")
	public void enter_the_username_and_password(DataTable data) throws Throwable {
		
		  List<List<String>> dataTable = data.asLists(String.class);
		  driver.findElement(By.id("username")).sendKeys(dataTable.get(1).get(0));
		  Thread.sleep(500);
		  driver.findElement(By.name("pwd")).sendKeys(dataTable.get(1).get(1));
		  Thread.sleep(500);

//		  List<Map<String, String>> dataMap = data.asMaps(String.class,String.class);
//		  driver.findElement(By.id("username")).sendKeys(dataMap.get(0).get("username"));
//		  Thread.sleep(500);
//		  driver.findElement(By.name("pwd")).sendKeys(dataMap.get(0).get("password"));
//		  Thread.sleep(500);
	}
	
	@Given("click on login button")
	public void click_on_login_button() throws Throwable {
		   driver.findElement(By.id("loginButton")).click();
		   Thread.sleep(5000);
	}

	@Then("home pahe should be displayed")
	public void home_pahe_should_be_displayed() throws Throwable {
	    assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
	    System.out.println("PASS: successfully login to application");
	    Thread.sleep(500);
	    driver.manage().window().minimize();
	    driver.quit();
	}
}
