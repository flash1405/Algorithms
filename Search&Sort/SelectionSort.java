import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args){
        final long startTime = System.currentTimeMillis();
        int[] arr = {10, 7,7,6,5,1,2, 8, 9, 1, 5};
        arr = selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        final long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)+"ms");
    }
    public static int minIndex(int[] arr, int start, int end){
        int minIndex = start;
        for(int i = start+1; i<=end; i++){
            if(arr[i]<arr[minIndex])
                minIndex = i;
        }
        return minIndex;
    }
    public static int[] selectionSort(int[] arr){
        int minIndex = 0;
        for(int i = 0; i<arr.length; i++){
            minIndex = minIndex(arr,i,arr.length-1);
            if(i!=minIndex){
                int temp = arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex] = temp;
            }   
        }
        return arr;
    }
}
