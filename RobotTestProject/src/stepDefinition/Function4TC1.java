//package stepDefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Function4TC1 {
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
//	@When("^I enter valid username and password(\\d+)$")
//	public void I_enter_valid_username_and_password(int arg1) throws Throwable {
//		driver.findElement(By.id("login-username")).sendKeys("haris.situmeang.1412@gmail.com");
//	    driver.findElement(By.id("login-password")).sendKeys("Haris14desember");
//	}
//
//	@Then("^I click Log In(\\d+)$")
//	public void I_click_Log_In(int arg1) throws Throwable {
//		driver.findElement(By.id("login-button")).click();  
//		
//		Thread.sleep(2000);
//	}
//
//	@Then("^I click Edit Profile(\\d+)$")
//	public void I_click_Edit_Profile(int arg1) throws Throwable {
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/article[1]/div/a")).click();
//	
//	    Thread.sleep(2000);
//	}
//
//	@When("^I enter input form(\\d+)$")
//	public void I_enter_input_form(int arg1) throws Throwable {
//		driver.findElement(By.id("profile_email")).clear();
//	    driver.findElement(By.id("profile_email")).sendKeys("haris.situmeang.1412@mail.com");
//	    driver.findElement(By.id("profile_confirmPassword")).sendKeys("Haris14desember");
//	    
//	    Thread.sleep(1000);
//	}
//
//	@Then("^I click button(\\d+)$")
//	public void I_click_button(int arg1) throws Throwable {
//	    driver.findElement(By.id("profile_save_profile")).click();
//	    
//	    Thread.sleep(1000);
//	}
//	
//}
