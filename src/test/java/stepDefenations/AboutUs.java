package stepDefenations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Base.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
public class AboutUs extends MainClass {

		@When("User click on Header menu About Us")
		public void user_click_on_header_menu_about_us() {
			Actions action = new Actions(driver);
			WebElement searchtextbar = driver.findElement(By.linkText("About Us"));
			action.moveToElement(searchtextbar).click().build().perform();
		}

		@Then("User Should Navigate  Page")
		public void user_should_navigate_page() {
		  System.out.println("Url of About Us page:"+ driver.getCurrentUrl());
		}

		@And("User should see About Us | Transfotech Academy” Title page")
		public void user_should_see_about_us_transfotech_academy_title_page() {
			 String TitlePageActual = driver.getTitle();
			 
			    String titlePageExpected= "About Us | Transfotech Academy";
			    Assert.assertEquals(TitlePageActual, titlePageExpected); 
		}

		@And("User should see “Our Trending Courses” Text")
		public void user_should_see_who_we_are_text() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
		   WebElement aaa= driver.findElement(By.xpath("//h2[contains(text(),'Our Trending Courses')]"));
			String actualText=aaa.getText();
			String Expectedtext =Aprop.getProperty("expectedOTC");
			Assert.assertEquals(actualText, Expectedtext); 
		}

		@And("User should see “About Us “Text")
		public void user_should_see_about_us_text() {
			WebElement AboutUstext = driver.findElement(By.xpath("//h2[contains(text(),'About Us')]"));
			String actualText= AboutUstext.getText();
			String Expectedtext =Aprop.getProperty("ExpectedText");
			Assert.assertEquals(actualText, Expectedtext); 
		}

	

}
		
	


