/*
 Given a sorted array A, containing N integers. Calculate and print their Mean, Median and Mode.
 */
public class MeanModeMedian {
    
    public static void main(String [] args)
    {
        int arr[]={1 ,2 ,3 ,4 ,5 ,5 ,6 ,6};

        func(arr,arr.length);
    }
    public static void func(int arr[],int n)
    {
        //mean
        int sum=0;
        for(int i:arr)
        sum+=i;

        double mean=(double)sum/n;
        int mode=0;
        //mode
        int maxc=Integer.MIN_VALUE;
      
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                    c++;

                if(c>maxc){
                maxc=c;
                mode=arr[i];
                }
            }
        }

        //median
        double median=0;
        if(n%2==0)
        {
            median=(arr[n/2]+arr[n/2-1])/2.0;
        }
        else
            median=arr[n/2]/2.0;

        System.out.println(mean+" "+median+" "+mode);
    }
}
