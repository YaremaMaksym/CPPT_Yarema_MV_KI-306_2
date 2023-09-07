package ki306.yarema.lab6;

import java.util.Scanner;

/**
 * Class EquationsApp Implements driver for Equations class
 * @author Yarema Maksym
 * @version 1.0
 */
public class EquationsApp {
    /**
     * Method driver
     * @param args
     */
    public static void main(String[] args) {
        Equation equation = new Equation();
        FileUtils fileUtils = new FileUtils();
        double result;
        double fileResult;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        try {
            int x = scanner.nextInt();
            result = equation.calculate(x);
            System.out.println("Result is " + result);

            fileUtils.writeResTxt("lab6/textRes.txt", result);
            fileUtils.writeResBin("lab6/binRes.bin", result);

            fileResult = fileUtils.readResBin("lab6/binRes.bin");
            System.out.println("Result from binary file is: " + fileResult);

            fileResult = fileUtils.readResTxt("lab6/textRes.txt");
            System.out.println("Result from txt file is: " + fileResult);
        }
        catch (CalcException e) {
            System.out.println(e.getMessage());
        }
    }
}