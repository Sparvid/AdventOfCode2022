public class Rucksack {
    private String firstCompartment;
    private String secondCompartment;

    

    public Rucksack(String allItems) {
        this.firstCompartment = firstCompartment(allItems);
        this.secondCompartment = secondCompartment(allItems);
    }

    public String getAllItems() {
        return this.firstCompartment + this.secondCompartment;
    }

    public String firstCompartment(String allItems) {
        String firstHalf = "";
        for (int i = 0; i < allItems.length()/2; i++) {
            firstHalf += allItems.charAt(i);
        }
        return firstHalf;
    }

    public String secondCompartment(String allItems) {
        String secondHalf = "";
        for (int i = allItems.length()/2; i < allItems.length(); i++) {
            secondHalf += allItems.charAt(i);
        }
        return secondHalf;
    }

    public char misplacedItem() {
        int nbrOfItems = this.firstCompartment.length();
        for (int i = 0; i < nbrOfItems; i++) {
            char item = this.firstCompartment.charAt(i);
            for (int j = 0; j < nbrOfItems; j++) {
                if (item == this.secondCompartment.charAt(j)) {
                    return item;
                }
            }
        }
        return '0';
    }

    public int itemToPriority(char item) {
        Priorities map = new Priorities();
        return map.getPriority(item);
    }

    /* public static void main(String[] args) {
        Rucksack rucksack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp"); // 24
        System.out.println("First compartment contains: " + rucksack.firstCompartment);
        System.out.println("Second compartment contains: " + rucksack.secondCompartment);
        char misplacedItem = rucksack.misplacedItem();
        System.out.println("Misplaced item is: " + misplacedItem);
        System.out.println("Which has the priority: " + rucksack.itemToPriority(misplacedItem));

    } */
}
