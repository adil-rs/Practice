package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RevesSignupSteps {
	
	WebDriver driver;
	
	
	@Given("Open Signup page with {string}")
	public void open_register_page_with_url(String url) {
		driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(url);
	}
	
	@When("User enters required entries that includes First Name, Last Name, Email addres, Phone Number, password, Confirm Password")
	public void register_details() {
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        fname.click();
        fname.sendKeys("Testing");

        WebElement lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lname.click();
        lname.sendKeys("Reves");

        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
        email.click();
        email.sendKeys("testingreves@yopmail.com");

        WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Phone number']"));
        phone.click();
        phone.sendKeys("+92 389 5111111");

        WebElement pas = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        pas.click();
        pas.sendKeys("abc12345");

        WebElement cpas = driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
        cpas.click();
        cpas.sendKeys("abc12345");
		
	}

	@When("User click on Check box having text I agree to all the Terms & Condition")
	public void user_click_on_check_box_having_text_i_agree_to_all_the_terms_condition() {
		
		WebElement checkBox = driver.findElement(By.id("customCheckc1"));
        if (!checkBox.isSelected()) {
            checkBox.click();
        }
	}

	@When("User click on Create Account button")
	public void user_click_on_create_account_button() {
		WebElement cele = driver.findElement(By.xpath("//button[normalize-space()='Create Account']"));
        cele.click();
	}


}
