public class CalorieRanking {
    private int first;
    private int second;
    private int third;

    

    public int getSumOfTopThree() {
        return this.first + this.second + third;
    }

    public void compare(int elfsCalories) {
        if (elfsCalories > this.first) {
            this.third = this.second;
            this.second = this.first;
            this.first = elfsCalories;
        }
        else if (elfsCalories > this.second) {
            this.third = this.second;
            this.second = elfsCalories;
        }
        else if (elfsCalories > third) {
            this.third = elfsCalories;
        }
    }
} 
