package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by Zakhidat on 28.02.2017.
 */
public class GroupModificationTests extends TestBase {
  @Test
  public void testGroupModification(){
    app.getGroupsHelper().returnToGroupPage();
    app.getGroupsHelper().selectGroup();
    app.getGroupsHelper().initGroupModification();
    app.getGroupsHelper().fillGroupForm(new GroupData("creationgroup", "test1", "test1"));
    app.getGroupsHelper().submitGroupModification();
    app.getGroupsHelper().returnToGroupPage();
  }
}
