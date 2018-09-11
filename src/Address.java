public class Address {

    String street;
    String houseNum;

    public Address(String street, String houseNum) {
        this.street = street;
        this.houseNum = houseNum;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public String toString() {
        return "Address: " + street + " " + houseNum;
    }

}
