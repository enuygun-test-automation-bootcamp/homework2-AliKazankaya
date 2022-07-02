import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class SearchBoxTest {

    public static void main (String [] args) {

//Instantiation of driver object. To launch Chrome browser

            System.setProperty("webdriver.chrome.driver","/C:\\Users\\alika\\IdeaProjects\\unitTest\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

//To open page

            driver.get("https://demoqa.com/webtables");

//isDisplayed() method returns boolean value either True or False

            boolean Display = driver.findElement(By.xpath("//*[@id='searchBox']")).isDisplayed();

        Assert.assertEquals("Search Box founded.", Display==true,Display==true);

//To print the value

            System.out.println("\n Element displayed is :"+Display);

// Or we can use Assert method for Unit Test

            Assert.assertEquals("Search Box founded.", Display==true,Display==true);

        }
    }

