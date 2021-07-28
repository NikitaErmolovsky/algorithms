import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args){
        int[] arr = {1,7,4,3,2,-6,1};
        myMergeSort(arr);
        for(int x: arr){
            System.out.print(x+" ");
        }
    } 
    
   static void  myMergeSort(int[] array){
        if(array.length == 0 | array.length == 1)
            return ;
        int[] lhs = Arrays.copyOfRange(array, 0, array.length/2);
        int[] rhs = Arrays.copyOfRange(array, array.length/2, array.length);
        myMergeSort(lhs);
        myMergeSort(rhs);
        merge(array,lhs,rhs);

    }
   static void merge(int[] res, int[] lhs, int[] rhs){
        int i = 0, j = 0, k = 0;
        while(i < lhs.length && j < rhs.length){
            if(lhs[i] < rhs[j]){
                res[k++] = lhs[i];
                i++;
            }
            else if (lhs[i] >= rhs[j]){
                res[k++] = rhs[j];
                j++;
            }
        }
        while(i < lhs.length){
            res[k++] = lhs[i++];
        }
        while(j < rhs.length){
            res[k++] = rhs[j++];
        }
       
    }

}
