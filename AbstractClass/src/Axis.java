public class Axis extends Banks{
    @Override
    double calculateInterest(double amount, int months) {
        return (5.03 * amount * months/100);
    }
}

