import java.util.Arrays;
public class SortingOrders{
    public static int bubbleSort(int[] numbers){
        int n = numbers.length;
        boolean swapped;
        int exchangeCount = 0;
        
        for (int i = 0; i < n-1; i++){
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++){
                if (numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    exchangeCount++;
                    swapped = true;
                }
            }
            System.out.println("Bubble Sort - After pass " + (i + 1) + ": " + Arrays.toString(numbers));
            if (!swapped) break;
        }
        return exchangeCount;
    }
    public static int selectionSort(int[] numbers){
        int n = numbers.length;
        int exchangeCount = 0;
        
        for (int i = 0; i < n-1; i++){
            int minIdx = i;
            
            for (int j = i+1; j < n; j++){
                if (numbers[j] < numbers[minIdx]){
                    minIdx = j;
                }
            }
            if (minIdx != i){
                int temp = numbers[i];
                numbers[i] = numbers[minIdx];
                numbers[minIdx] = temp;
                exchangeCount++;
            }
            System.out.println("Selection Sort - After pass " + (i + 1) + ": " + Arrays.toString(numbers));
        }
        return exchangeCount;
    }
    public static void main(String[] args){
        int[] numbers1 = {60, 20, 80, 140, 180, 40, 120, 100};
        int[] numbers2 = {60, 20, 80, 140, 180, 40, 120, 100};

        int bubbleExchanges = bubbleSort(numbers1);
        int selectionExchanges = selectionSort(numbers2);

        System.out.println("Bubble Sort Exchanges: " + bubbleExchanges);
        System.out.println("Selection Sort Exchanges: " + selectionExchanges);
        System.out.println("Sorted Array: " + Arrays.toString(numbers1));
        System.out.println("Sorted Array: " + Arrays.toString(numbers2));
        
    }
}