package methods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

    private WebDriver driver;

    @Given("User is in the home page imalittletester")
    public void user_is_in_the_home_page_imalittletester() {
        System.out.println("Printing step 1");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http:/google.com");
        System.out.println("The webpage is opened");
    }

    @When("Clicks over The little tester comics button")
    public void clicks_over_the_little_tester_comics_button() {
        System.out.println("Printing step 2");
    }

    @Then("Redirects to comics page")
    public void redirects_to_comics_page() {
        System.out.println("Printing step 3");
    }

}
