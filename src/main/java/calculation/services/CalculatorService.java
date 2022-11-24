package main.java.calculation.services;

@FunctionalInterface
public interface CalculatorService {
    double operation(double number, double number2);
    static double addOperation(double operand1, double operand2) {
        CalculatorService service = (number1, number2) -> number1 + number2;
        double result = service.operation(operand1, operand2);
        return result;
    }
    static double subtractOperation(double operand1, double operand2) {
        CalculatorService calcOperationService = (number1, number2) -> number1 - number2;
        double result = calcOperationService.operation(operand1, operand2);
        return result;
    }
    static double multiplyOperation(double operand1, double operand2) {
        CalculatorService calcOperationService = (number1, number2) -> number1 * number2;
        double result = calcOperationService.operation(operand1, operand2);
        return result;
    }
    static double divisionOperation(double operand1, double operand2) {
        CalculatorService calcOperationService = (number1, number2) -> number1 / number2;
        double result = calcOperationService.operation(operand1, operand2);
        return result;
    }
}
