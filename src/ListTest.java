import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListTest {

    public static void main(String[] args) {

        Address a1 = new Address("Lenin", "101");
        Address a2 = new Address("Libknecht", "95");
        Address a3 = new Address("Marx", "16");
        Address a4 = new Address("Engels", "34");
        Address a5 = new Address("Luxemburg", "210");
        Address a6 = new Address("Zetkin", "322");

        Person p1 = new Person("Ivan Draga", 41, a1);
        Person p2 = new Person("Stepan Praga", 16, a2);
        Person p3 = new Person("Oleg Braga", 41, a3);
        Person p4 = new Person("Bogdan Wlaga", 17, a4);
        Person p5 = new Person("Roman Schpaga", 28, a5);
        Person p6 = new Person("Feodor Saga", 14, a6);
        Person p7 = new Person("Natalia Draga", 38, a1);

        BankAccount b1 = new BankAccount(p1, "DE5676609876556581");
        BankAccount b2 = new BankAccount(p1, "DE5676609876556582");
        BankAccount b3 = new BankAccount(p1, "DE5676609876556583");
        BankAccount b4 = new BankAccount(p2, "DE5676609876556584");
        BankAccount b5 = new BankAccount(p2, "DE5676609876556585");
        BankAccount b6 = new BankAccount(p3, "DE5676609876556586");
        BankAccount b7 = new BankAccount(p3, "DE5676609876556587");
        BankAccount b8 = new BankAccount(p4, "DE5676609876556588");
        BankAccount b9 = new BankAccount(p4, "DE5676609876556589");
        BankAccount b10 = new BankAccount(p4, "DE5676609876556590");
        BankAccount b11 = new BankAccount(p4, "DE5676609876556591");
        BankAccount b12 = new BankAccount(p5, "DE5676609876556592");

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);
        persons.add(p7);

        List<Address> addresses = persons
                .stream()
                .map(t -> t.getAddress())
                .collect(Collectors.toList());

        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Maria");
        names.add("Adolf");
        names.add("Josef");
        names.add("Ivan");
        names.add("Maria");
        names.add("Stefan");
        names.add("Adam");

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(b1);
        accounts.add(b2);
        accounts.add(b3);
        accounts.add(b4);
        accounts.add(b5);
        accounts.add(b6);
        accounts.add(b7);
        accounts.add(b8);
        accounts.add(b9);
        accounts.add(b10);
        accounts.add(b11);
        accounts.add(b12);


        myPrinter(persons);
        System.out.println("-----------Older than 17---------------\n");
        myPrinter(peopleOlderThan17(persons));
        System.out.println("-----------All names---------------\n");
        myPrinterString(names);
        System.out.println("-----------Distincted names---------------\n");
        myPrinterString(distinctedNames(names));
        System.out.println("-----------Map with age as a key---------------\n");
        myPrinterMapInt(groupByAge(41, persons));
        System.out.println("-----------Map bank account---------------\n");
        myPrinterMapPerson(groupByPerson(p4, accounts));
        System.out.println("-----------List bank account with stars---------\n");
        myPrinterAcc(returnWithStars(accounts));
        System.out.println("-----------Sum of ages---------\n");
        System.out.println(sumOfAgesPersonsOlderThan17(persons));
        System.out.println("-----------Legal people---------\n");
        System.out.println(legalAgeString(persons));
    }


    public static List<Person> peopleOlderThan17(List<Person> persons) {
        return persons
                .stream()
                .filter(p -> p.getAge() > 17)
                .collect(Collectors.toList());
    }

    public static List<String> distinctedNames(List<String> names) {
        return names
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static Map<Integer, List<Person>> groupByAge(int age, List<Person> persons) {
        return persons
                .stream().filter(a -> a.getAge() == age)
                .collect(Collectors.groupingBy(Person::getAge));
    }

    public static Map<Person, List<BankAccount>> groupByPerson(Person person, List<BankAccount> accounts) {
        return accounts
                .stream().filter(acc -> acc.getPerson().equals(person))
                .collect(Collectors.groupingBy(BankAccount::getPerson));
    }

    public static List<BankAccount> returnWithStars(List<BankAccount> accounts) {
        return accounts
                .stream()
                .peek(s -> s.setIbanWithStars())
                .collect(Collectors.toList());
    }

    public static Integer sumOfAgesPersonsOlderThan17(List<Person> users) {
        return users
                .stream()
                .filter(s -> s.getAge() > 17)
                .map(Person::getAge)
                .reduce((x, y) -> x + y).get();
    }

    public static String legalAgeString(List<Person> users) {
        return users
                .stream()
                .filter(s -> s.getAge() > 17)
                .map(Person::getName)
                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));
    }

    public static void myPrinter(List<Person> person) {
        person.stream()
                .forEach(s -> System.out.println(s));
    }

    public static void myPrinterString(List<String> names) {
        names.stream()
                .forEach(s -> System.out.println(s));
    }

    public static void myPrinterMapInt(Map<Integer, List<Person>> map) {
        System.out.println(map);
    }

    public static void myPrinterMapPerson(Map<Person, List<BankAccount>> map) {
        map.forEach((key, value) -> System.out.println(key + "\nAccounts:\n" +
                value
                        .stream()
                        .map(BankAccount::getIban)
                        .collect(Collectors.joining("\n"))));
    }

    public static void myPrinterAcc(List<BankAccount> accounts) {
        accounts.stream()
                .forEach(s -> System.out.println(s));
    }
}


