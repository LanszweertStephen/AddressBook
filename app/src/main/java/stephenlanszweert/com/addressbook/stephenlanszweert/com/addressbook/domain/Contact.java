package stephenlanszweert.com.addressbook.stephenlanszweert.com.addressbook.domain;


/**
 * Created by Stephen on 16/04/2018.
 */

public class Contact {
    private String lastName,firstName;
    private String number;
    private String email;
    private myAddress address;

    public Contact(String lastName, String firstName, String number, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.number = number;
        this.email = email;
    }

    public Contact(String lastName, String firstName, String number, String email, myAddress address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.number = number;
        this.email = email;
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public myAddress getAddress() {
        return address;
    }

    public void setAddress(myAddress address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return this.lastName + " " + this.firstName;
    }

}
