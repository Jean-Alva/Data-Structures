public class Two_D_ArrayOperation {

    public static int getTotal(int[][] num) {
        int total = 0;
        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num[i].length; j++){
                total += num[i][j];
            }
        }
        return total;
    }
    public static int getAverage(int[][] num) {
        int total = getTotal(num);
        return total / (num.length * num[0].length);
    }
    public static int getRowTotal(int[][] num, int row) {
        int rowTotal = 0;
        for (int i = 0; i < num[row].length; i++){
            rowTotal += num[row][i];
        }
        return rowTotal;
    }
    public static int getColumnTotal(int[][] num, int column) {
        int columnTotal = 0;
        for (int i = 0; i < num.length; i++){
            columnTotal += num[i][column];
        }
        return columnTotal;
    }
    public static int getHighestInArray(int[][] num) {
        int highest = num[0][0];
        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num[i].length; j++){
                if (num[i][j] > highest){
                    highest = num[i][j];
                }
            }
        }
        return highest;
    }
    public static int getLowestInArray(int[][] num) {
        int lowest = num[0][0];
        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num[i].length; j++){    
                if (num[i][j] < lowest){
                    lowest = num[i][j];
                }
            }
        }
        return lowest;
    }
    public static void main(String[] args) {
        int[][] num = {//0, 1, 2,   3, 4, 5,   6, 7, 8,
                        {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        
        int Total = getTotal(num);
        int Average = getAverage(num);
        int RowTotal = getRowTotal(num, 1);
        int ColumnTotal = getColumnTotal(num, 2);
        int HighestTotal = getHighestInArray(num);
        int LowestTotal = getLowestInArray(num);

        System.out.println("Total: " + Total);
        System.out.println("Average: " + Average);
        System.out.println("Row Total (row 1): " + RowTotal);
        System.out.println("Column Total (column 2): " + ColumnTotal);
        System.out.println("Highest in Array: " + HighestTotal);
        System.out.println("Lowest in Array: " + LowestTotal);
    }
}