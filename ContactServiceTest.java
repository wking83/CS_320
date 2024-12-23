package ContactService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {
    @Test
    void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Carter", "Clerico", "1234567890", "123 Elm Street");
        assertTrue(service.addContact(contact));
    }

    @Test
    void testUpdateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Carter", "Clerico", "1234567890", "123 Elm Street");
        service.addContact(contact);
        assertTrue(service.updateContact("12345", "Crystal", null, null, "456 Main Avenue"));
        assertEquals("Crystal", contact.getFirstName());
        assertEquals("456 Main Avenue", contact.getAddress());
    }
}
