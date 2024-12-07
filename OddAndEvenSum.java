public class OddAndEvenSum {
   
    public static void main(String [] args)
    {
        int arr[]={4 ,6 ,9 ,2 ,5};
        
        func(arr,arr.length);
    }

    public static void func(int arr[],int n)
    {
        int odd=0;
        int even=0;

        for(int i:arr)
        {
            if(i%2!=0)
                odd+=i;
            else
                even+=i;
        }
        System.out.println(odd+" "+even);
    }
}
