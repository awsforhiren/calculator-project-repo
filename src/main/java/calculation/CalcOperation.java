package main.java.calculation;

@FunctionalInterface
public interface CalcOperation {
    double operation(double number, double number2);
    static double addOperation(double operand1, double operand2) {
        CalcOperation calcOperation = (number1, number2) -> number1 + number2;
        double result = calcOperation.operation(operand1, operand2);
        return result;
    }
    static double subtractOperation(double operand1, double operand2) {
        CalcOperation calcOperation = (number1, number2) -> number1 - number2;
        double result = calcOperation.operation(operand1, operand2);
        return result;
    }
    static double multiplyOperation(double operand1, double operand2) {
        CalcOperation calcOperation = (number1, number2) -> number1 * number2;
        double result = calcOperation.operation(operand1, operand2);
        return result;
    }
    static double divisionOperation(double operand1, double operand2) {
        CalcOperation calcOperation = (number1, number2) -> number1 / number2;
        double result = calcOperation.operation(operand1, operand2);
        return result;
    }
}
