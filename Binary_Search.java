import java.util.Arrays;
public class Binary_Search{
    static int quickExchanges = 0;
    public static void main(String[] args){
        
        int[] numbers1 = { 14, 3, 19, 8, 1, 7, 12, 5, 9, 2, 16, 4, 11, 6, 10, 15, 13, 18, 17, 20};

        quickSort(numbers1,0, numbers1.length - 1);

        System.out.println("Sorted numbers using Quick Sort:");
        for (int i : numbers1){
            System.out.println(i + "");
        }
        
        System.out.println("Quick Sort Exchanges: " + quickExchanges);
        int target = 10;
        int index = binarySearch(numbers1, target);
        
        if (index != -1){
            System.out.println("Target " + target + " found at index: " + index);
        }else{
            System.out.println("Target " + target + " not found in the array.");
        }    
    }
    private static int binarySearch(int[] numbers, int target){
        int left = 0;
        int right = numbers.length - 1;
        int comparisons = 0;
        while(left <= right){
            comparisons++;
            int mid = left + (right - left)/2;
            if (numbers[mid] == target){
                System.out.println("Comparisons: " + comparisons);
                return mid;
            }
            if (numbers[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println("Comparisons: " + comparisons);
        return -1;
    }
    private static void quickSort(int[] numbers, int low, int high){
        if( low < high){
            int index = partition (numbers, low, high);
                
            quickSort(numbers, low, index - 1);
            quickSort(numbers, index + 1, high);
        }
    }
    private static int partition(int[] numbers, int low, int high){
        int pivot = numbers[low];
        int left = low + 1;
        int right = high;

        while(left <= right){
            while(left <= right && numbers[left] <= pivot){
                left++;
            }  
            while(left <= right && numbers[right] > pivot){
                right--;
            }
            if(left < right){
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;
                quickExchanges++;
            }
        }
        int temp = numbers[low];
        numbers[low] = numbers[right];
        numbers[right] = temp;
        quickExchanges++;
        
        return right;
    }
}