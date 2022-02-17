package stepDefenations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Base.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Service extends MainClass {
	@When("User Navigate Mouse curser on  Dynamic Drop down   Service menu")
	public void user_navigate_mouse_curser_on_dynamic_drop_down_service_menu() {
		Actions action = new Actions(driver);
		WebElement service = driver.findElement(By.linkText("Service"));
		action.moveToElement(service).click().build().perform();
	}

	@Then("User should move mouse Up and down in two optoin")
	public void user_should_move_mouse_up_and_down_in_two_optoin() {
		Actions action = new Actions(driver);
		WebElement s = driver.findElement(By.linkText("IT Training"));
		WebElement ss = driver.findElement(By.linkText("Job Placement"));
		//WebElement sss= driver.findElement(By.linkText(""));
		action.moveToElement(s).build().perform();
		action.moveToElement(ss).build().perform();
	
	}

	@When("User click  drop down Option link IT Training")
	public void user_click_drop_down_option_link_it_training() {
		Actions action = new Actions(driver);
		WebElement service = driver.findElement(By.linkText("Service"));
		action.moveToElement(service).build().perform();
		WebElement ITT = driver.findElement(By.linkText("IT Training"));
		action.moveToElement(ITT).click().build().perform();
	}

	@Then("User should see “IT Traning “  Text")
	public void user_should_see_it_traning_text() {
		
		  Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId] 
		  Iterator<String> it = windows.iterator();
		  it.next(); 
		  String childId = it.next();
		  driver.switchTo().window(childId);
		 WebElement aaa = driver.findElement(By.xpath("//h2[contains(text(),'IT Traning')]"));
		 String actualText = aaa.getText();
		
		 String Expectedtext =Aprop.getProperty("ExpectedTextIT");
		 Assert.assertEquals(actualText, Expectedtext);
	}

	@And("User should see Title Page “IT Certification and Training Programs in NYC|Transfotech Academy”")
	public void user_should_see_title_page_it_certification_and_training_programs_in_nyc_transfotech_academy() {
		String expectedPageTitle =Aprop.getProperty("ServiceTitlepageExpected");
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
		driver.navigate().back();
		}

	@When("User click  drop down Option link Job Placement")
	public void user_click_drop_down_option_link_job_placement() {
		Actions action = new Actions(driver);
		WebElement service = driver.findElement(By.linkText("Service"));
		action.moveToElement(service).build().perform();
		WebElement jp = driver.findElement(By.linkText("Job Placement"));
		action.moveToElement(jp).click().build().perform();
	}

	@Then("User should see “Job Placement Is Our Strength “  Text")
	public void user_should_see_job_placement_is_our_strength_text() {
		
		  Set<String> windows = driver.getWindowHandles(); // [parentid,childid,]
		  Iterator<String> it = windows.iterator(); it.next(); String childId =
		  it.next(); driver.switchTo().window(childId);
		 
		WebElement aaa = driver.findElement(By.xpath("//h2[normalize-space()='Job Placement']"));
		String actualText = aaa.getText();
		String Expectedtext =Aprop.getProperty("expectedjp");
		Assert.assertEquals(actualText, Expectedtext);
	}

	@And("User should see title Page “ Job Placement |Transfotech Academy”")
	public void user_should_see_title_page_job_placement_transfotech_academy() {
		String expectedPageTitle = Aprop.getProperty("expectedtitlepagJP");
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
		driver.navigate().back();
	}

}
