public class Person {

    private String name;
    private Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String toString() {
        return "Name: " + name + " Address: " + address;
    }

}
