import java.util.Arrays;
public class InsertionSort{

    static int insertionExchanges = 0;
    static int quickExchanges = 0;
    public static void main(String[] args){
        
        int[] numbers1 = { 14, 3, 19, 8, 1, 7, 12, 5, 9, 2, 16, 4, 11, 6, 10, 15, 13, 18, 17, 20};
        int[] numbers2 = Arrays.copyOf(numbers1, numbers1.length);

        insertionSort(numbers1);
        quickSort(numbers2,0, numbers2.length - 1);

        System.out.println("Insertion Sort Exchanges: " + insertionExchanges);
        System.out.println("Quick Sort Exchanges: " + quickExchanges);

        System.out.println("Sorted numbers using Insertion Sort:");
        for (int i : numbers1){
            System.out.println(i + "");
        }
        System.out.println("Sorted numbers using Quick Sort:");
        for (int i : numbers2){
            System.out.println(i + "");
        }
    }
    private static void insertionSort(int[]numbers){
        for (int i = 1; i < numbers.length; i++){
            int temp = numbers[i];
            int j = i - 1;
                
            while(j >= 0 && numbers[j] > temp){
                numbers[j + 1] = numbers[j];
                j--;
                insertionExchanges++;
            }
            numbers[j + 1] = temp;
        }
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