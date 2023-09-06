package ki306.yarema.lab5;

/**
 * Class Equation implements method for y=sin(x)/(x+tg(x)) expression
 * calculation
 * @author Yarema Maksym
 * @version 1.0
 */
public class Equation {
    /**
     * Method calculates the y=sin(x)/(x+tg(x)) expression
     * @param x Angle in degrees
     */
    public double calculate(int x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;

        try {
            y = Math.sin(x)/(x + Math.tan(x));

            // If the result is not a number, we throw an exception
            if (Double.isNaN(y) || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY || x == 90 || x == -90){
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException e) {
            // create a higher-level exception with an explanation of the reason for the error
            if (rad==Math.PI/2.0 || rad==-Math.PI/2.0){
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            }
            else if (x==0) {
                throw new CalcException("Exception reason: X = 0");
            }
            else {
                throw new CalcException("Unknown reason of the exception during exception calculation");
            }
        }
        return y;
    }
}
