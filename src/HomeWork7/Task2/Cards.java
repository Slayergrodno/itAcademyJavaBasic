package HomeWork7.Task2;

public abstract class Cards {
    private double balance;
    private double account;

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public abstract String getName();

    public void addSum(double sum) {
        balance = this.getAccount() + sum;
        System.out.println("На счет добавлено - " + sum + ". На счету - " + balance);
        setAccount(balance);
    }

    public void transferSum(double sumTransfer) {
        balance = this.getAccount();
        if (balance >= sumTransfer) {
            balance -= sumTransfer;
            System.out.println("Со счета списано - " + sumTransfer + ". На счету - " + balance);
            setAccount(balance);
        } else {
            System.out.println("На счету не достаточно средств");
        }
    }
}
