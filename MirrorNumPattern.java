import java.util.Scanner;

public class MirrorNumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while (i<=n)
        {
            int spaces = 1;
            while (spaces<=n-i)
            {
                System.out.print(" ");
                spaces++;
            }
            int nos = 1;
            while (nos<=i)
            {
                System.out.print(nos);
                nos++;
            }
            int dec = 1;
            while (dec<=(i-1))
            {
                System.out.print(i-dec);
                dec++;
            }
            System.out.println();
            i++;
        }
    }
}
