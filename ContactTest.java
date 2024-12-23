package ContactService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    @Test
    void testContactCreation() {
        Contact contact = new Contact("12345", "Carter", "Clerico", "1234567890", "123 Elm Street");
        assertEquals("12345", contact.getContactId());
        assertEquals("Carter", contact.getFirstName());
        assertEquals("Clerico", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Elm Street", contact.getAddress());
    }

    @Test
    void testInvalidContactCreation() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Carter", "Clerico", "1234567890", "123 Elm Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "Carter", "Clerico", "1234567890", "123 Elm Street"));
    }
}
