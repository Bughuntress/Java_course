package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Zakhidat on 26.02.2017.
 */
public class SessionHelper extends HelperBase{

  public SessionHelper(WebDriver wd) {

    super(wd);
  }
  public void login(String username, String password) {
    //Объектом могут пользоваться все, т.к в 1 методе с login
    wd.findElement(By.id("LoginForm")).click();
    type(By.name("user"), username);
    wd.findElement(By.id("LoginForm")).click();
    type(By.name("pass"),password);

    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }
}
