package main.java.calculation;

/******************************************************************************************************************************************
 *
 * The Calculator program is complete the operation with any number of input parameters separated by space.
 * e.g. 2 + 2 MULTIPLICATION * 5 DIVISION - 3
 * System validates the above pattern. Every digit or operator after space needed to separate them.
 * It also checks if there is no input provided.
 *
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