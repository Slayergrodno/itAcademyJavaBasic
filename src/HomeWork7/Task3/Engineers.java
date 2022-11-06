package HomeWork7.Task3;

public class Engineers extends Workers {
    double workHours;

    public Engineers(double workHours) {
        this.workHours = workHours;
    }

    @Override
    public String getName() {
        return "Инжинерный состав";
    }

    public double getSalary() {
        return HourlyPay.hPay(workHours);
    }

    @Override
    public String getNameSalary() {
        return "Почасовая оплата";
    }
}
