
import java.util.Scanner;
public class Simple_Interest_Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double principal, rate;
        int timesCompounded;
        int years;
        double amount;
        System.out.println("Enter the principal amount: ");
        principal=sc.nextDouble();
        System.out.println("Enter the rate (in %):");
        rate=sc.nextDouble()/100;
        System.out.println("Enter the times Compounded per year: ");
        timesCompounded=sc.nextInt();
        System.out.println("Enter the number of years: ");
        years=sc.nextInt();
        amount=principal*(Math.pow(1+rate/timesCompounded, timesCompounded*years));
        System.out.println("The amount after "+ years+" is: $"+amount);
        sc.close();
    }

}
