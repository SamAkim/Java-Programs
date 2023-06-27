public class ReverseForLoop {
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5,6};
        int n = arr.length;
        int r=1;
        int j=4;
        n=(j-r)/2;
        for(int i=0;i<=n;i++)
        {
            int temp = arr[r];
            arr[r]=arr[j];
            arr[j]=temp;
            r++;
            j--;
        }
        for (int i:arr)
        {
            System.out.print(i);
        }
    }
}
