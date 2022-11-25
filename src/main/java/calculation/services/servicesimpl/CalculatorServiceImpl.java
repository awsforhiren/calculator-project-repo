package main.java.calculation.services.servicesimpl;

import main.java.calculation.enums.OperatorEnum;
import main.java.calculation.services.CalculatorService;
import main.java.calculation.validations.CalculatorValidation;
import static java.lang.Double.parseDouble;

public class CalculatorServiceImpl {
    public double CalcResult(String inputData) throws Exception {
        double result = 0.0;
        CalculatorValidation.validateInputData(inputData);
        String inputDataArray[] = inputData.toUpperCase().split("\\s+");
        int index = 0;
        double operand1 = parseDouble(inputDataArray[index]);
        while (index < inputDataArray.length - 1) {
            OperatorEnum operation = OperatorEnum.findByName(inputDataArray[index + 1]);
            double operand2 = parseDouble(inputDataArray[index + 2]);
            switch (operation) {
                case ADDITION:
                    result = CalculatorService.addOperation(operand1, operand2);
                    break;
                case PLUS:
                    result = CalculatorService.addOperation(operand1, operand2);
                    break;
                case SUBTRACTION:
                    result = CalculatorService.subtractOperation(operand1, operand2);
                    break;
                case MINUS:
                    result = CalculatorService.subtractOperation(operand1, operand2);
                    break;
                case MULTIPLICATION:
                    result = CalculatorService.multiplyOperation(operand1, operand2);
                    break;
                case MULTIPLY:
                    result = CalculatorService.multiplyOperation(operand1, operand2);
                    break;
                case DIVISION:
                    result = CalculatorService.divisionOperation(operand1, operand2);
                    break;
                case DIVIDE:
                    result = CalculatorService.divisionOperation(operand1, operand2);
                    break;
            }
            index = index + 2;
            operand1 = result;
        }
        return result;
    }
}
