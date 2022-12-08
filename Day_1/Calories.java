import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calories {

    

    public static void main(String[] args) {

        String filename = "Calories.input";

        try (Scanner sc = new Scanner(new File(filename))) {

            int calorieCounter = 0;
            CalorieRanking top3 = new CalorieRanking();



            while (sc.hasNext()) {
                String line = sc.nextLine();
                
                if (line.isBlank()) {
                    if (calorieCounter > top3.getThird()) {
                        top3.insert(calorieCounter);
                    }
                    calorieCounter = 0;
                }
                else {
                    int c = Integer.parseInt(line);
                    calorieCounter += c;
                }

                
            }
        System.out.println("Most calories: " + top3.getFirst());
        System.out.println("Second most calories: " + top3.getSecond());
        System.out.println("Third most calories: " + top3.getThird());
        System.out.println("Sum of top 3 elves' calories: " + top3.getSumOfTopThree());

        } catch (FileNotFoundException e) {
            System.err.println(filename + " does not exist!");
        }
    }
    
}

