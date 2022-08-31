
import calculator.Calculator;
import util.Util;


import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Util u = new Util(new ArrayList<>());

        u.addResultCalc(Calculator.makeACalculation());
        u.addResultCalc(Calculator.makeACalculation());

        System.out.println(u.getResultOfCalculation());
    }
}
