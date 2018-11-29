package ua.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.addressbook.model.ContactData;
import ua.stqa.addressbook.tests.TestBase;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surname", "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();


    }

}
