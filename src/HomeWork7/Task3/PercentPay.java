package HomeWork7.Task3;

public class PercentPay extends Salary implements Rate {
    public static double Pay(double workHours, double percent) {
        return workHours * percent1house * percent / 100;
    }

    @Override
    public String getNameSalary() {
        return "Процентная оплата";
    }
}
