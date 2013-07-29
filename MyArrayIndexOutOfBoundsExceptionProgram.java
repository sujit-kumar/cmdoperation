/**
 * Created with IntelliJ IDEA.
 * User: sujit
 * Date: 7/28/13
 * Time: 12:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyArrayIndexOutOfBoundsExceptionProgram {
    public static void main(String ar[]){
        int[] myArray = new int[5];
        try {
            myArray[7] = 56;
        }
        catch (Exception e){
            System.out.print(e);
        }

    }
}
