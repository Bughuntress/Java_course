package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

//сначала создается объект класса
public class CreateGroupTest extends TestBase {

    @Test
     public void testCreateGroupTest() {
      app.getGroupsHelper().createGroup(new GroupData("creationgroup", "test1", "test1"));
       /* app.getGroupsHelper().initGroupCreation();
        app.getGroupsHelper().fillGroupForm(new GroupData("creationgroup", "test1", "test1"));
        app.getGroupsHelper().submitGroupCreation();
        app.getGroupsHelper().returnToGroupPage();*/
    }

}
