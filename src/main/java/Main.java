
import calculator.Calculator;
import exception.InvalidCharacterException;
import util.Util;


import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Util u = new Util(new ArrayList<>());

        try {
            u.addResultCalc(Calculator.makeACalculation());
        }
        catch (InvalidCharacterException e) {
            System.out.println(e.getMessage() + e.getOperation());
        }

        System.out.println(u.getResultOfCalculation());
    }
}
