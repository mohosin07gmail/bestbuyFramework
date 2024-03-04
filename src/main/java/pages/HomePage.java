package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 
	@FindBy(xpath = "//input[@id='gh-search-input']")
	WebElement searchField;
	
	public void clickSearchField() throws InterruptedException {
		searchField.click();
		Thread.sleep(3000);
	}
	
	

}
