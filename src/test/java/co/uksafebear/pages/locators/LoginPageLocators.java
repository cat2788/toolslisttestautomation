package co.uksafebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {

    private By usernameLocator = By.id("username");

    private By passwordLocator = By.id("password");

    private By loginLocator = By.id("enter");

    private By failedLoginMessage = By.xpath(".//p[@id=\"rejectLogin\"]/b");
}
