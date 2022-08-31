package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static double makeACalculation() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число");
        double numberOne = Double.parseDouble(reader.readLine());
        System.out.println("Введите второе число");
        double numberTwo = Double.parseDouble(reader.readLine());
        System.out.println("Введите какую операцию необходимо произвести.");
        System.out.println("""
                Доступные операции:\s
                '+' - сложение; \s
                '-' - разность;\s
                '*' - произведение;\s
                '/' - деление.""");
        char operation = reader.readLine().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = numberOne + numberTwo;
                break;
            case '-':
                result = numberOne - numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo;
                break;
            case '/':
                result = numberOne / numberTwo;
                break;
        }

        System.out.println("Результат вычисления:");
        System.out.println(numberOne + " " + operation + " " + numberTwo + " = " + String.format("%.2f", result));

        return result;
    }


}
