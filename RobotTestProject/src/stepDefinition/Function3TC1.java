//package stepDefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Function3TC1 {
//
//	WebDriver driver;
//	
//	@Given("^Open chrome and start application(\\d+)$")
//	public void Open_chrome_and_start_application(int arg1) throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "D:\\Kuliah\\Semester 7\\PPMPL\\Week10\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.spotify.com/id/");
//	}
//
//	@Then("^I click Masuk(\\d+)$")
//	public void I_click_Masuk(int arg1) throws Throwable {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/ul/li[6]/a")).click();
//		
//		Thread.sleep(2000);
//	}
//
//	@Then("^I click forgot your password(\\d+)$")
//	public void I_click_forgot_your_password(int arg1) throws Throwable {
//	    driver.findElement(By.id("reset-password-link")).click();
//	    
//	    Thread.sleep(2000);
//	}
//
//	@When("^I enter input form(\\d+)$")
//	public void I_enter_input_form(int arg1) throws Throwable {
//		driver.findElement(By.id("form_input")).sendKeys("haris.situmeang.1412@gmail.com");
//	}
//
//	@Then("^I click Kirim(\\d+)$")
//	public void I_click_Kirim(int arg1) throws Throwable {
//	    driver.findElement(By.id("form_send")).click();
//	}
//	
//
//}
