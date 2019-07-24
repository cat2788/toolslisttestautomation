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
}
