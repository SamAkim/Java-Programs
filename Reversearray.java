public class Reversearray {
    public static void main(String[] args) {
        int a[] = {1,2,4,3,5,6};
        int x =2;
        int n = a.length-1;
        int i=0,j=n;
        while (i<j)
        {
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        int s =0,e=x-1;
        while (s<e)
        {
            int temp = a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }


       //Left Rotation
        /*int s = 0,e =n-x;
        while(s<e)
        {
            int temp = a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
        int st = (n-x)+1;
        int en = n;
        while(st<en)
        {
            int temp = a[st];
            a[st]=a[en];
            a[en]=temp;
            st++;
            en--;
        }*/


        for (int f:a)
        {
            System.out.print(f+" ");
        }

    }
}
