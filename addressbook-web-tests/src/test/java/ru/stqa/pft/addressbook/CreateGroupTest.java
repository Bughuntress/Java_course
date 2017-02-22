package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

//сначала создается объект класса
public class CreateGroupTest extends TestBase {

    @Test
     public void testCreateGroupTest() {

        initGroupCreation();
        fillGroupForm(new GroupData("creationgroup", "test1", "test1"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
