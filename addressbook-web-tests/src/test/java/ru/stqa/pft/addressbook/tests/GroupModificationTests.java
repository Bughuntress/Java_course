package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by Zakhidat on 01.03.2017.
 */
public class GroupModificationTests extends TestBase {
  @Test
  public void testGroupModification(){
    int before = app.getGroupHelper().getGroupCount();
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("Сказочные герои", "name", null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupCreation(new GroupData("Сказочные герои", "name", "null"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();//кол-во групп после добавления
    Assert.assertEquals(after, before);
  }
}
