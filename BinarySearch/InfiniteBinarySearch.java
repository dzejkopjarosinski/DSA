public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {}; // Here is some array to check
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.plintln(ans(arr, target));
        }
        
        static int findingRange(int[] arr, int target){
            //find the range
            int start = 0;
            int end = 1;

            while(target > arr[end]){
                int newStart = end + 1;
                // double the box value
                end = end + (end - start + 1) * 2;
                start = newStart;

            }

        }




        static int binarySearch(int[] arr, int target, int start, int end){

            //Giving and index value for start and end
            int start = 0;
            int end = arr.length-1;

            while(start <= end){
                //find the middle element
                int mid = (start + end)/2; //might not work for large numbers
                mid = start + (end-start)/2; // this will work with large numbers 

                if (target < arr[mid]){
                    end = mid-1;
                } else if (target > arr[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }

            }

            return -1;
        }
    }
}