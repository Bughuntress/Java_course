package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Zakhidat on 22.02.2017.
 */
public class TestBase {
  FirefoxDriver wd;//переменная wd является атрибутом объекта типа CreateGroupTest

  public static boolean isAlertPresent(FirefoxDriver wd) {
      try {
          wd.switchTo().alert();
          return true;
      } catch (NoAlertPresentException e) {
          return false;
      }
  }

  @BeforeMethod
  //потом выполняет метод set up
  //внутри метода инициализируется атрибут объекта
  //и когда вызывается другой метод в том же самом объекте, он может этим атрибутом пользоваться
  public void setUp() throws Exception {
      wd = new FirefoxDriver(); //Инициализируется объект
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      wd.get("http://localhost/addressbook/group.php");
      login("admin", "secret");//вызов созданного метода, тк. используется переменная wd
  }

  private void login(String username, String password) {
      //Объектом могут пользоваться все, т.к в 1 методе с login
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).sendKeys("\\undefined");
      wd.findElement(By.id("LoginForm")).click();
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys(username);
      wd.findElement(By.id("LoginForm")).click();
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys(password);
      wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  protected void returnToGroupPage() {
      wd.findElement(By.linkText("group page")).click();
  }

  protected void submitGroupCreation() {
      wd.findElement(By.name("submit")).click();
  }

  protected void fillGroupForm(GroupData groupData) {
      wd.findElement(By.name("group_name")).click();
      wd.findElement(By.name("group_name")).clear();
      wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
      wd.findElement(By.name("group_header")).click();
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      wd.findElement(By.name("group_footer")).click();
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  protected void initGroupCreation() {
      wd.findElement(By.name("new")).click();
  }

  @AfterMethod
  public void tearDown() {
      wd.quit();
  }

  protected void deleteSelectedGroup() {
      wd.findElement(By.xpath("//div[@id='content']/form/input[5]")).click();
  }

  protected void selectGroup() {
      wd.findElement(By.name("selected[]")).click();
  }
}