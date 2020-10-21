//package stepDefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Function1TC1 {
//
//	
//	WebDriver driver;
//	
//
//	@Given("^Open chrome and start application(\\d+)$")
//	public void Open_chrome_and_start_application(int arg1) throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "D:\\Kuliah\\Semester 7\\PPMPL\\Week10\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.loker.id");
//	}
//	
//	@Then("^I click Masuk(\\d+)$")
//	public void I_click_Masuk(int arg1) throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"menu-item-1127389\"]/a")).click();
//				
//		Thread.sleep(2000);
//	}
//	
//	@When("^I enter email and password(\\d+)$")
//	public void I_enter_email_and_password(int arg1) throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"acf-field_574b31195165b\"]")).sendKeys("glorykarina01@gmail.com");
//	    driver.findElement(By.xpath("//*[@id=\"acf-field_574b311951bc8\"]")).sendKeys("dalamnamayesus01");
//	}
//	
//	@Then("^I click Login(\\d+)$")
//	public void I_click_Login(int arg1) throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"post\"]/div[4]/input")).click();  
//		
//		Thread.sleep(1000);
//		}
//	}
//
//
//
//
//	
//	