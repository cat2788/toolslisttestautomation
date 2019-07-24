package co.uksafebear.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private static final String URL = System.getProperty("url", "http://toolslist.safebear.co.uk:8080");
    private static final String BROWSER = System.getProperty("browser", "chrome");

    public static String getUrl(){
        return URL;
    }

    public static WebDriver getDriver(){
        ChromeOptions chromeOptions;

        switch (BROWSER.toUpperCase()){

            case ("CHROME_HEADLESS"):
                System.out.println("Executing on CHROME HEADLESS");

                chromeOptions = new ChromeOptions();

                //set chrome to run headlessly
                chromeOptions.addArguments("headless");

                //make sure the window is large and maximised so nothing dissapears off screen
                //(even in headless mode!)
                chromeOptions.addArguments("window-size=1920,1080");
                chromeOptions.addArguments("start-maximised");

                //set up our chrome driver
                WebDriverManager.chromedriver().setup();

                //return the chrome driver with the chromeOptions set
                return new ChromeDriver(chromeOptions);

            case "CHROME":
                //Tell the user which browser we're our running tests on
                System.out.println("Executing on CHROME");

                //Use 'WebDriverManager' to set up our chromedriver
                WebDriverManager.chromedriver().setup();

                //Return our driver
                return new ChromeDriver();

                default:
                    throw new IllegalArgumentException("The browser type is undefined");

            case "FIREFOX":
                //Tell the user which browser we're our running tests on
                System.out.println("Executing on FIREFOX");

                //Use 'WebDriverManager' to set up our chromedriver
                WebDriverManager.firefoxdriver().setup();

                //Return our driver
                return new FirefoxDriver();


        }
    }
}
