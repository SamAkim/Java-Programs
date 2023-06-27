import java.util.Scanner;

public class
Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check =n;
        int count =n;
        int no_of_digits =0;
        int digit =0,flag=0;
        while(count!=0)
        {
            no_of_digits++;
            count = count/10;
        }
        //System.out.println(n);*/
        while(n!=0)
        {
            //(int) Math.pow((n%10),no_of_digits
            digit = digit +(int)Math.pow((n%10),no_of_digits);
            n=n/10;
        }
        //System.out.println(digit);
        if(check==digit)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
    }
}
