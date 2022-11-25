package main.java.calculation.enums;

import java.util.Arrays;

public enum OperatorEnum {
    ADDITION("ADDITION"),
    SUBTRACTION("SUBTRACTION"),
    MULTIPLICATION("MULTIPLICATION"),
    DIVISION("DIVISION"),
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");
    private String operator;
    OperatorEnum(String operator) {
        this.operator = operator;
    }
    public String getOperator() {
        return operator;
    }
    public static OperatorEnum findByName(String inputKey) {
        OperatorEnum resultEnum = Arrays.stream(OperatorEnum.values())
                .filter(e -> e.operator.equals(inputKey))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s.", inputKey)));
        return resultEnum;
    }
}
