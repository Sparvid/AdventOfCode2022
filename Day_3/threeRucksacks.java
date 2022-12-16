public class threeRucksacks {
    Rucksack firstRucksack;
    Rucksack secondRucksack;
    Rucksack thirdRucksack;

    public threeRucksacks(Rucksack a, Rucksack b, Rucksack c) {
        this.firstRucksack = a;
        this.secondRucksack = b;
        this.thirdRucksack = c;
    }

    public char badgeItem() {
        return this.secondCommons(this.firstCommons());
    }

    public String firstCommons() {
        String items_1 = this.firstRucksack.getAllItems();
        String items_2 = this.secondRucksack.getAllItems();

        int nbrOfItems1 = items_1.length();
        int nbrOfItems2 = items_2.length();

        String commonItems = "";
        for (int i = 0; i < nbrOfItems1; i++) {
            for (int j = 0; j < nbrOfItems2; j++) {
                if (items_1.charAt(i) == items_2.charAt(j) && !commonItems.contains("" + items_1.charAt(i))) {
                    commonItems += items_1.charAt(i);
                } 
            }
        } 
        return commonItems;
    }

    public char secondCommons(String commons) {
        String items_3 = this.thirdRucksack.getAllItems();

        int nbrCommonItems = commons.length();
        int nbrOfItems3 = items_3.length();

        for (int i = 0; i < nbrCommonItems; i++) {
            for (int j = 0; j < nbrOfItems3; j++) {
                if (commons.charAt(i) == items_3.charAt(j)) {
                    return commons.charAt(i);
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
        Rucksack rucksack1 = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
        Rucksack rucksack2 = new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
        Rucksack rucksack3 = new Rucksack("PmmdzqPrVvPwwTWBwg");
        threeRucksacks rucksacks = new threeRucksacks(rucksack1, rucksack2, rucksack3);

        // System.out.println(rucksacks.firstCommons()); // works
        System.out.println(rucksacks.secondCommons(rucksacks.firstCommons()));

    } */
}
