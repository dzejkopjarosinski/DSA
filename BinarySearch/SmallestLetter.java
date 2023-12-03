public class BinarySearch{
    public static void main(String[] args){
        

        public char nextGreatestLetter(char[] letters, char target) {
            
            int start = 0;
            int end = arr.length-1;

            while(start <= end){
                //find the middle element
                int mid = (start + end)/2; //might not work for large numbers
                mid = start + (end-start)/2; // this will work with large numbers 

                if (target < arr[mid]){
                    end = mid-1;
                } else {
                    start = mid + 1;
                }

            }

            return letters[start % letters.lenght];
    }

}
}