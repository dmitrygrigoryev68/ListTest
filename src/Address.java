public class Address {

    String street;
    String houseNum;

    Address(String street, String houseNum) {
        this.street = street;
        this.houseNum = houseNum;
    }

    public String toString() {
        return "  Address: " + street + " str. " + houseNum + " ";
    }
}
