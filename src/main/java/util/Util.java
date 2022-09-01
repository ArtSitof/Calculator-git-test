package util;

import java.util.List;

public class Util {
    private List<Double> resultOfCalculation;

    public Util(List<Double> resultOfCalculation) {
        this.resultOfCalculation = resultOfCalculation;
    }

    // Этот метод сохраняет результаты вычислений калькулятора с List
    public void addResultCalc (Double doub) {
        resultOfCalculation.add(doub);
    }

    public List<Double> getResultOfCalculation() {
        return resultOfCalculation;
    }

    public void setResultOfCalculation(List<Double> resultOfCalculation) {
        this.resultOfCalculation = resultOfCalculation;
    }

    @Override
    public String toString() {
        return "Util{" +
                "resultOfCalculation=" + resultOfCalculation +
                '}';
    }
}
