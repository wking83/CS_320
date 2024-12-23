package ContactService;

public class Contact {
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
 // Constructor
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contactId == null || contactId.length() > 10) throw new IllegalArgumentException("Invalid Contact ID");//if contact id is greater than 10 throw away
        if (firstName == null || firstName.length() > 10) throw new IllegalArgumentException("Invalid First Name");//if first name is greater than 10 throw away
        if (lastName == null || lastName.length() > 10) throw new IllegalArgumentException("Invalid Last Name");//if last name is greater than 10 throw away
        if (phone == null || !phone.matches("\\d{10}")) throw new IllegalArgumentException("Invalid Phone Number");//If phone number is not equal to 10 throw away
        if (address == null || address.length() > 30) throw new IllegalArgumentException("Invalid Address");//if address is greater than 30 throw away

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }
 // Getters
    public String getContactId() { return contactId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
 // Setters
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) throw new IllegalArgumentException("Invalid First Name");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) throw new IllegalArgumentException("Invalid Last Name");
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}")) throw new IllegalArgumentException("Invalid Phone Number");
        this.phone = phone;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) throw new IllegalArgumentException("Invalid Address");
        this.address = address;
    }
}
