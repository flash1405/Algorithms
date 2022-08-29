import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){
        final long startTime = System.currentTimeMillis();
        int[] arr = {10, 7,7,6,5,1,2, 8, 9, 1, 5};
        arr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        final long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)+"ms");
    }
    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) /* For descending order use < */
                {
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1] = temp;
                swapped = true;
                }
            }
            if(!swapped)
               break;
        } 
        return arr;
    }
}
