import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        quickSort(array,0, array.length-1);
        for(int x: array)
            System.out.print(x+" ");
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
    
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    public static int partition(int[] arr, int begin, int end){
        choosePivot(arr, begin, end);// remove this line if you want to do non-rand pivot choose
        int pivot = arr[end];
        int i = (begin-1);
    
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
    
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
    
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
    
        return i+1;
    }
    public static void choosePivot(int[] arr, int low, int high){
        //random choose
        Random rand= new Random();
        int pivot = rand.nextInt(high-low)+low;
         
        int temp1=arr[pivot]; 
        arr[pivot]=arr[high];
        arr[high]=temp1;
    }
}
