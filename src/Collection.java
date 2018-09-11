import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Collection {


    public static void main(String[] args) {

        Address a1 = new Address("Lenin", "101");
        Address a2 = new Address("Libknecht", "95");
        Address a3 = new Address("Marx", "16");
        Address a4 = new Address("Engels", "34");
        Address a5 = new Address("Luxemburg", "210");
        Address a6 = new Address("Zetkin", "322");

        Person p1 = new Person("Ivan Draga", a1);
        Person p2 = new Person("Stepan Schnaga", a2);
        Person p3 = new Person("Luca Braga", a3);
        Person p4 = new Person("Bogdan Beznadega", a4);
        Person p5 = new Person("Roman Kolimaga", a5);
        Person p6 = new Person("Feodor Bumaga", a6);
        Person p7 = new Person("Natalia Draga", a1);

      /*  List<Address> arrayListAddress  = new ArrayList<Address>(  );

        arrayListAddress.add(a1);
        arrayListAddress.add(a2);
        arrayListAddress.add(a3);
        arrayListAddress.add(a4);
        arrayListAddress.add(a5);
        arrayListAddress.add(a6);*/


        List<Person> arrayList = new ArrayList<Person>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);
        arrayList.add(p5);
        arrayList.add(p6);
        arrayList.add(p7);


        Consumer<List<Person>> myPrinter = arrList -> {
            for (Person item : arrList) {
                System.out.println(item);
            }
        };

        myPrinter.accept(arrayList);


    }

}


