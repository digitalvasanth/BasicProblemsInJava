/*
 Print the count of the occurrences of positive integers, negative integers, and zeroes in the given array.
 */
public class NumberDistribution {
   
    public static void main(String [] args)
    {

        int arr[]={120 ,0 ,-9, 89, 68, -982, 91, -54 ,-12 ,-139};
        int n=10;

        func(arr,n);
    }

    public static void func(int arr[],int n)
    {
        int neg=0;
        int pos=0;
        int zer=0;
        for(int i:arr)
        {
            if(i<0)
                neg++;
            else if(i==0)
                zer++;
            else
                pos++;
        }
        System.out.println(zer+" "+pos+" "+neg);
    }
}
