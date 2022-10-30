package HomeWork7.Task2;

public class CardBYN extends Cards implements Exchange {
    @Override
    public String getName() {
        return "Белорусская карточка";
    }

    @Override
    public void setAccount(double account) {
        super.setAccount(account);
    }

    public void transfer(double sum, String currency) {
        double balance = this.getAccount();
        if (balance >= sum) {
            switch (currency) {
                case "eur", "EUR" -> {
                    transferSum(sum);
                    System.out.println("Перечислено по курсу " +
                            (double) Math.round(sum / eurSell * 100) / 100 + " евро.");
                }
                case "usd", "USD" -> {
                    transferSum(sum);
                    System.out.println("Перечислено по курсу " +
                            (double) Math.round(sum / usdSell * 100) / 100 + " usd.");
                }
                default -> System.out.println("Нет такой валюты!");
            }
        } else {
            System.out.println("На счету " + this.getName() + " не достаточно средств");
        }
    }
}
