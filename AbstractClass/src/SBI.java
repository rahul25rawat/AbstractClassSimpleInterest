public class SBI extends Banks{
    @Override
    double calculateInterest(double amount, int months) {
        return (4.67 * amount * months/100);
    }
}
