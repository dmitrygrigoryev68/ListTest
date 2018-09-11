import java.util.List;

public class Person {

    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void print(List<Person> arrList) {
        for (Person item : arrList) {
            System.out.println(item);
        }
    }

    public String toString() {
        return "Name: " + name + " Address: " + address.getStreet() + " " + address.getHouseNum();
    }

}
