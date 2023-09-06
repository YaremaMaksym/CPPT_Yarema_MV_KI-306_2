package ki306.yarema.lab5;

/**
 * Class CalcException more precises ArithmeticException
 * @author Yarema Maksym
 * @version 1.0
 */

public class CalcException extends ArithmeticException{
    public CalcException(){}
    public CalcException(String cause)
    {
        super(cause);
    }

}
