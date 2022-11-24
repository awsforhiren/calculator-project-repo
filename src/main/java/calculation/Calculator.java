package main.java.calculation;

import org.junit.platform.commons.util.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.lang.Double.parseDouble;

public class Calculator {
    public double CalcResult(String inputData) throws Exception {
        double result = 0.0;
        validateInputData(inputData);
        String inputDataArray[] = inputData.toUpperCase().split("\\s+");

        int index = 0;
        double operand1 = parseDouble(inputDataArray[index]);
        while (index < inputDataArray.length - 1) {
            String operation = inputDataArray[index + 1];
            double operand2 = parseDouble(inputDataArray[index + 2]);
            switch (operation) {
                case "+":
                    result = CalcOperation.addOperation(operand1, operand2);
                    break;
                case "ADDITION":
                    result = CalcOperation.addOperation(operand1, operand2);
                    break;
                case "-":
                    result = CalcOperation.subtractOperation(operand1, operand2);
                    break;
                case "SUBTRACTION":
                    result = CalcOperation.subtractOperation(operand1, operand2);
                    break;
                case "*":
                    result = CalcOperation.multiplyOperation(operand1, operand2);
                    break;
                case "MULTIPLICATION":
                    result = CalcOperation.multiplyOperation(operand1, operand2);
                    break;
                case "/":
                    result = CalcOperation.divisionOperation(operand1, operand2);
                    break;
                case "DIVISION":
                    result = CalcOperation.divisionOperation(operand1, operand2);
                    break;
            }
            index = index + 2;
            operand1 = result;
        }
        return result;
    }
    private void validateInputData(String inputData) throws Exception {
        List<String> OPERATIONS = Arrays.asList("ADDITION,SUBTRACTION,MULTIPLICATION,DIVISION,+,-,*,/".split(","));

        try {
            if(StringUtils.isBlank(inputData))
                throw new Exception("Please provide the valid input data. Please provide data in \"Operand Operation Operand \" format");

            String inputDataArray[] = inputData.toUpperCase().split("\\s+");

            List<String> errorInputDataList = new ArrayList<>();
            for(int count = 0 ; count < inputDataArray.length ; count++) {
                if(count%2 == 0 && !NumberUtils.isValid(inputDataArray[count]))
                    errorInputDataList.add(inputDataArray[count]);
                else if(count%2 != 0 && !OPERATIONS.contains(inputDataArray[count]))
                    errorInputDataList.add(inputDataArray[count]);
            }

            if(errorInputDataList != null && errorInputDataList.size() != 0)
                throw new Exception("User has provided invalid OPERAND / OPERATIONS" + errorInputDataList);
        } catch (Exception exception) {
            System.out.println("Unexpected Error Occured :: " + exception.getMessage());
            throw new Exception(exception.getMessage());
        }
    }
}
