import java.util.*;

public class Stack {
    public int stackNbr;
    private ArrayList<Crate> stack;

    public Stack(int stackNbr) {
        this.stackNbr = stackNbr;
        this.stack = new ArrayList<>;
    }

    public ArrayList<Crate> getStack() {
        return this.stack;
    }

    public char removeCrate() {
        // TODO
        return '0';
    }

    public char addCrate(char name) {
        // TODO
        return '0';
    }

    public class Crate {
        private char name;
    
        public Crate(char n) {
            this.name = n;
        }
    
    }
}