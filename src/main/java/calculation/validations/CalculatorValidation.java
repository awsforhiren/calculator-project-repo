package main.java.calculation.validations;

import main.java.calculation.enums.OperatorEnum;
import main.java.calculation.utils.NumberUtils;
import org.junit.platform.commons.util.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalculatorValidation {
    public static void validateInputData(String inputData) throws Exception {
        List<String> OPERATIONS = Arrays.stream(OperatorEnum.values()).map(OperatorEnum::getOperator).collect(Collectors.toList());
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
                throw new Exception("User has provided invalid OPERAND/OPERATIONS" + errorInputDataList);
        } catch (Exception exception) {
            System.out.println("Unexpected Error Occured :: " + exception.getMessage());
            throw new Exception(exception.getMessage());
        }
    }
}
