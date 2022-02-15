
  package RunnerPkg;
  
  
  import io.cucumber.junit.Cucumber; import org.junit.runner.RunWith;import io.cucumber.junit.CucumberOptions;
  
  // 1. define running with cucumber class -> @RunWith
  
  @RunWith(Cucumber.class) //import from junit
  
  // 2. Cucumber options to use multiple options -> @CucumberOptions
//@CucumberOptions(features="/Users/nanirambhujel/eclipse-workspace/QA_2022_BDD/src/test/java/Feature",
  
@CucumberOptions(features="/Users/nanirambhujel/eclipse-workspace/QA_2022_BDD/src/test/java/Feature/Courses.feature",  // Path of Feature file
 
 //@CucumberOptions(features="/Users/nanirambhujel/eclipse-workspace/QA_2022_BDD/src/test/java/Feature/ABOUTUS.feature",    //Path of AboutUS file            

 // @CucumberOptions(features="/Users/nanirambhujel/eclipse-workspace/QA_2022_BDD/src/test/java/Feature/Courses.feature",   //Path of Course File 
 
  //@CucumberOptions(features="/Users/nanirambhujel/eclipse-workspace/QA_2022_BDD/src/test/java/Feature/Service.feature",   //Path of service file
  glue="stepDefenations",monochrome=true,
                            plugin={"pretty","html:target/Report"})         //, tags="@Release1.0")
  
  // 1. Continue working in TDD POM framework - same application // 2. Build
  //BDD POM framework - same application
  
  public class Runner {
  
  }
  
 
