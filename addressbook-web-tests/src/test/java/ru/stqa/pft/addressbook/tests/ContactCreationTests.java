package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests1 extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoContactPage();
    app.getContactHelper().createContact(new ContactData(null, "Джейсон", "Красавица", "Красавица и Чудовище", "Диснейлэнд", "1, Заколдованный Замок, Волшебный Лес", "+22222222", "22, Дом Отца, Маленькая деревушка", "Сказочные герои"));

  }


}
