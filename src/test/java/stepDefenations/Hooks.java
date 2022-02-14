
  package stepDefenations;
  
  import Base.MainClass; import io.cucumber.java.After; 
  import io.cucumber.java.Before;
  
  public class Hooks extends MainClass{
  
  
  // Handle pre-requisite and post-requisite steps 
	  
  // Pre-requisite
  
  @Before //import from io.cucumber.java 
  public void loadBrowser() 
  {
       intialization(); }
  
  // Post-requisite
  
  @After public void closeBrowser() { 
	  tearDown();
	  } 
  }
 