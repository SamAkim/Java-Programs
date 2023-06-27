import java.util.Scanner;

public class SortingAlgos {
   /* public static void swap(int a,int b)
    {
        int temp = a;
        a=b;
        b=temp;
    }*/
    public static void BubbleSort(int a[],int n)
    {
        for (int i=0;i<n-1;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    //swap(a[j],a[j+1]);
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void SelectionSort(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min =i;
            for(int j=i+1;j<n;j++)
            {
                if(a[min]>a[j])
                {
                    min = j;
                }
            }
            //swap(a[i],a[min]);
            int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }

    }

    public static void InsertionSort(int a[],int n) {
        for(int i=1;i<n;i++)
        {
            int key = a[i];
            int j=i-1;
            while (j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }

    }
    public static void PrintArray(int a[])
    {
        for(int i:a) // Enhanced for loops
        {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[] = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //BubbleSort(arr,n);

        System.out.println("Which of the sorting algorithm would you like to prefer\n 1.click a for bubble sort \n 2.click b for selection sort \n 3.click c for insertion sort");
        sc.nextLine();
        String str = sc.nextLine();
        char choice = str.charAt(0);
        switch (choice)
        {
            case 'a': BubbleSort(arr,n);
                break;
            case 'b': SelectionSort(arr,n);
                break;
            case 'c': InsertionSort(arr,n);
                break;
            default:
                System.out.println("invalid input");
        }

        PrintArray(arr);


    }
}
