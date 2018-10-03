public class Person {

    private String name;
    private Address address;
    private int age;

    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + "  Age: " + age + address;
    }
}
