package HomeWork7.Task3;

public class HourlyMixPay extends Salary implements Rate {
    public static double hmPay(double workHours, double percent) {
        return workHours * rate1hour + workHours * rate1hour * percent / 100;
    }

    @Override
    public String getNameSalary() {
        return "Смешанное начисление зарплаты";
    }
}
