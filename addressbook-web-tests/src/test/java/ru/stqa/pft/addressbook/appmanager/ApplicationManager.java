package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Zakhidat on 26.02.2017.
 */
public class ApplicationManager {
  FirefoxDriver wd;

  private GroupsHelper groupsHelper;
  private SessionHelper sessionHelper;



  public void init() {
    wd = new FirefoxDriver(); //Инициализируется объект
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/group.php");
    groupsHelper = new GroupsHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");//вызов созданного метода, тк. используется переменная wd
  }



  public void stop() {
    wd.quit();
  }

  public GroupsHelper getGroupsHelper() {
    return groupsHelper;
  }
}
