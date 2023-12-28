
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobject.LoginPage;
import com.util.BaseConfig;
import com.util.SeleniumHighlighter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDef {
	
	WebDriver driver;
	BaseConfig obj=new BaseConfig();
	LoginPage  pom=new LoginPage ();
    WebElement logout;

	@Given("open a browser")
	public void open_a_browser() {
		 driver=new ChromeDriver();
			driver.manage()	.window().maximize();

	    	}

	@Given("go to application URL")
	public void go_to_application_URL() throws Exception {
		driver.get(obj.getConfig("URL"));//go url
        driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();

	    
	}

	@When("put valid username")
	public void put_valid_username() throws Exception {
        SeleniumHighlighter.getColor(driver,driver.findElement(pom.user),"red");//highlight

        driver.findElement(pom.user).sendKeys(obj.getConfig("USERNAME"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@When("put valid password")
	public void put_valid_password() throws Exception {
        SeleniumHighlighter.getColor(driver,driver.findElement(pom.pass),"green");//highlight

        driver.findElement(pom.pass).sendKeys(obj.getConfig("PASSWORD"));
        Thread.sleep(2000);
        SeleniumHighlighter.getColor(driver, driver.findElement(pom.loginbtn),"black");//highlight
         driver.findElement(pom.loginbtn).click();
	}

	@Then("If it will pass log out btn found")
	public void if_it_will_pass_log_out_btn_found() throws Exception {
        driver.findElement(pom.logoutbtn);
        //boolean logoutFound=logout.isDisplayed();
		//System.out.println(logoutFound);
	
		//Thread.sleep(2000);//wait little 4sec
     	driver.close();

	}
	
	
	

}
