package util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Util {
    private ArrayList<Double> resultOfCalculation;
    public void addResultCalc (Double doub) {
        resultOfCalculation.add(doub);
    }
}