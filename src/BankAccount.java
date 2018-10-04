public class BankAccount {

    Person person;
    String iban;


    BankAccount(Person person, String iban) {
        this.iban = iban;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public String getIban() {return iban;}

    public String toString() {
        return "  IBAN: " + iban + "  " + person;
    }
}


