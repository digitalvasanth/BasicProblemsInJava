/*
 Find the maximum element from the given array of integers.
 */
public class MaxInArray
{
    public static void main(String [] args)
    {
        int arr[]={-2, -19, 8, 15, 4};
        int n=arr.length;
        int max=Integer.MIN_VALUE;

        System.out.println(func(arr,n));
    }

    public static int func(int arr[],int n)
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}