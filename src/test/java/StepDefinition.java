import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



    public class StepDefinition {
        WebDriver driver = null;
        @Given("^I am on Facebook login page$")

        public void goToFacebook() {
            driver = new FirefoxDriver();
            driver.navigate().to("https://www.facebook.com/");
        }


        @When("^I enter username as \"([^\"]*)\"$")
        public void i_enter_username_as(String arg1) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
           // throw new PendingException();
        }

        @When("^I enter password as \"([^\"]*)\"$")
        public void i_enter_password_as(String arg1) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
           // throw new PendingException();
        }

        @Then("^Login should fail$")
        public void login_should_fail() throws Throwable {
            System.out.println("++++++++++");
            // Write code here that turns the phrase above into concrete actions
            //throw new PendingException();
        }

        @Then("^Relogin option should be available$")
        public void relogin_option_should_be_available() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            //throw new PendingException();
        }


        @When("^I enter username as \"(.*)\"$")
        public void enterUsername(String arg1) {
            driver.findElement(By.id("email")).sendKeys(arg1);
        }

        @When("^I enter password as \"(.*)\"$")
        public void enterPassword(String arg1) {
            driver.findElement(By.id("pass")).sendKeys(arg1);
            driver.findElement(By.id("u_0_v")).click();
        }

        @Then("^Login should fail$")
        public void checkFail() {
            if(driver.getCurrentUrl().equalsIgnoreCase(
                    "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
                System.out.println("Test1 Pass");
            } else {
                System.out.println("Test1 Failed");
            }
            driver.close();
        }

        @Then("^Relogin option should be available$")
        public void checkRelogin() {
            if(driver.getCurrentUrl().equalsIgnoreCase(
                    "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
                System.out.println("Test2 Pass");
            } else {
                System.out.println("Test2 Failed");
            }
            driver.close();
        }
    }

