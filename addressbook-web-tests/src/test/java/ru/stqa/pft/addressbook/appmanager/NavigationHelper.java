package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Zakhidat on 27.02.2017.
 */
public class NavigationHelper1 extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    if (isElementPressent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPressent(By.name("new"))) {
      return;
    }
    click(By.linkText("groups"));

  }

  public void gotoContactPage() {
    if (isElementPressent(By.id("maintable"))) {
      return;
    }
    click(By.linkText("home"));
  }
}
