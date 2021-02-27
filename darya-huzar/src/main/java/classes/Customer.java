package classes;

public class Customer {
    {
        idGenerator++;
    }

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private int creditCardId;
    private int bankNumberCard;

    Customer(String name, String surname, String patronymic, String address, int creditCardId, int bankNumberCard) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardId = creditCardId;
        this.bankNumberCard = bankNumberCard;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public int getCreditCardId() {
        return creditCardId;
    }

    public int getBankNumberCard() {
        return bankNumberCard;
    }

    public String toString() {
        return String.format("ID: %d\t name: %s\t surname: %s\t patronymic: %s \t address: %s\t credit card %d\t bank number %d",
                id, name, surname, patronymic, address, creditCardId, bankNumberCard);
    }
}
