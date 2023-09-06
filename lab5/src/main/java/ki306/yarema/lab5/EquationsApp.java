package ki306.yarema.lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
        try {
            System.out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try {
                try {
                    Equation equation = new Equation();
                    System.out.println("Enter X: ");
                    fout.print(equation.calculate(in.nextInt()));
                }
                finally {
                    fout.flush();
                    fout.close();
                }
            }
            catch (CalcException e) {
                System.out.println(e.getMessage());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception reason: Perhaps wrong file path");
        }
    }
}