public class CalorieRanking {
    private int first;
    private int second;
    private int third;

    public int getFirst() {
        return this.first;
    }

    public int getSecond() {
        return this.second;
    }

    public int getThird() {
        return this.third;
    }

    public CalorieRanking() {
        this.first = 0;
        this.second = 0;
        this.third = 0;
    }

    public int getSumOfTopThree() {
        return this.first + this.second + third;
    }

    public void insert(int elfsCalories) {
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
