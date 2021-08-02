import java.util.Arrays;


public class RSelect {
    public static void main(String[] args){
        int[] arr = {2148, 9058,7742,3153,6324, 609,7628,5469,7017,504};
        System.out.print(findOrderStatistic(arr,3));
    }
   public static int findOrderStatistic(int[] array, int k) {
        int left = 0, right = array.length;
        while (true) {
          int mid = partition(array, left, right);
      
          if (mid == k) {
            return array[mid];
          }
          else if (k < mid) {
            right = mid;
          }
          else {
            left = mid + 1;
          }
        }
       
      }
      public static int partition(int[] arr, int begin, int end){
        int pivot = arr[begin];
        int i = (begin+1);
    
        for (int j = begin+1; j < end; j++) {
            if (arr[j] <= pivot) {
                
    
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
                i++;
            }
        }
    
        int swapTemp = arr[i-1];
        arr[i-1] = arr[begin];
        arr[begin] = swapTemp;
    
        return i-1;
    }
}
