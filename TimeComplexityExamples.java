public class TimeComplexityExamples{
    //1. O(n^3)
    public static void example1(int n){
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                for(int z = 0; z < n; z++)
                    System.out.print(i);
        System.out.println("\n--- Example 1 Done ---");
    }
    //2. O(n)
    public static void example2(int n){
        for(int i = n; i > 0; i--)
            System.out.print(i);
        System.out.println("\n--- Example 2 Done ---");
    }
    //3. O(n^3)
    public static void example3(int n){
        for(int i = 0; i < n; i--)
            for(int j = 0; j < i; j++)
                for(int z = 0; z < j; z++)
                    System.out.print(i);
        System.out.println("\n--- Example 3 Done ---");
    }
    //4. O(n^2)
    public static void example4(int n){
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                System.out.print(i);
        System.out.println("\n--- Example 4 Done ---");
    }
    //5. O(n^2)
    public static void example5(int n){
        for(int i = 0; i < n; i++)
            for(int j = 0; j < i; j++)
                System.out.print(i);
        System.out.println("\n--- Example 5 Done ---");
    }
    //6. 0(sqrt(n))
    public static void example6(int n){
        int p = 0;
        for(int i = 1; p <= n; i++)
            p = p + i;
        System.out.println("--- Example 6 Done ---"); 
    }
    //7. O(log n)
    public static void example7(int n){
        for(int i = 1; i < n; i = i * 4)
            System.out.print(i);
        System.out.println("\n--- Example 7 Done ---"); 
    }
    //8. O(log n)
    public static void example8(int n){
        for(int i = n; i >= 1; i = i / 4)
            System.out.print(i);
        System.out.println("\n--- Example 8 Done ---"); 
    }
    public static void main(String[] args){
        example1(5);
        example2(5);
        example3(5);
        example4(5);
        example5(5);
        example6(5);
        example7(5);
        example8(5);
    }
}