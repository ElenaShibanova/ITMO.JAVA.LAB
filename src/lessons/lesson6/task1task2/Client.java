package lessons.lesson6.task1task2;

public class Client extends Person{
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public String getBankName(){
        return bankName;
    }

    @Override
    public String getAllInfo() {
        return "Имя клиента: " + getFirstName() + "\nФамилия клиента: " + getLastName() + "\nНазвание банка: " + bankName;
    }
}
