public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthPayment12 = service.calculate(1_000_000, 9.99, 12);
        System.out.println("Сумма кредита: 1 000 000 руб. на 1 год, процентная ставка: 9,99%, ежемесячный платёж: " + monthPayment12 + " руб.");

        int monthPayment24 = service.calculate(1_000_000, 9.99, 24);
        System.out.println("Сумма кредита: 1 000 000 руб. на 2 года, процентная ставка: 9,99%, ежемесячный платёж: " + monthPayment24 + " руб.");

        int monthPayment36 = service.calculate(1_000_000, 9.99, 36);
        System.out.println("Сумма кредита: 1 000 000 руб. на 3 года, процентная ставка: 9,99%, ежемесячный платёж: " + monthPayment36 + " руб.");
    }
}