package HomeWork7.Task2;

public class CardEUR extends Cards implements Exchange {

    @Override
    public String getName() {
        return "Валютная карточка EUR";
    }

    @Override
    public void setAccount(double account) {
        super.setAccount(account);
    }

    public void transfer(double sum, String currency) {
        double balance = this.getAccount();
        if (balance >= sum) {
            switch (currency) {
                case "usd", "USD" -> {
                    transferSum(sum);
                    System.out.println("Перечислено по курсу: " +
                            Math.round(sum * eurusdSell * 100) / 100 + " usd.");
                }
                case "byn", "BYN" -> {
                    transferSum(sum);
                    System.out.println("Перечислено по курсу: " +
                            Math.round(sum * eurBuy * 100) / 100 + " byn.");
                }
                default -> System.out.println("Нет такой валюты!");
            }
        } else {
            System.out.println("На счету " + this.getName() + " не достаточно средств");
        }
    }
}