public class PNB extends Banks{
    @Override
    double calculateInterest(double amount, int months) {
        return (4.71 * amount * months/100);
    }

}
