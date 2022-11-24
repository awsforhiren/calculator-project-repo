package main.java.calculation;

/******************************************************************************************************************************************
 * The Calculator program is complete the operation with any number of input parameters separated by space.
 * Example 1 -> 2 + 2
 * Example 1 -> 2 ADDITION 2
 * Example 1 -> 2 - 2
 * Example 1 -> 2 SUBTRACTION 2
 * Example 1 -> 2 * 2
 * Example 1 -> 2 MULTIPLICATION 2
 * Example 1 -> 2 / 2
 * Example 1 -> 2 DIVISION 2
 * System validates the above pattern like format - Operand Operation Operand
 * It also checks if there is no input provided.
 * Possible Operator are - ADDITION,SUBTRACTION,MULTIPLICATION,DIVISION,+,-,*,/
 * Use any double value for the Operands
 * @Hiren Modi 25/11/2022
 * ****************************************************************************************************************************************
 */
public class Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Input ::= " + String.join(" ", args));
        Calculator calculator = new Calculator();
        double calcResult = calculator.CalcResult(String.join(" ", args));
        System.out.println("Calculator result is : " + calcResult);
    }
}