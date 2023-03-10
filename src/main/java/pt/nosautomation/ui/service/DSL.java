package pt.nosautomation.ui.service;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DSL {
    private final WebDriver driver;
    private final NgWebDriver ngDriver;
    Actions actions;


    public DSL(WebDriver driver) {
        this.driver = driver;
        this.ngDriver = null;
    }

    public DSL(WebDriver driver, NgWebDriver ngDriver) {
        this.driver = driver;
        this.ngDriver = ngDriver;
    }


    public WebElement getByIdWithSleep(String id) throws InterruptedException {
        for (int i = 0; i < 500; i++) {
            try {
                driver.findElement(By.id(id));
                break;
            } catch (Exception e) {
                Thread.sleep(500);
            }
        }
        return driver.findElement(By.id(id));
    }

    public WebElement getById(String id) {
        return driver.findElement(By.id(id));
    }

    public WebElement getByClass(String className) {
        return driver.findElement(By.className(className));
    }

    public WebElement getByName(String name) {
        return driver.findElement(By.name(name));
    }

    public WebElement getByXpathWithSleep(String xpath) throws InterruptedException {
        for (int i = 0; i < 500; i++) {
            try {
                driver.findElement(By.xpath(xpath));
                break;
            } catch (Exception e) {
                Thread.sleep(500);
            }
        }
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement getByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement getByTagName(String tagName) {
        return driver.findElement(By.tagName(tagName));
    }

    public WebElement getByIdAndTagName(String id, String tagName) {
        return driver.findElement(By.id(id)).findElement(By.tagName(tagName));
    }

    public WebElement getByClassAndId(String className, String id) {
        return driver.findElement(By.className(className)).findElement(By.id(id));
    }

    public WebElement getByIdAndClassName(String id, String className) {
        return driver.findElement(By.id(id)).findElement(By.className(className));
    }

    public WebElement getByCssContainText(String cssSelector, String text) {
        return driver.findElement(ByAngular.cssContainingText(cssSelector, text));
    }

    public WebElement getByCssSelector(String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector));
    }

    public List<WebElement> getListByXpath(String xpath) {
        return driver.findElements(By.xpath(xpath));
    }

    public List<WebElement> getListByClass(String className) {
        return driver.findElements(By.className(className));
    }

    public List<WebElement> getListByName(String name) {
        return driver.findElements(By.name(name));
    }

    public WebElement getByAngularModel(String model) {
        return driver.findElement(ByAngular.model(model));
    }

    public WebElement getButtonByText(String btnText) {
        return driver.findElement(ByAngular.buttonText(btnText));
    }

}