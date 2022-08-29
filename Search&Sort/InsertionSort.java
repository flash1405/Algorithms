import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args){
        final long startTime = System.currentTimeMillis();
        int[] arr = {10, 7,7,6,5,1,2, 8, 9, 1, 5};
        arr = insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        final long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)+"ms");
    }
    public static int[] insertionSort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int newElement = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>newElement){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]=newElement;
        }
        return arr;
    }
}
