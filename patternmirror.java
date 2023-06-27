import java.util.Scanner;

public class patternmirror {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while(i<n)
        {
            int space =n-1;
            while (space>i)
            {
                System.out.print(" ");
                space--;
            }
            int star =0;
            while (star<=i)
            {
                System.out.print("*");
                star++;
            }
            System.out.println();
            i++;
        }
    }
}
