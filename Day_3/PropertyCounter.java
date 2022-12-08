import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class PropertyCounter {

    

    public static void main(String[] args) {

        String filename = "rucksacks.input";

        try (Scanner sc = new Scanner(new File(filename))) {

            while (sc.hasNext()) {
                String character = sc.next(); // för en charactär
                String line = sc.nextLine(); // för en hel rad

                int c = Integer.parseInt(line); // parsa en int
                
            }
        // System.out.println(result);

        } catch (FileNotFoundException e) {
            System.err.println(filename + " does not exist!");
        }
    }

    
}