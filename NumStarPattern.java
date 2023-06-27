import java.util.Scanner;

public class NumStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while (i<=n)
        {
           /* int star=1;
            while (star<=i)
            {

            }*/
            int num =n;
            while (num>0)
            {
                if(num!=i){
                    System.out.print(num);

                }
                else {
                    System.out.print("*");
                }
                num--;

            }
            System.out.println();
            i++;
        }
    }
}
