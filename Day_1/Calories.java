import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calories {

    

    public static void main(String[] args) {

        String filename = "Calories.input";

        try (Scanner sc = new Scanner(new File(filename))) {

            int maxCalories = 0;
            int calorieCounter = 0;

            while (sc.hasNext()) {
                String line = sc.nextLine();
                
                if (line.isBlank()) {
                    if (calorieCounter > maxCalories) {
                        maxCalories = calorieCounter;
                    }
                    calorieCounter = 0;
                }
                else {
                    int c = Integer.parseInt(line);
                    calorieCounter += c;
                }

                
            }
        System.out.println(maxCalories);

        } catch (FileNotFoundException e) {
            System.err.println(filename + " does not exist!");
        }
    }

    
}