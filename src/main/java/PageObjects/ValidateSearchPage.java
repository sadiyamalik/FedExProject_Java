package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ValidateSearchPage {
    WebDriver driver;
    By pagination =By.xpath("(//ul[@aria-label='Pagination'])[1] //li");
    By SearchBoxHomepage =By.id("fxg-search-text");
    By SearchIconHomepage =By.xpath("//span[@class='fxg-mouse']//img[@alt='Search']");
    By SearchText =By.xpath("//a[contains(@href, 'https://www.fedex.com/en-nl/shipping-channel/ship-to/japan.html')]");
    public ValidateSearchPage(WebDriver driver){

        this.driver = driver;

    }

    public void HomepageIconclick () {
        try {
            driver.findElement(SearchIconHomepage).click();


        } catch (Exception e) {
            System.out.println("Error occurred in HomepageIconclick method");
            e.printStackTrace();
        }
    }

    public void HomepageSearch (String txt) {
        try {
            driver.findElement(SearchBoxHomepage).sendKeys(txt);
            driver.findElement(SearchBoxHomepage).sendKeys(Keys.ENTER);


        } catch (Exception e) {
            System.out.println("Error occurred in HomepageSearch method");
            e.printStackTrace();
        }
    }

    public String getSearchText () {
            return driver.findElement(SearchText).getText();
    }

    public void SearchTextClick () {
        try {
            driver.findElement(SearchText).click();
        } catch (Exception e) {
            System.out.println("Error occurred in SearchTextClick method");
            e.printStackTrace();
        }
    }

    public void SelectPagination(String page){
        try {
            List<WebElement> PaginationList = driver.findElements(pagination);
            if (PaginationList.size() > 0) {
                System.out.println("Pagination Size is =========" + PaginationList.size());
                for (int i = 0; i <= PaginationList.size(); i++) {
                    String title = PaginationList.get(i).getAttribute("aria-label");
                    if (title.equals(page)) {
                        System.out.println("Page 4  is clicked =========" + page);
                        PaginationList.get(i).click();
                        break;
                    }
                }
            }
            } catch (Exception e) {
            System.out.println("Error occurred in SelectPagination method");
            e.printStackTrace();
        }

    }
}
