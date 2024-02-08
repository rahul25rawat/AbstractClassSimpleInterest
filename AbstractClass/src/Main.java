import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the Bank Name: SBI/PNB/HDFC/Axis");

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        if (str.equals("SBI")) {
            System.out.println("Enter Amount");
            double amt = s.nextDouble();

            System.out.println("Enter Months");
            int m = s.nextInt();

            Banks sb = new SBI();
            sb.calculateInterest(amt, m);
            System.out.println("Simple Interest is: " + sb.calculateInterest(amt, m));
        }

        else if (str.equals("PNB")) {
            System.out.println("Enter Amount");
            double amt = s.nextDouble();

            System.out.println("Enter Months");
            int m = s.nextInt();

            Banks pb = new PNB();
            pb.calculateInterest(amt, m);
            System.out.println("Simple Interest is: " + pb.calculateInterest(amt, m));
        }

        else if (str.equals("HDFC")){
            System.out.println("Enter Amount");
        double amt = s.nextDouble();

        System.out.println("Enter Months");
        int m = s.nextInt();

        Banks hd = new HDFC();
        hd.calculateInterest(amt, m);
        System.out.println("Simple Interest is: " + hd.calculateInterest(amt, m));
        }

        else if(str.equals("Axis")){
            System.out.println("Enter Amount");
            double amt = s.nextDouble();

            System.out.println("Enter Months");
            int m = s.nextInt();

            Banks ax = new Axis();
            ax.calculateInterest(amt,m);
            System.out.println("Simple Interest is: " + ax.calculateInterest(amt, m));
        }

        else{
            System.out.println("Sorry, Invalid choice");
        }

    }
}