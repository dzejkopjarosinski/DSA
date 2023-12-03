// Ceiling is smallest element >= target


public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {-18, -12, -4, -0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = ceiling(arr, target);
        System.out.plintln(ans);
        

        static int ceiling(int[] arr, int target){

            if(target > arr[arr.lenght - 1]){
                return -1;
            }
            
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

            return start;
        }
    }
}