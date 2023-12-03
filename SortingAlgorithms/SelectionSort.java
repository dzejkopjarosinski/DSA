// Select maximum/minimum element and put it at the current index
// Complexity O(n^2)
// Performs well on small lists

public class SortingAlgo{

    public static void main(String[] args){
        int[] arr = {2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr){
        for (int i=0; i < arr.length; i++){
            // find the maximum item in the remaining array and swap with current index
            int last = arr.length - i - 1;
            int maxIndex = getMaxindex(arr, 0, last);
            swap(arr, maxIndex, last);

        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static void getMaxindex(int[] arr, int start, int end){
        int max = start;

        for (int i = start; i <= end, i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
    }


}