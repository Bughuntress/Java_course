package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import ru.stqa.pft.addressbook.tests.SessionHelper;

/**
 * Created by Zakhidat on 27.02.2017.
 */
public class ApplicationManager1 {
  WebDriver wd;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private ContactHelper contactHelper;
  private GroupHelper groupHelper;
  private String browser;

  public ApplicationManager1(String browser) {
    this.browser = browser;
  }


  public void init() {
    if (browser == BrowserType.FIREFOX){
      wd = new FirefoxDriver();
    }
    else if (browser == BrowserType.CHROME){
      wd = new ChromeDriver();
    }else if (browser == BrowserType.IE){
      wd = new InternetExplorerDriver();
    }
    wd = new FirefoxDriver();
    // wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    contactHelper = new ContactHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }


  public void stop() {
    wd.quit();
  }


  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
