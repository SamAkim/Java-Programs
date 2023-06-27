import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0)
                    System.out.print("* ");
                else if (j == n - 1)
                    System.out.print("*");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
    }
}

/*//User function Template for Java

public static void square(int s){
    int n=s;
    //Complete the code given below
    for( int i = 0 ; i < n ; i++ ){
       for( int j = 0 ; j < n ; j++ ){
           if( i == 0 || i == n-1 || j == 0 )
                System.out.print( "* " );
           else if( j == n-1 )
                System.out.print("*");
           else
                System.out.print("  ");
       }
       System.out.println();

    }
}*/