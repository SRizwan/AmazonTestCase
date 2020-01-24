package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

    static String url="https://www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","BrowserDriver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        //Thread.sleep(5000);

        //driver.findElement(By.cssSelector("#twotabsearchrextbox")).sendKeys("mobile phone");
        //driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        //driver.close();








    }
}
