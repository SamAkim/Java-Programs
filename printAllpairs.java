public class printAllpairs {
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6};
        printpairs(arr);
    }
    public static void printpairs(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.println(arr[i]+","+arr[j]);

            }
        }

    }
}
