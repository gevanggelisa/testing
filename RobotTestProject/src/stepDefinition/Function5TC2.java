//package stepDefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//public class Function5TC2 {
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
//	@Then("^I can login(\\d+)$")
//	public void I_can_login(int arg1) throws Throwable {
//		driver.findElement(By.id("login-button")).click();  
//		
//		Thread.sleep(1000);
//	}
//
//	@Then("^I click Home(\\d+)$")
//	public void I_click_Home(int arg1) throws Throwable {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/div[1]/a")).click();
//		
//		Thread.sleep(1000);
//	}
//
//	@Then("^I click Dengarkan di Spotify(\\d+)$")
//	public void I_click_Dengarkan_di_Spotify(int arg1) throws Throwable {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/div[1]/a")).click();
//		
//		Thread.sleep(3000);
//	}
//
//	@Then("^I click search(\\d+)$")
//	public void I_click_search(int arg1) throws Throwable {
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[1]/nav/ul/li[2]/div/a")).click();
//	    
//	    Thread.sleep(2000);
//	}
//
//	@When("^I enter input search form(\\d+)$")
//	public void I_enter_input_search_form(int arg1) throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div[2]/div[1]/div/div/header/div/div[3]/div/label/input")).sendKeys("fine todayyy");
//	}
//}
