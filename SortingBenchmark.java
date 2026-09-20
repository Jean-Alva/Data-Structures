import java.util.Arrays;
public class SortingBenchmark{
    public static int bubbleSort(int[] numbers){
        int n = numbers.length;
        boolean swapped;
        int exchangeCount = 0;
        
        for(int i = 0; i < n - 1; i++){
            swapped = false;
            for(int j=0; j < n - i - 1; j++){
                if(numbers[j] > numbers[j + 1]){
                    int temp = numbers[j];
                    numbers [j] = numbers[j + 1];
                    numbers [j + 1] = temp;
                    exchangeCount++;
                    swapped = true;
                }
            }

            if(!swapped)break;
        }
            return exchangeCount;
    }
    public static int selectionSort(int[] numbers){
        int n = numbers.length;
        int exchangeCount = 0;
            
        for (int i = 0; i < n - 1; i++){
            int minIndex = i;
                
            for (int j = i + 1; j < n; j++){
                if (numbers[j] < numbers[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
                exchangeCount++;
            }
        }
            return exchangeCount;
    }
    public static void main(String[] args){
        
        int[] numbers1 = { 14, 3, 19, 8, 1, 7, 12, 5, 9, 2, 16, 4, 11, 6, 10, 15, 13, 18, 17, 20};
        int[] numbers2 = Arrays.copyOf(numbers1, numbers1.length);
        
        int bubbleExchanges = bubbleSort(numbers1);
        int selectionExchanges = selectionSort(numbers2);
        
        System.out.println("Bubble Sort Exchanges: " + bubbleExchanges);
        System.out.println("Selection Sort Exchanges: " + selectionExchanges);
        System.out.println("Array 1: " + Arrays.toString(numbers1));
        System.out.println("Array 2: " + Arrays.toString(numbers2));
    }
}