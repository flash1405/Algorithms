public class BinarySearch
{
    public static int rank(int target, int[] arr)
    {
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            if(target<arr[mid])
                hi=mid-1;
            else if(target>arr[mid])
                lo=mid+1;
            else
                return mid;
        }
        return -1;
    }
    public static void main(String[] args)
    {  
        int[] arr = {1,2,3,4,5,6};
        System.out.println(rank(4,arr));
    }
}