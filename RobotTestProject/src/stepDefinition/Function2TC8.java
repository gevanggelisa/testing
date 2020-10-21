package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Function2TC8 {
	
	WebDriver driver;
	
	@Given("^Open chrome and start application(\\d+)$")
	public void Open_chrome_and_start_application(int arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Kuliah\\Semester 7\\PPMPL\\Week10\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spotify.com/id/");
	}

	@Then("^I click Daftar(\\d+)$")
	public void I_click_Daftar(int arg1) throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/ul/li[5]/a")).click();
		
		Thread.sleep(10000);
	}

	@When("^I enter input form(\\d+)$")
	public void I_enter_input_form(int arg1) throws Throwable {
	    driver.findElement(By.id("register-email")).sendKeys("harismeang@gmail.com");
	    driver.findElement(By.id("register-confirm-email")).sendKeys("harismeang@gmail.com");
	    driver.findElement(By.id("register-password")).sendKeys("HarisMeang");
	    driver.findElement(By.id("register-displayname")).sendKeys("HarisMeang");
	    driver.findElement(By.id("register-dob-day")).sendKeys("14");
	    
	    Select dropDownMonth = new Select (driver.findElement(By.id("register-dob-month")));
	    dropDownMonth.selectByVisibleText("Desember");
	    
	    driver.findElement(By.id("register-dob-year")).sendKeys("1998");
	    driver.findElement(By.id("register-male")).click();
	    
	    //captcha.sendKeys(test1);
	    JOptionPane.showInputDialog("Please enter the captcha manually: ");
	    Thread.sleep(5000);
	    driver.findElement(By.id("register-button-email-submit")).click();
	  		
	  		if (driver.getPageSource().contains("Your response did not match the words")) {
	  			System.out.println("Fail");
	  			for (int i = 0; i < 6; i++) {

	  				System.out.println("here" + i);
	  				Thread.sleep(10000);
	  				System.out.println("nowhere" + i);

	  				String test1 = JOptionPane.showInputDialog("Please enter the captcha manually: ");
	  				//captcha1.sendKeys(test1);
	  				Thread.sleep(5000);
	  				driver.findElement(By.id("register-button-email-submit")).click();
	  				Thread.sleep(10000);
	  			}
	  	}
	}
	
}
