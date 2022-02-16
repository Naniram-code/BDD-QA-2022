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

public class Courses extends MainClass{
	@When("User Move mouse curser to Courses Drop Down menu")
	public void user_move_mouse_curser_to_courses_drop_down_menu() {
		Actions action = new Actions(driver);
		WebElement service = driver.findElement(By.linkText("Courses"));
		action.moveToElement(service).build().perform();
	}

	@Then("User Should see  QA Engineering, Business Analysis and Master Ethical Hacking options")
	public void user_should_see_qa_engineering_business_analysis_and_master_ethical_hacking_options() {
		Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.linkText("Master Ethical Hacking"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("QA Engineering"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("Business Analyst"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/section[2]"))).build().perform();
	}

	@When("User click Courses  Menu")
	public void user_click_courses_menu() {
		
		Actions action = new Actions(driver);
		WebElement service = driver.findElement(By.linkText("Courses"));
		action.moveToElement(service);
		action.doubleClick();
		action.build().perform();
		}

	@Then("User Should  See Text  “Our courses”")
	public void user_should_see_text_our_courses() {
		WebElement aaaa = driver.findElement(By.xpath("(//h2[normalize-space()='Our Courses'])[1]"));
		String actualText =aaaa.getText();
		String expectedText=Aprop.getProperty("expectedTextOC");
		Assert.assertEquals(actualText,expectedText);
	}

	@And("User should See title Page “ Course |Transfotech Academy”")
	public void user_should_see_title_page_course_transfotech_academy() {
	    String actualtitlepage=driver.getTitle();
	    String expectedtitlepage=Aprop.getProperty("expectedtitlepageOC");
	    Assert.assertEquals(actualtitlepage,expectedtitlepage);
	    driver.navigate().back();
	}

	@When("User Click on QA Engineering option")
	public void user_click_on_qa_engineering_option() {
		Actions action = new Actions(driver);
		WebElement cc = driver.findElement(By.linkText("Courses"));
		action.moveToElement(cc).click().build().perform();
		WebElement QAE= driver.findElement(By.linkText("QA Engineering"));
		action.moveToElement(QAE);
		action.doubleClick().build().perform();
		}

	@Then("User should see “ Full stack QA Engineering Course “Text")
	public void user_should_see_full_stack_qa_engineering_course_text() {
		WebElement FS = driver.findElement(By.xpath("(//h2[@class='elementor-heading-title elementor-size-default'])[1]"));
		String actualTextQA =FS.getText();
		String expectedTextQA=Aprop.getProperty("QAEtext");
		Assert.assertEquals(actualTextQA,expectedTextQA); 
	}

	@And("User should see register form")
	public void user_should_see_register_form() {
		
		WebElement rg =driver.findElement(By.xpath("//button[@type='submit']"));
		String ActualregisterText=rg.getText();
		String  expecterdregisterText=Aprop.getProperty("Registertx");
		Assert.assertEquals(ActualregisterText,expecterdregisterText); 
		driver.navigate().back();
	}

	@When("User Click  Business Analyst option")
	    public void user_click_business_analyst_option() {
		Actions action = new Actions(driver);
		WebElement ccc = driver.findElement(By.linkText("Courses"));
		action.moveToElement(ccc).click().build().perform();
		WebElement BA= driver.findElement(By.linkText("Business Analyst"));
		action.moveToElement(BA);
		action.doubleClick().build().perform();
	}

	@Then("User should see “Business Analyst” Text")
	public void user_should_see_business_analyst_text() {
		WebElement BAT = driver.findElement(By.xpath("(//h2[@class='elementor-heading-title elementor-size-default'])[1]"));
		String actualTextBA =BAT.getText();
		String expectedTextBA=Aprop.getProperty("BAEtext");
		Assert.assertEquals(actualTextBA,expectedTextBA);
	       }

	@And("User should see title page “Business Analyst Certification Course and Training in Nyc-BA job Placement”")
	         public void user_should_see_title_page_business_analyst_certification_course_and_training_in_nyc_ba_job_placement() {
		     String actualtitlepageBA=driver.getTitle();
		     String expectedtitlepageBA=Aprop.getProperty("expectedtitlepageBA");
		     Assert.assertEquals(actualtitlepageBA,expectedtitlepageBA);
		     driver.navigate().back();
	            }

	@When("User Click  Master Ethical Hacking option")
	public void user_click_master_ethical_hacking_option() {
		Actions action = new Actions(driver);
		WebElement ME = driver.findElement(By.linkText("Courses"));
		action.moveToElement(ME).click().build().perform();
		WebElement EH= driver.findElement(By.linkText("Master Ethical Hacking"));
		action.moveToElement(EH);
		action.doubleClick().build().perform();
	}

	@Then("User should see “Master Ethical Hacking & Cyber Security” Text")
	public void user_should_see_master_ethical_hacking_cyber_security_text() {
		WebElement MEH = driver.findElement(By.xpath("(//h2[@class='elementor-heading-title elementor-size-default'])[1]"));
		String actualTextBA =MEH.getText();
		String expectedTextBA=Aprop.getProperty("ExpectedMEHText");
		Assert.assertEquals(actualTextBA,expectedTextBA);
	}

	@And("User should see title page “Master Ethical Hacking training Course in NYC -ECH” title page Academy")
	public void user_should_see_title_page_master_ethical_hacking_training_course_in_nyc_ech_title_page_academy() {
	     String actualtitlepageME=driver.getTitle();
	     String expectedtitlepageME=Aprop.getProperty("expectedtitlepageMEH");
	     Assert.assertEquals(actualtitlepageME,expectedtitlepageME);
	     driver.navigate().back();
	}

}
