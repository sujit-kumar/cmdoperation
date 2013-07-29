/**
 * Created with IntelliJ IDEA.
 * User: sujit
 * Date: 7/28/13
 * Time: 12:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyArithmeticExceptionProgram {
    public static void main(String ar[]){
        int firstNumber = 5;
        int secondNumber = 0;
        try {
            int finalResult = firstNumber/secondNumber;
        }
        catch (Exception e){
            System.out.print(e);
        }

    }
}
