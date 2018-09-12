import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListTest {

    public static void main(String[] args) {

        Address a1 = new Address("Lenin", "101");
        Address a2 = new Address("Libknecht", "95");
        Address a3 = new Address("Marx", "16");
        Address a4 = new Address("Engels", "34");
        Address a5 = new Address("Luxemburg", "210");
        Address a6 = new Address("Zetkin", "322");

        Person p1 = new Person("Ivan Draga", a1);
        Person p2 = new Person("Stepan Praga", a2);
        Person p3 = new Person("Oleg Braga", a3);
        Person p4 = new Person("Bogdan Wlaga", a4);
        Person p5 = new Person("Roman Schpaga", a5);
        Person p6 = new Person("Feodor Saga", a6);
        Person p7 = new Person("Natalia Draga", a1);


        List<Person> arrayListPerson = new ArrayList<>();
        arrayListPerson.add(p1);
        arrayListPerson.add(p2);
        arrayListPerson.add(p3);
        arrayListPerson.add(p4);
        arrayListPerson.add(p5);
        arrayListPerson.add(p6);
        arrayListPerson.add(p7);

        List<Address> arrayListAddress = new ArrayList<>();

        Consumer<List<Person>> getAddresses = arrList -> {
            for (int i = 0; i < arrayListPerson.size(); i++) {
                arrayListAddress.add(arrayListPerson.get(i).getAddress());
            }
        };
        Consumer<List<Address>> myPrinter = arrList -> {
            for (Address item : arrList) {
                System.out.println(item);
            }
        };

        getAddresses.accept(arrayListPerson);

        myPrinter.accept(arrayListAddress);

    }

}