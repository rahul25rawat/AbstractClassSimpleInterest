public class HDFC extends Banks{
    @Override
    double calculateInterest(double amount, int months) {
        return (4.58 * amount * months/100);
    }

}
