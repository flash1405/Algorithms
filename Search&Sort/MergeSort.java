import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args){
        final long startTime = System.currentTimeMillis();
        int[] arr = {10, 7,7,6,5,1,2, 8, 9, 1, 5};
        arr = mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        final long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)+"ms");
    }
    public static int[] merge(int[] arr, int start, int mid, int end){
        int temp[] = new int[end - start + 1];
        int i = start, j = mid+1, k = 0;
        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k += 1; i += 1;
            }
            else {
                temp[k] = arr[j];
                k += 1; j += 1;
            }
        }
        while(i <= mid) {
            temp[k] = arr[i];
            k += 1; i += 1;
        }
        while(j <= end) {
            temp[k] = arr[j];
            k += 1; j += 1;
        }
        for(i = start; i <= end; i += 1) {
            arr[i] = temp[i - start];
        }
        return arr;
    }
    public static int[] mergeSort(int[] arr, int start, int end){
        if(start!=end){
            int mid = (start+end)/2;
            arr = mergeSort(arr, start, mid);
            arr = mergeSort(arr, mid+1, end);
            arr = merge(arr, start, mid, end);

        }
        return arr;
    }
}
    