import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;



public class PropertyCounter {

    public static void main(String[] args) {

        String filename = "rucksacks.input";
        int prioritySum = 0;

        try (Scanner sc = new Scanner(new File(filename))) {

            while (sc.hasNext()) {
                String items1 = sc.nextLine(); // för en hel rad
                String items2 = sc.nextLine();
                String items3 = sc.nextLine();
                Rucksack rucksack1 = new Rucksack(items1);
                Rucksack rucksack2 = new Rucksack(items2);
                Rucksack rucksack3 = new Rucksack(items3);
                threeRucksacks rucksacks = new threeRucksacks(rucksack1, rucksack2, rucksack3);

                int priority = rucksacks.itemToPriority(rucksacks.badgeItem());
                prioritySum += priority;

                
            }
        System.out.println(prioritySum);

        } catch (FileNotFoundException e) {
            System.err.println(filename + " does not exist!");
        }
    }

}