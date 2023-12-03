
class Main {
    public static void main(String[] args) {
      System.out.println("Quicksort is an algorithm used for sorting in nlog(n) time");
      int arr[] = { 10, 7, 8, 9, 1, 5 };
      int n = arr.length;
      quickSort(arr, 0, n - 1);
      printArr(arr);
    }
  
    private static void quickSort(int[] arr, int start, int end) {
      if (start < end) {
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
      }
    }
  
    static int partition(int[] arr, int start, int end) {
      int pivot = arr[end];
      int i = start - 1;
  
      for (int j = start; j <= end - 1; j++) {
        if (arr[j] < pivot) {
          i++;
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      i++;
      int temp = arr[i];
      arr[i] = arr[end];
      arr[end] = temp;
  
      return i;
    }
  
    static void printArr(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
  
    }
  }