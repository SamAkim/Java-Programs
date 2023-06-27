import java.util.Scanner;

public class Mirrornopattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while (i<n)
        {
            int space = n-1;
            while (space<i)
            {
                System.out.print(" ");
                space--;
            }
            int nos = 0;
            while (nos<=i)
            {
                System.out.println(nos+1);
                nos++;
            }
            System.out.print("");
            i++;

        }
    }
}
