package co.uksafebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class ToolsPageLocators {

    private By successfulLoginMessage = By.xpath(".//div[@class='container']/p/b)");

    // Locator for my Search field
    private By searchFieldLocator = By.xpath(".//input[@placeholder = 'Type the Name or Use of the tool']");

    // Locator for the Search button
    private By searchButtonLocator = By.xpath(".//button[@class = 'btn btn-info']");

    // Locator for the tool title
    private By searchToolLocator = By.id("TestCafe");


}
