package ua.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.goTo().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surname", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
        int after = app.group().getGroupCount();
    }

}
