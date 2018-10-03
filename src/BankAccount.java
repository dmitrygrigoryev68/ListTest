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

    public void setIbanWithSrars() {
        this.iban = iban.substring(0, 5) + "************";
    }

    public String toString() {
        return "  IBAN: " + iban + "  " + person;
    }
}


