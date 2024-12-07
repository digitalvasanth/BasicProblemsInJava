/*
 Print the array in reverse order.
 */
public class ReverseArray {
    public static void main(String [] args)
    {
        int arr[]={2 ,19, 8 ,15, 4};
        func(arr,arr.length);
    }

    public static void func(int arr[],int n)
    {
        for(int i=n-1;i>=0;i--)
        System.out.print(arr[i]+" ");
    }
}
