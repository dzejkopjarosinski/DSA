/*
    This algorithm is used to perform search in matrices or 2D arrays.
    The most basic solution in writing 2 for loops (for rows and for columns)
    then it is possible to check if matrix[x][y] == target.

    The complexity of a brute force solution is nxm.
  
    The right approach is to minimize search spaces (if the matrix is sorted)
        if the element == target (Anwser found)
        if the element < target ()
        if the element > target ()
 */

 public class RowColMatrix{
    public static void main(String[] args){
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };

        System.out.println(Arrays.toString(search(arr, target:37)))
    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }

            if(matrix[r][c] < target){
                r ++;
            }else{
                c--;
            }
        }

        return new int[]{-1,-1};
    }
 }