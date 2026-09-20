
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class Histogram{
    public static void main(String[] args) {
        String filePath = "C:/Users/jeanalvarado/Downloads/Data Structures/File1.docx";
        int[] bins = new int[10];
        
        try{
            File filename = new File(filePath);
            Scanner fileScanner = new Scanner(filename);
            System.out.println("TEST");
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] values = line.split("\\s+");
                for (String s : values) {
                    int value = Integer.parseInt(s);
                    
                    if (value >= 1 && value <= 100) {
                        int binIndex = (value - 1) / 10;
                        bins[binIndex]++;
                    }
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
            return;
        }
        catch(IOException e){
            System.out.println("Something went wrong while reading the file.");
            return;
        }

        System.out.println("Histogram of data:");
        for (int i = 0; i < bins.length; i++) {
            int lower = i * 10 + 1;
            int upper = (i + 1) * 10;
            System.out.printf("%2d - %3d | %s%n", lower, upper, "*".repeat(bins[i]));
        }
    }
}