package co.uksafebear.pages;

import co.uksafebear.pages.locators.ToolsPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class ToolsPage {

    @NonNull
    WebDriver driver;

    ToolsPageLocators locators = new ToolsPageLocators();

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String checkForLoginSuccessfulMessage(){
        return driver.findElement(locators.getSuccessfulLoginMessage()).getText();
    }

    // Method to enter text into the Search field
    public void enterToolName(String toolName){
        driver.findElement(locators.getSearchFieldLocator()).sendKeys(toolName);
    }

    // Method for clicking on the Search button
    public void clickSearchButton(){
        driver.findElement(locators.getSearchButtonLocator()).click();
    }

    // Method for bringing back the text of the tool name
    public String checkForToolSearchResults(){
        return driver.findElement(locators.getSearchToolLocator()).getText();
    }


}
