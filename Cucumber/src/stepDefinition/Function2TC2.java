//package stepDefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Function2TC2 {
//
//	
//	WebDriver driver;
//	
//	@Given("^Open chrome and start application(\\d+)$")
//	public void Open_chrome_and_start_application(int arg1) throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "D:\\Kuliah\\Semester 7\\PPMPL\\Week10\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.loker.id");
//	}
//	
//
//	@Then("^I click Masuk(\\d+)$")
//	public void I_click_Masuk(int arg1) throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"menu-item-1127389\"]/a")).click();
//		
//		Thread.sleep(2000);
//	}
//
//	@When("^I enter valid username and password(\\d+)$")
//	public void I_enter_valid_username_and_password(int arg1) throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"acf-field_574b31195165b\"]")).sendKeys("glorykarina01@gmail.com");
//	    driver.findElement(By.xpath("//*[@id=\"acf-field_574b311951bc8\"]")).sendKeys("dalamnamayesus01");
//	}
//	
//
//	@Then("^I click Log In(\\d+)$")
//	public void I_click_Log_In(int arg1) throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"post\"]/div[4]/input")).click();  
//		
//		Thread.sleep(1000);
//	}
//
//	@Then("^I click Edit Profile(\\d+)$")
//	public void I_click_Edit_Profile(int arg1) throws Throwable {
//		driver.findElement(By.cssSelector("#menu-item-1127382 > a")).click();
//		
//	}
//
//	@When("^I enter input form(\\d+)$")
//	public void I_enter_input_form(int arg1) throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"acf-field_57b05f53a7b55\"]")).clear();
//	    driver.findElement(By.xpath("//*[@id=\"acf-field_57b08c24c0474\"]")).sendKeys("081260366832");
//	    driver.findElement(By.xpath("//*[@id=\"acf-field_57b0d12eac615\"]")).sendKeys("glorykarina01@gmail.com");
//	    driver.findElement(By.xpath("//*[@id=\"acf-field_57b0d12eac669\"]")).sendKeys("dalamnamayesus01");
//	    driver.findElement(By.xpath("//*[@id=\"acf-field_57b0d12eac6bd\"]")).sendKeys("dalamnamayesus01");
//	}
//	
//
//	@Then("^I click button(\\d+)$")
//	public void I_click_button(int arg1) throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"post\"]/div[4]/input")).click();  
//			
//		Thread.sleep(1000);
//	}
//}
