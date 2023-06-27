import java.util.Scanner;
public class Arrangearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int N = sc.nextInt();
            int ARR[] = new int[N];
            int j = 1;
            int k = 2;
            for (int i = 0; i < N / 2; i++) {
                ARR[i] = j;
                j += 2;
            }
            for (int i = N - 1; i > N / 2; i--) {
                ARR[i] = k;
                k += 2;
            }
            ARR[N / 2] = N;
            for (int i = 0; i < N; i++) {
                System.out.print(ARR[i] + " ");
            }
        }
    }
}
