// If we don't know if we are working with ascending or descending order
// Order agnostic BinarySearch
//You need to check the first and the last element to find out

public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {-18, -12, -4, -0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.plintln(ans);


       

       

        static int orderAgnosticBS(int[] arr, int target){

            //Giving and index value for start and end
            int start = 0;
            int end = arr.length-1;


             //Find wether the array is sorted in ascending or descending order
             boolean isAsc = arr[start] < arr[end];


            

            while(start <= end){
                //find the middle element
                int mid = (start + end)/2; //might not work for large numbers
                mid = start + (end-start)/2; // this will work with large numbers 

                if(mid == target){
                return mid;}


                if (isAsc){
                    if (target < arr[mid]){
                        end = mid-1;
                    } else if (target > arr[mid]){
                        start = mid + 1;
                    }}

                else{
                    if (target > arr[mid]){
                        end = mid - 1;
                    }else if(target < arr[mid]){
                        start = mid + 1;
                    }
                }
                    
                    
                    
                    else{
                        return mid;
                    }

            }

            return -1;
        }
    }
}