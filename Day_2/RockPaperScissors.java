import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class RockPaperScissors {

    

    public static void main(String[] args) {
        String filename = "strategy.input";

        int scoreSum = 0;

        Shape playersShape = new Rock();
        Shape opponentsShape = new Rock();

        try (Scanner sc = new Scanner(new File(filename))) {

            while (sc.hasNext()) {
                String character = sc.next();
                String character2 = sc.next();

                opponentsShape = opponentsShape.getShape(character);
                playersShape = playersShape.shapeForWantedResult(opponentsShape, character2);
                

                scoreSum = scoreSum + playersShape.roundScore(playersShape, opponentsShape);
                
            }
        System.out.println(scoreSum);

        } catch (FileNotFoundException e) {
            System.err.println(filename + " does not exist!");
        }
    }

    
}

abstract class Shape {
    abstract public int play(Shape shape);
    abstract public int getScore();

    public int roundScore(Shape playersShape, Shape opponentsShape) {
        return playersShape.getScore() + playersShape.play(opponentsShape);
    }

    
    public Shape getShape(String code) {
        if (code.equals("A") || code.equals("X")) {
            return new Rock();
        }
        if (code.equals("B") || code.equals("Y")) {
            return new Paper();
        }
        if (code.equals("C") || code.equals("Z")) {
            return new Scissors();
        }
        assert(false);
        return null;
    }

    public Shape shapeForWantedResult(Shape opponentsShape, String code) {
        if (opponentsShape instanceof Rock) {
            if (code.equals("X")) {
                return new Scissors();
            }
            else if (code.equals("Y")) {
                return new Rock();
            }
            else return new Paper();
        }
        else if (opponentsShape instanceof Paper) {
            if (code.equals("X")) {
                return new Rock();
            }
            else if (code.equals("Y")) {
                return new Paper();
            }
            else return new Scissors();
        }
        else {
            if (code.equals("X")) {
                return new Paper();
            }
            else if (code.equals("Y")) {
                return new Scissors();
            }
            else return new Rock();
        }
    }
    
    
}

class Rock extends Shape {

    @Override
    public int getScore() {
        return 1;
    }

    @Override
    public int play(Shape shape) {
        if (shape instanceof Rock) {
            return 3;
        }
        else if (shape instanceof Paper) {
            return 0;
        }
        else {
            return 6;
        }
    }
}

class Paper extends Shape {

    @Override
    public int getScore() {
        return 2;
    }

    @Override
    public int play(Shape shape) {
        if (shape instanceof Rock) {
            return 6;
        }
        else if (shape instanceof Paper) {
            return 3;
        }
        else {
            return 0;
        }
    }
}

class Scissors extends Shape {

    @Override
    public int getScore() {
        return 3;
    }

    @Override
    public int play(Shape shape) {
        if (shape instanceof Rock) {
            return 0;
        }
        else if (shape instanceof Paper) {
            return 6;
        }
        else {
            return 3;
        }
    }
}



