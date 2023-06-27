public class MoveAllzeros {
    public static void main(String[] args) {
        int arr[] = {0,0,2,1,0,3,5,0,7};
        int n = arr.length;
        int zero=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[zero];
                arr[zero]=temp;
                zero++;
            }
        }

        for (int i:arr)
        {
            System.out.print(i+" ");
        }


    }
}
