package HomeWork7.Task3;

public class HourlyPay extends Salary implements Rate {
    public static double hPay(double workHours) {
        return workHours * rate1hour;
    }

    @Override
    public String getNameSalary() {
        return "Почасовая оплата";
    }
}
