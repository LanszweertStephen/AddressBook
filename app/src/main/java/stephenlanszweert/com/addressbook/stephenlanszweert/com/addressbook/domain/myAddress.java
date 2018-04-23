package stephenlanszweert.com.addressbook.stephenlanszweert.com.addressbook.domain;

/**
 * Created by Stephen on 16/04/2018.
 */

public class myAddress {
    private String street,city,country;
    private int number;
    private int postalCode;

    public myAddress(String street, String city, String country, int number, int postalCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.number = number;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
