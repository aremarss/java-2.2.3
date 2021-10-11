public class CreditPaymentService {
    public int calculate(int creditAmount, double interestRate, int monthNumber) {
        double monthInterestRate = interestRate / 100 / 12;
        int monthPayment = (int) (creditAmount * (monthInterestRate + monthInterestRate / (Math.pow(1 + monthInterestRate, monthNumber) - 1)));
        return monthPayment;
    }
}