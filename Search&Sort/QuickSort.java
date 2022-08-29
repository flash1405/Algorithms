import java.util.Arrays;
public class QuickSort {
    public QuickSort(){}
    public static void main(String[] args){
        final long startTime = System.currentTimeMillis();
        int[] arr = {10, 7,7,6,5,1,2, 8, 9, 1, 5};
        QuickSort obj = new QuickSort();
        arr = obj.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        final long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)+"ms");
    }
    public int[] swap(int[] arr, int firstPos, int secondPos){
        int temp = arr[firstPos];   
        arr[firstPos] = arr[secondPos];
        arr[secondPos] = temp;
        return arr;
    }
    public   int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int pivotIndex = start;
        for(int i = start; i<end;i++){
            if(arr[i]<=pivot)
                arr = swap(arr, i , pivotIndex++);
        }
        swap(arr, end, pivotIndex);
        return pivotIndex;
    }
    public int[] quickSort(int[] arr,int start, int end){
        if(start<end){
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex-1);
        quickSort(arr, pivotIndex+1, end);
        }
        return arr;
    }
}
